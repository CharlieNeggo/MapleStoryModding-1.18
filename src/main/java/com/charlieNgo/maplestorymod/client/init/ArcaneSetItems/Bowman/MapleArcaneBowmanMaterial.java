package com.charlieNgo.maplestorymod.client.init.ArcaneSetItems.Bowman;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleArcaneArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleArcaneBowmanMaterial {
    public static final ArmorMaterial ARCANE = new MapleArcaneArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 19, 1, 45, 19 }, 0.5f, 15f, MapleStoryMod.MODID + ":arcane",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.ARCANE_ESSENCE.get()));

    private MapleArcaneBowmanMaterial() {
    }
}
