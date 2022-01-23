package com.charlieNgo.maplestorymod.client.init.MapleSetItems.Warrior.BeginnerSet;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleBronzeArmorMaterial;
import com.charlieNgo.maplestorymod.util.armor.MapleSetArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class WarriorBeginnerSet {
    public static final ArmorMaterial BRONZE = new MapleBronzeArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 2, 2, 3, 2 }, 0f, 0f, MapleStoryMod.MODID + ":bronze",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.BRONZE.get()));

}
