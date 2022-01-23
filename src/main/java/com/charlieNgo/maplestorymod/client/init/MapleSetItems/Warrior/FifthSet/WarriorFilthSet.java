package com.charlieNgo.maplestorymod.client.init.MapleSetItems.Warrior.FifthSet;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleDarkCrystalArmorMaterial;
import com.charlieNgo.maplestorymod.util.armor.MapleSetArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class WarriorFilthSet {
    public static final ArmorMaterial DARK_CRYSTAL = new MapleDarkCrystalArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 5, 1, 15, 5 }, 0.5f, 5f, MapleStoryMod.MODID + ":dark_crystal",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.DARK_CRYSTAL.get()));

}
