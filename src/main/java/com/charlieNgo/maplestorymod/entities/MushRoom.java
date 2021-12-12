package com.charlieNgo.maplestorymod.entities;

import java.util.EnumSet;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.phys.Vec3;

public class MushRoom extends Mob implements Enemy {
    private static final EntityDataAccessor<Integer> ID_SIZE = SynchedEntityData.defineId(MushRoom.class, EntityDataSerializers.INT);
    public float targetSquish;
    public float squish;
    public float oSquish;
    private boolean wasOnGround;

    public MushRoom(EntityType<? extends MushRoom> p_33588_, Level p_33589_) {
        super(p_33588_, p_33589_);
        this.moveControl = new MushRoom.MushRoomMoveControl(this);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new MushRoom.MushRoomFloatGoal(this));
        this.goalSelector.addGoal(2, new MushRoom.MushRoomAttackGoal(this));
        this.goalSelector.addGoal(3, new MushRoom.MushRoomRandomDirectionGoal(this));
        this.goalSelector.addGoal(5, new MushRoom.MushRoomKeepOnJumpingGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, 10, true, false, (p_33641_) -> Math.abs(p_33641_.getY() - this.getY()) <= 4.0D));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ID_SIZE, 1);
    }

    protected void setSize(int p_33594_, boolean p_33595_) {
        int i = Mth.clamp(p_33594_, 1, 1);
        this.entityData.set(ID_SIZE, i);
        this.reapplyPosition();
        this.refreshDimensions();
        this.getAttribute(Attributes.MAX_HEALTH).setBaseValue(12);
        this.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.2F + 0.1F * (float)i);
        this.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(i);
        if (p_33595_) {
            this.setHealth(this.getMaxHealth());
        }

        this.xpReward = i;
    }

    public int getSize() {
        return this.entityData.get(ID_SIZE);
    }

    public void addAdditionalSaveData(CompoundTag p_33619_) {
        super.addAdditionalSaveData(p_33619_);
        p_33619_.putInt("Size", this.getSize() - 1);
        p_33619_.putBoolean("wasOnGround", this.wasOnGround);
    }

    public void readAdditionalSaveData(CompoundTag p_33607_) {
        this.setSize(p_33607_.getInt("Size") + 1, false);
        super.readAdditionalSaveData(p_33607_);
        this.wasOnGround = p_33607_.getBoolean("wasOnGround");
    }

    protected ParticleOptions getParticleType() {
        return ParticleTypes.ITEM_SNOWBALL;
    }

    protected boolean shouldDespawnInPeaceful() {
        return this.getSize() > 0;
    }

    public void tick() {
        this.squish += (this.targetSquish - this.squish) * 0.5F;
        this.oSquish = this.squish;
        super.tick();
        if (this.onGround && !this.wasOnGround) {
            int i = this.getSize();

            if (spawnCustomParticles()) i = 0; // don't spawn particles if it's handled by the implementation itself
            for(int j = 0; j < i * 8; ++j) {
                float f = this.random.nextFloat() * ((float)Math.PI * 2F);
                float f1 = this.random.nextFloat() * 0.5F + 0.5F;
                float f2 = Mth.sin(f) * (float)i * 0.5F * f1;
                float f3 = Mth.cos(f) * (float)i * 0.5F * f1;
                this.level.addParticle(this.getParticleType(), this.getX() + (double)f2, this.getY(), this.getZ() + (double)f3, 0.0D, 0.0D, 0.0D);
            }

            this.playSound(this.getSquishSound(), this.getSoundVolume(), ((this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F) / 0.8F);
            this.targetSquish = -0.5F;
        } else if (!this.onGround && this.wasOnGround) {
            this.targetSquish = 1.0F;
        }

        this.wasOnGround = this.onGround;
        this.decreaseSquish();
    }

    protected void decreaseSquish() {
        this.targetSquish *= 0.6F;
    }

    protected int getJumpDelay() {
        return this.random.nextInt(20) + 10;
    }

    public void refreshDimensions() {
        double d0 = this.getX();
        double d1 = this.getY();
        double d2 = this.getZ();
        super.refreshDimensions();
        this.setPos(d0, d1, d2);
    }

    public void onSyncedDataUpdated(EntityDataAccessor<?> p_33609_) {
        if (ID_SIZE.equals(p_33609_)) {
            this.refreshDimensions();
            this.setYRot(this.yHeadRot);
            this.yBodyRot = this.yHeadRot;
            if (this.isInWater() && this.random.nextInt(20) == 0) {
                this.doWaterSplashEffect();
            }
        }

        super.onSyncedDataUpdated(p_33609_);
    }

    public EntityType<? extends MushRoom> getType() {
        return (EntityType<? extends MushRoom>)super.getType();
    }

    public void remove(Entity.RemovalReason p_149847_) {
        int i = this.getSize();
        if (!this.level.isClientSide && i > 1 && this.isDeadOrDying()) {
            Component component = this.getCustomName();
            boolean flag = this.isNoAi();
            float f = (float)i / 4.0F;
            int j = i / 2;
            int k = 2 + this.random.nextInt(3);

            for(int l = 0; l < k; ++l) {
                float f1 = ((float)(l % 2) - 0.5F) * f;
                float f2 = ((float)(l / 2) - 0.5F) * f;
                MushRoom MushRoom = this.getType().create(this.level);
                if (this.isPersistenceRequired()) {
                    MushRoom.setPersistenceRequired();
                }

                MushRoom.setCustomName(component);
                MushRoom.setNoAi(flag);
                MushRoom.setInvulnerable(this.isInvulnerable());
                MushRoom.moveTo(this.getX() + (double)f1, this.getY() + 0.5D, this.getZ() + (double)f2, this.random.nextFloat() * 360.0F, 0.0F);
                this.level.addFreshEntity(MushRoom);
            }
        }

        super.remove(p_149847_);
    }

    public void push(Entity p_33636_) {
        super.push(p_33636_);
        if (p_33636_ instanceof IronGolem && this.isDealsDamage()) {
            this.dealDamage((LivingEntity)p_33636_);
        }

    }

    public void playerTouch(Player p_33611_) {
        if (this.isDealsDamage()) {
            this.dealDamage(p_33611_);
        }
    }

    protected void dealDamage(LivingEntity p_33638_) {
        if (this.isAlive()) {
            int i = this.getSize();
            if (this.distanceToSqr(p_33638_) < 0.6D * (double)i * 0.6D * (double)i && this.hasLineOfSight(p_33638_) && p_33638_.hurt(DamageSource.mobAttack(this), this.getAttackDamage())) {
                this.playSound(SoundEvents.SLIME_ATTACK, 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
                this.doEnchantDamageEffects(this, p_33638_);
            }
        }
    }

    protected float getStandingEyeHeight(Pose p_33614_, EntityDimensions p_33615_) {
        return 0.625F * p_33615_.height;
    }

    protected boolean isDealsDamage() {
        return this.isEffectiveAi();
    }

    protected float getAttackDamage() {
        return (float)this.getAttributeValue(Attributes.ATTACK_DAMAGE);
    }

    protected SoundEvent getHurtSound(DamageSource p_33631_) {
        return SoundEvents.FOX_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.SLIME_DEATH;
    }

    protected SoundEvent getSquishSound() {
        return SoundEvents.SLIME_SQUISH;
    }

    protected ResourceLocation getDefaultLootTable() {
        return this.getSize() == 1 ? this.getType().getDefaultLootTable() : BuiltInLootTables.EMPTY;
    }

    protected float getSoundVolume() {
        return 0.4F * (float)this.getSize();
    }

    public int getMaxHeadXRot() {
        return 0;
    }

    protected boolean doPlayJumpSound() {
        return this.getSize() > 0;
    }

    protected void jumpFromGround() {
        Vec3 vec3 = this.getDeltaMovement();
        this.setDeltaMovement(vec3.x, this.getJumpPower(), vec3.z);
        this.hasImpulse = true;
    }

    float getSoundPitch() {
        float f = 1.4F;
        return ((this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F) * f;
    }

    protected SoundEvent getJumpSound() {
        return SoundEvents.SLIME_JUMP;
    }

    public EntityDimensions getDimensions(Pose p_33597_) {
        return super.getDimensions(p_33597_).scale(1.255F * (float)this.getSize());
    }

    protected boolean spawnCustomParticles() { return false; }

    static class MushRoomAttackGoal extends Goal {
        private final MushRoom MushRoom;
        private int growTiredTimer;

        public MushRoomAttackGoal(MushRoom p_33648_) {
            this.MushRoom = p_33648_;
            this.setFlags(EnumSet.of(Goal.Flag.LOOK));
        }

        public boolean canUse() {
            LivingEntity livingentity = this.MushRoom.getTarget();
            if (livingentity == null) {
                return false;
            } else {
                return this.MushRoom.canAttack(livingentity) && this.MushRoom.getMoveControl() instanceof MushRoomMoveControl;
            }
        }

        public void start() {
            this.growTiredTimer = reducedTickDelay(100);
            super.start();
        }

        public boolean canContinueToUse() {
            LivingEntity livingentity = this.MushRoom.getTarget();
            if (livingentity == null) {
                return false;
            } else if (!this.MushRoom.canAttack(livingentity)) {
                return false;
            } else {
                return --this.growTiredTimer > 0;
            }
        }

        public boolean requiresUpdateEveryTick() {
            return true;
        }

        public void tick() {
            LivingEntity livingentity = this.MushRoom.getTarget();
            if (livingentity != null) {
                this.MushRoom.lookAt(livingentity, 10.0F, 10.0F);
            }

            ((MushRoom.MushRoomMoveControl)this.MushRoom.getMoveControl()).setDirection(this.MushRoom.getYRot(), this.MushRoom.isDealsDamage());
        }
    }

    static class MushRoomFloatGoal extends Goal {
        private final MushRoom MushRoom;

        public MushRoomFloatGoal(MushRoom p_33655_) {
            this.MushRoom = p_33655_;
            this.setFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
            p_33655_.getNavigation().setCanFloat(true);
        }

        public boolean canUse() {
            return (this.MushRoom.isInWater() || this.MushRoom.isInLava()) && this.MushRoom.getMoveControl() instanceof MushRoom.MushRoomMoveControl;
        }

        public boolean requiresUpdateEveryTick() {
            return true;
        }

        public void tick() {
            if (this.MushRoom.getRandom().nextFloat() < 0.8F) {
                this.MushRoom.getJumpControl().jump();
            }

            ((MushRoom.MushRoomMoveControl)this.MushRoom.getMoveControl()).setWantedMovement(1.2D);
        }
    }

    static class MushRoomKeepOnJumpingGoal extends Goal {
        private final MushRoom MushRoom;

        public MushRoomKeepOnJumpingGoal(MushRoom p_33660_) {
            this.MushRoom = p_33660_;
            this.setFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
        }

        public boolean canUse() {
            return !this.MushRoom.isPassenger();
        }

        public void tick() {
            ((MushRoom.MushRoomMoveControl)this.MushRoom.getMoveControl()).setWantedMovement(1.0D);
        }
    }

    static class MushRoomMoveControl extends MoveControl {
        private float yRot;
        private int jumpDelay;
        private final MushRoom MushRoom;
        private boolean isAggressive;

        public MushRoomMoveControl(MushRoom p_33668_) {
            super(p_33668_);
            this.MushRoom = p_33668_;
            this.yRot = 180.0F * p_33668_.getYRot() / (float)Math.PI;
        }

        public void setDirection(float p_33673_, boolean p_33674_) {
            this.yRot = p_33673_;
            this.isAggressive = p_33674_;
        }

        public void setWantedMovement(double p_33671_) {
            this.speedModifier = p_33671_;
            this.operation = MoveControl.Operation.MOVE_TO;
        }

        public void tick() {
            this.mob.setYRot(this.rotlerp(this.mob.getYRot(), this.yRot, 90.0F));
            this.mob.yHeadRot = this.mob.getYRot();
            this.mob.yBodyRot = this.mob.getYRot();
            if (this.operation != MoveControl.Operation.MOVE_TO) {
                this.mob.setZza(0.0F);
            } else {
                this.operation = MoveControl.Operation.WAIT;
                if (this.mob.isOnGround()) {
                    this.mob.setSpeed((float)(this.speedModifier * this.mob.getAttributeValue(Attributes.MOVEMENT_SPEED)));
                    if (this.jumpDelay-- <= 0) {
                        this.jumpDelay = this.MushRoom.getJumpDelay();
                        if (this.isAggressive) {
                            this.jumpDelay /= 3;
                        }

                        this.MushRoom.getJumpControl().jump();
                        if (this.MushRoom.doPlayJumpSound()) {
                            this.MushRoom.playSound(this.MushRoom.getJumpSound(), this.MushRoom.getSoundVolume(), this.MushRoom.getSoundPitch());
                        }
                    } else {
                        this.MushRoom.xxa = 0.0F;
                        this.MushRoom.zza = 0.0F;
                        this.mob.setSpeed(0.0F);
                    }
                } else {
                    this.mob.setSpeed((float)(this.speedModifier * this.mob.getAttributeValue(Attributes.MOVEMENT_SPEED)));
                }

            }
        }
    }

    static class MushRoomRandomDirectionGoal extends Goal {
        private final MushRoom MushRoom;
        private float chosenDegrees;
        private int nextRandomizeTime;

        public MushRoomRandomDirectionGoal(MushRoom p_33679_) {
            this.MushRoom = p_33679_;
            this.setFlags(EnumSet.of(Goal.Flag.LOOK));
        }

        public boolean canUse() {
            return this.MushRoom.getTarget() == null && (this.MushRoom.onGround || this.MushRoom.isInWater() || this.MushRoom.isInLava() || this.MushRoom.hasEffect(MobEffects.LEVITATION)) && this.MushRoom.getMoveControl() instanceof MushRoom.MushRoomMoveControl;
        }

        public void tick() {
            if (--this.nextRandomizeTime <= 0) {
                this.nextRandomizeTime = this.adjustedTickDelay(40 + this.MushRoom.getRandom().nextInt(60));
                this.chosenDegrees = (float)this.MushRoom.getRandom().nextInt(360);
            }

            ((MushRoom.MushRoomMoveControl)this.MushRoom.getMoveControl()).setDirection(this.chosenDegrees, false);
        }
    }
}
