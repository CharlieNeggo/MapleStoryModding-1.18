package com.charlieNgo.maplestorymod.entities.mobs;

import com.charlieNgo.maplestorymod.entities.maplespawnbasic.MapleMonster;
import net.minecraft.world.entity.*;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Random;

public class SmirkyGhostStump extends MapleMonster {
    private int life;

    public SmirkyGhostStump(EntityType<? extends SmirkyGhostStump> p_32591_, Level p_32592_) {
        super(p_32591_, p_32592_);
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

    protected float getStandingEyeHeight(Pose p_32604_, EntityDimensions p_32605_) {
        return 1F;
    }

    protected Entity.MovementEmission getMovementEmission() {
        return Entity.MovementEmission.EVENTS;
    }

    protected SoundEvent getAmbientSound() {
        return SoundEvents.FOX_AMBIENT;
    }

    protected SoundEvent getHurtSound(DamageSource p_32615_) {
        return SoundEvents.FOX_HURT;
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.FOX_DEATH;
    }

    protected void playStepSound(BlockPos p_32607_, BlockState p_32608_) {
        this.playSound(SoundEvents.SHEEP_STEP, 0.15F, 1.0F);
    }

    public void readAdditionalSaveData(CompoundTag p_32595_) {
        super.readAdditionalSaveData(p_32595_);
        this.life = p_32595_.getInt("Lifetime");
    }

    public void addAdditionalSaveData(CompoundTag p_32610_) {
        super.addAdditionalSaveData(p_32610_);
        p_32610_.putInt("Lifetime", this.life);
    }

    public void setYBodyRot(float p_32621_) {
        this.setYRot(p_32621_);
        super.setYBodyRot(p_32621_);
    }

    public double getMyRidingOffset() {
        return 0.1D;
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public static boolean canSpawnSmirkyGhostStump(EntityType<SmirkyGhostStump> entity, LevelAccessor levelAccess,
                                            MobSpawnType spawnType, BlockPos pos, Random random) {
        return checkMobSpawnRules(entity, levelAccess, spawnType, pos, random) && pos.getY() > 30;
    }
}