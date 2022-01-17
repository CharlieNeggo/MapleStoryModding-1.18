package com.charlieNgo.maplestorymod.client.init.CraSetItems;

import com.charlieNgo.maplestorymod.client.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.weapon.MapleArcaneItemTier;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleCraWeaponInit {
    protected static final Tier CRA = new MapleArcaneItemTier(3, 20, 5, 25f, 2500,
        () -> Ingredient.of(MapleModItems.CRA.get()));

    private MapleCraWeaponInit() {
    }
}
