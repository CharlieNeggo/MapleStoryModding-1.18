package com.charlieNgo.maplestorymod.init.AbsolabSetItems;

import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleAbsolabItemTier;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleUtgardItemTier;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleAbsolabWeaponInit {
    protected static final Tier ABSOLAB = new MapleAbsolabItemTier(15f, 500, 5, 25f, 2500,
        () -> Ingredient.of(MapleModItems.ABSOLAB_ESSENCE.get()));

    private MapleAbsolabWeaponInit() {
    }
}
