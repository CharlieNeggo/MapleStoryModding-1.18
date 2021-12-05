package com.charlieNgo.maplestorymod.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.IForgeShearable;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class MushRoom extends Slime implements Enemy, IForgeShearable {
    public MushRoom(EntityType<? extends MushRoom> entityType, Level level) {
        super(entityType, level);
        this.xpReward = 3;
    }

    // func_233666_p_ to registerAttributes
        public static AttributeSupplier.Builder registerAttributes() {
            return Mob.createMobAttributes()
                    .add(Attributes.MAX_HEALTH, 15.0D)
                    .add(Attributes.MOVEMENT_SPEED, 0.2F)
                    .add(Attributes.ATTACK_DAMAGE, 5.0D)
                    .add(Attributes.ARMOR, 8.0D);
        
    }

    //Goals for the Mushroom
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.targetSelector.addGoal(2, new MushRoom.MushRoomNearestAttackableTargetGoal<>(Player.class));
        this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, Player.class, 10.0F));
    }

    class MushRoomNearestAttackableTargetGoal<T extends LivingEntity> extends NearestAttackableTargetGoal<T> {
        public MushRoomNearestAttackableTargetGoal(Class<T> targetClassIn, @Nullable Predicate<LivingEntity> targetPredicate) {
            super(MushRoom.this, targetClassIn, 10, true, false, targetPredicate);
        }

        public MushRoomNearestAttackableTargetGoal(Class<T> targetClassIn) {
            super(MushRoom.this, targetClassIn, true);
        }

        @Override
        public boolean canUse() {
            return MushRoom.this.isAggressive() && super.canUse();
        }
    }

    @Override
    protected int getExperienceReward(Player player) {
        return this.xpReward;
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.FOX_AMBIENT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.FOX_DEATH;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.FOX_HURT; }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.PIG_STEP, 0.15F,  1.0F);
    }
}

