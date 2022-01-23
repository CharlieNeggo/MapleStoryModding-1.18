package com.charlieNgo.maplestorymod.client.init.MapleSetItems.Warrior.FirstSet;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleSilverArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class WarriorFirstSet {
    public static final ArmorMaterial SILVER = new MapleSilverArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 2, 3, 4, 2 }, 0.1f, 1f, MapleStoryMod.MODID + ":silver",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.SILVER.get()));

}
