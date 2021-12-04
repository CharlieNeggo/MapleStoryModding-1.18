package com.charlieNgo.maplestorymod.items;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MeltingCheese extends Item {

        public MeltingCheese() {
            super(new Item.Properties()
                    .group(MapleStoryMod.TAB)
                    .food(new Food.Builder()
                            .hunger(4)
                            .saturation(1.0f)
                            .effect(new EffectInstance(Effects.INSTANT_HEALTH, 1, 0), 1.0f)
                            .setAlwaysEdible()
                            .build())
            );
        }
    }
