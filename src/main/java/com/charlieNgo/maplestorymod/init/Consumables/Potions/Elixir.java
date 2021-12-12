package com.charlieNgo.maplestorymod.init.Consumables.Potions;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class Elixir extends Item {
    public Elixir () {
        super(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).
                fast().alwaysEat().effect(new MobEffectInstance(MobEffects.HEAL, 3), 3).build()));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }
}

