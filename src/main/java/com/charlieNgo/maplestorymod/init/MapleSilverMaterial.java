package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleSetArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleSilverMaterial {
    public static final ArmorMaterial SILVER = new MapleSetArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 2, 5, 6, 2 }, 3f, 3f, MapleStoryMod.MODID + ":maple",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.SILVER.get()));


    private MapleSilverMaterial() {
    }
}
