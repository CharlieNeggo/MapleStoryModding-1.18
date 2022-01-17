package com.charlieNgo.maplestorymod.client.init.Consumables.Potions;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.setup.MapleSetup;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class ReindeerMilk extends Item {
    public ReindeerMilk () {
        super(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).
                fast().alwaysEat().effect(new MobEffectInstance(MobEffects.HEAL, 2), 2).build()));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }
}
