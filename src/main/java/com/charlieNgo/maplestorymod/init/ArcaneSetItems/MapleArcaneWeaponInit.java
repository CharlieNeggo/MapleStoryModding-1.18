package com.charlieNgo.maplestorymod.init.ArcaneSetItems;

import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.weapon.MapleArcaneItemTier;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleArcaneWeaponInit {
    protected static final Tier ARCANE = new MapleArcaneItemTier(5, 20, 5, 25f, 2500,
        () -> Ingredient.of(MapleModItems.ARCANE_ESSENCE.get()));

    private MapleArcaneWeaponInit() {
    }
}
