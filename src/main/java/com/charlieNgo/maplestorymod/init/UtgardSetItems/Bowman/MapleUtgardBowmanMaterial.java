package com.charlieNgo.maplestorymod.init.UtgardSetItems.Bowman;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleUtgardArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleUtgardBowmanMaterial {
    public static final ArmorMaterial UTGARD = new MapleUtgardArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 6, 9, 11, 6 }, 0.2f, 6f, MapleStoryMod.MODID + ":utgard",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.UTGARD.get()));

    private MapleUtgardBowmanMaterial() {
    }
}
