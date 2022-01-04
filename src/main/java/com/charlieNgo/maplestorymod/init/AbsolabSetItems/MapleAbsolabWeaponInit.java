package com.charlieNgo.maplestorymod.init.AbsolabSetItems;

import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.weapon.MapleAbsolabItemTier;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleAbsolabWeaponInit {
    protected static final Tier ABSOLAB = new MapleAbsolabItemTier(4f, 20, 5, 25f, 2500,
        () -> Ingredient.of(MapleModItems.ABSOLAB_ESSENCE.get()));

    private MapleAbsolabWeaponInit() {
    }
}
