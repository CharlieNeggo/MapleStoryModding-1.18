package com.charlieNgo.maplestorymod.init.ArcaneSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleArcaneArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleArcaneMaterialInit {
    public static final ArmorMaterial ARCANE = new MapleArcaneArmorMaterial(100, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 20, 35, 50, 27 }, 25f, 15f, MapleStoryMod.MODID + ":arcane",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.ARCANE_ESSENCE.get()));

    private MapleArcaneMaterialInit() {
    }
}
