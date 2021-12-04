package com.charlieNgo.maplestorymod.items;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.UseAction;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class WhitePotion extends Item {
    public WhitePotion() {
        super(new Properties().group(MapleStoryMod.TAB)
                .group(MapleStoryMod.TAB)
                .food(new Food.Builder()
                        .saturation(3.5f)
                        .effect(new EffectInstance(Effects.INSTANT_HEALTH, 1, 0), 1)
                        .setAlwaysEdible()
                        .build())
        );
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }
}