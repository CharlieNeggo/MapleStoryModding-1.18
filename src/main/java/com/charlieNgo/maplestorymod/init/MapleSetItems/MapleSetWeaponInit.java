package com.charlieNgo.maplestorymod.init.MapleSetItems;

import com.charlieNgo.maplestorymod.util.enums.weapon.MapleArcaneItemTier;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleModItemTier;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleSetWeaponInit {
    protected static final Tier MAPLE = new MapleModItemTier(15, 500, 5, 25f, 2500,
        () -> Ingredient.of(MapleModItems.MAPLE.get()));

    private MapleSetWeaponInit() {
    }
}
