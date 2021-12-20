package com.charlieNgo.maplestorymod.init.CraSetItems.Pirate;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleCraArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleCraPirateMaterial {
    public static final ArmorMaterial CRA = new MapleCraArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 10, 13, 17, 10 }, 0.6f, 9f, MapleStoryMod.MODID + ":cra",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.CRA.get()));

    private MapleCraPirateMaterial() {
    }
}
