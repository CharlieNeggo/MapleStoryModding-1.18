package com.charlieNgo.maplestorymod.entities;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.MoveControl;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.EnumSet;

import static com.ibm.icu.util.LocalePriorityList.add;

public class MushRoom extends Mob {

    public MushRoom(EntityType<? extends Mob> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new MushRoom.MushRoomAttackGoal(this));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(5, new MushRoom.MushRoomKeepOnJumpingGoal(this));
        this.targetSelector.addGoal(1, new NearestAttackableTargetGoal<>(this, Player.class, 10, true, false, (p_33641_) ->
                Math.abs(p_33641_.getY() - this.getY()) <= 4.0D));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal<>(this, IronGolem.class, true));
    }

    @Override
    protected int getExperienceReward(Player player) {
        return this.xpReward;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.SLIME_DEATH_SMALL;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.FOX_HURT; }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.SLIME_SQUISH, 0.15F,  1.0F);
    }

    static class MushRoomAttackGoal extends Goal {
        private final MushRoom MushRoom;

        public MushRoomAttackGoal(MushRoom p_33648_) {
            this.MushRoom = p_33648_;
            this.setFlags(EnumSet.of(Goal.Flag.LOOK));
        }

        @Override
        public boolean canUse() {
            return false;
        }

        public boolean requiresUpdateEveryTick() {
            return true;
        }
    }

    static class MushRoomKeepOnJumpingGoal extends Goal {
        private final MushRoom MushRoom;

        public MushRoomKeepOnJumpingGoal(MushRoom p_33660_) {
            this.MushRoom = p_33660_;
            this.setFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
        }

        @Override
        public boolean canUse() {
            return true;
        }


        class MushRoomMoveControl extends MoveControl {
            private final MushRoom mushroom;

            public MushRoomMoveControl(MushRoom p_33668_) {
                super(p_33668_);
                this.mushroom = p_33668_;
            }

            public MushRoomMoveControl(Mob p_24983_, MushRoom mushroom) {
                super(p_24983_);
                this.mushroom = mushroom;
            }
        }
    }
}