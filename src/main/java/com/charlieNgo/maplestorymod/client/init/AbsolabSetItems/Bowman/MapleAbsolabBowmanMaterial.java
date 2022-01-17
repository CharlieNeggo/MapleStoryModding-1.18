package com.charlieNgo.maplestorymod.client.init.AbsolabSetItems.Bowman;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleAbsolabArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleAbsolabBowmanMaterial {
    public static final ArmorMaterial ABSOLAB = new MapleAbsolabArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 13, 1, 33, 13 }, 0.4f, 12f, MapleStoryMod.MODID + ":absolab",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.ABSOLAB_ESSENCE.get()));

    private MapleAbsolabBowmanMaterial() {
    }
}
