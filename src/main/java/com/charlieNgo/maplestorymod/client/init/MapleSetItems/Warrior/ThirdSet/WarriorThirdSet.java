package com.charlieNgo.maplestorymod.client.init.MapleSetItems.Warrior.ThirdSet;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleMithrilArmorMaterial;
import com.charlieNgo.maplestorymod.util.armor.MapleSetArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class WarriorThirdSet {
    public static final ArmorMaterial MITHRIL = new MapleMithrilArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 3, 6, 7, 3 }, 0.3f, 3f, MapleStoryMod.MODID + ":mithril",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.MITHRIL.get()));

}
