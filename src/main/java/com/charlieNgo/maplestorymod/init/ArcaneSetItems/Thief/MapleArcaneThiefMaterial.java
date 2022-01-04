package com.charlieNgo.maplestorymod.init.ArcaneSetItems.Thief;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleArcaneArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleArcaneThiefMaterial {
    public static final ArmorMaterial ARCANE = new MapleArcaneArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 20, 1, 48, 20 }, 1.4f, 15f, MapleStoryMod.MODID + ":arcane",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.ARCANE_ESSENCE.get()));

    private MapleArcaneThiefMaterial() {
    }
}
