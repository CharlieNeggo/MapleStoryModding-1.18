package com.charlieNgo.maplestorymod.client.init.CraSetItems.Bowman;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.armor.MapleCraArmorMaterial;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleCraBowmanMaterial {
    public static final ArmorMaterial CRA = new MapleCraArmorMaterial(20, new int[] { 950, 1400, 1800, 1000 },
            new int[] { 1, 12, 22, 9 }, 0.3f, 9f, MapleStoryMod.MODID + ":cra",
            SoundEvents.ARMOR_EQUIP_GENERIC, () -> Ingredient.of(MapleModItems.CRA.get()));

    private MapleCraBowmanMaterial() {
    }
}
