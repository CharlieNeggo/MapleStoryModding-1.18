package com.charlieNgo.maplestorymod.entities;

import net.minecraft.block.BlockState;
import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.event.entity.player.AttackEntityEvent;

import javax.annotation.Nullable;

public class MushRoom extends MonsterEntity {

//    private EatGrassGoal eatGrassGoal;
//    private int mushroomTimer;

    public MushRoom(EntityType<? extends MonsterEntity> type, World worldIn) {
        super(type, worldIn);
    }

    // func_233666_p_ to registerAttributes
    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {

        return MonsterEntity.func_233666_p_()
                .createMutableAttribute(Attributes.MAX_HEALTH, 15.0D)
                .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.3D)
                .createMutableAttribute(Attributes.FOLLOW_RANGE, 20D)
                .createMutableAttribute(Attributes.ATTACK_DAMAGE, 2.0D);
        
    }

    //Goals for the Mushroom
    @Override
    protected void registerGoals() {
        super.registerGoals();
//        this.eatGrassGoal = new EatGrassGoal(this);
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new WaterAvoidingRandomFlyingGoal(this,1.0D));
        this.goalSelector.addGoal(2, new LookAtGoal(this, PlayerEntity.class, 6.0F));
        this.goalSelector.addGoal(3, new LookRandomlyGoal(this));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, PlayerEntity.class, true));
//        this.goalSelector.addGoal(5, this.eatGrassGoal);
    }

    @Override
    protected int getExperiencePoints(PlayerEntity player) {
        return 3 + this.world.rand.nextInt(4);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_MOOSHROOM_EAT;
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_FOX_DEATH;
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundEvents.ENTITY_FOX_HURT; }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound(SoundEvents.ENTITY_PIG_STEP, 0.15F,  1.0F);
    }

//    @Override
//    protected void updateAITasks() {
//        this.mushroomTimer = this.eatGrassGoal.getEatingGrassTimer();
//        super.updateAITasks();
//    }
//
//    @Override
//    public void livingTick() {
//        if (this.world.isRemote) {
//            this.mushroomTimer = Math.max(0, this.mushroomTimer-1);
//        }
//        super.livingTick();
//    }
//
//    @OnlyIn(Dist.CLIENT)
//    public void handStatusUpdate(byte id) {
//        if (id == 10) {
//            this.mushroomTimer = 40;
//        } else {
//            super.handleStatusUpdate(id);
//        }
//    }
}

