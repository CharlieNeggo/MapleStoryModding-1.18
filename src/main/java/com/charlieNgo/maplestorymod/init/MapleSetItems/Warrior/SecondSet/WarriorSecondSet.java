package com.charlieNgo.maplestorymod.init.MapleSetItems.Warrior.SecondSet;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleSetArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class WarriorSecondSet {
    public static final ArmorMaterial MAPLE = new MapleSetArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 3, 4, 6, 3 }, 0.1f, 0.1f, MapleStoryMod.MODID + ":maple",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.MAPLE.get()));


    private WarriorSecondSet() {
    }
}
