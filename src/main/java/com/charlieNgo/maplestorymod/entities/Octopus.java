package com.charlieNgo.maplestorymod.entities;

import java.util.EnumSet;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class Octopus extends Monster {
    private static final EntityDataAccessor<Integer> ID_SIZE = SynchedEntityData.defineId(GreenSlime.class, EntityDataSerializers.INT);
    private float allowedHeightOffset = 0.5F;
    private int nextHeightOffsetChangeTick;
    private static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(Octopus.class, EntityDataSerializers.BYTE);

    public Octopus(EntityType<? extends Octopus> p_32219_, Level p_32220_) {
        super(p_32219_, p_32220_);
        this.xpReward = 10;
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(3, new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, (new HurtByTargetGoal(this)).setAlertOthers());
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes().add(Attributes.ATTACK_DAMAGE, 6.0D).add(Attributes.MOVEMENT_SPEED, 0.23F).add(Attributes.FOLLOW_RANGE, 48.0D);
    }

    public int getSize() {
        return this.entityData.get(ID_SIZE);
    }

    protected float getStandingEyeHeight(Pose p_33614_, EntityDimensions p_33615_) {
        return 10.625F * p_33615_.height;
    }

    public EntityDimensions getDimensions(Pose p_33597_) {
        return super.getDimensions(p_33597_).scale(1.255F * (float)this.getSize());
    }

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_FLAGS_ID, (byte)0);
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.SQUID_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_32235_) {
        return SoundEvents.SQUID_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.SQUID_DEATH;
    }

    protected void customServerAiStep() {
        --this.nextHeightOffsetChangeTick;
        if (this.nextHeightOffsetChangeTick <= 0) {
            this.nextHeightOffsetChangeTick = 0;
            this.allowedHeightOffset = 0.5F + (float)this.random.nextGaussian() * 0.5F;
        }

        super.customServerAiStep();
    }

    public boolean causeFallDamage(float p_149683_, float p_149684_, DamageSource p_149685_) {
        return false;
    }

    static class OctopusAttackGoal extends Goal {
        private final Octopus Octopus;

        public OctopusAttackGoal(Octopus p_32247_) {
            this.Octopus = p_32247_;
            this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
        }

        public boolean canUse() {
            LivingEntity livingentity = this.Octopus.getTarget();
            return livingentity != null && livingentity.isAlive() && this.Octopus.canAttack(livingentity);
        }
    }
}