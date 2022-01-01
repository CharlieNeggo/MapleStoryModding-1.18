package com.charlieNgo.maplestorymod.init.MapleSetItems.Warrior.ThirdSet;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleSetArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class WarriorThirdSet {
    public static final ArmorMaterial MAPLE = new MapleSetArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 4, 5, 6, 4 }, 3f, 3f, MapleStoryMod.MODID + ":maple",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.MAPLE.get()));


    private WarriorThirdSet() {
    }
}
