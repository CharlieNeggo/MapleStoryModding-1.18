package com.charlieNgo.maplestorymod.init.AbsolabSetItems.Pirate;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleAbsolabArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleAbsolabPirateMaterial {
    public static final ArmorMaterial ABSOLAB = new MapleAbsolabArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 9, 12, 14, 9 }, 6f, 12f, MapleStoryMod.MODID + ":absolab",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.ABSOLAB_ESSENCE.get()));

    private MapleAbsolabPirateMaterial() {
    }
}
