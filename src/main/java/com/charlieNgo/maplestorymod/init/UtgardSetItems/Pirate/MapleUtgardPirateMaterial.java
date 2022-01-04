package com.charlieNgo.maplestorymod.init.UtgardSetItems.Pirate;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleUtgardArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleUtgardPirateMaterial {
    public static final ArmorMaterial UTGARD = new MapleUtgardArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 7, 1, 23, 7 }, 0.5f, 6f, MapleStoryMod.MODID + ":utgard",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.UTGARD.get()));

    private MapleUtgardPirateMaterial() {
    }
}
