package com.charlieNgo.maplestorymod.client.init.MapleSetItems.Warrior.SecondSet;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleSetArmorMaterial;
import com.charlieNgo.maplestorymod.util.armor.MapleSteelArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class WarriorSecondSet {
    public static final ArmorMaterial STEEL = new MapleSteelArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 2, 5, 6, 2 }, 0.2f, 1f, MapleStoryMod.MODID + ":steel",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.STEEL.get()));

}
