package com.charlieNgo.maplestorymod.client.init.UtgardSetItems.Thief;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleUtgardArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleUtgardThiefMaterial {
    public static final ArmorMaterial UTGARD = new MapleUtgardArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 7, 1, 22, 7 }, 1f, 6f, MapleStoryMod.MODID + ":utgard",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.UTGARD.get()));

    private MapleUtgardThiefMaterial() {
    }
}
