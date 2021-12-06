package com.charlieNgo.maplestorymod.init.CraSetItems;

import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleArcaneItemTier;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleCraWeaponInit {
    protected static final Tier CRA = new MapleArcaneItemTier(15, 500, 5, 25f, 2500,
        () -> Ingredient.of(MapleModItems.CRA.get()));

    private MapleCraWeaponInit() {
    }
}
