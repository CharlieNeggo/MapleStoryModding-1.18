package com.charlieNgo.maplestorymod.client.init.MapleSetItems;

import com.charlieNgo.maplestorymod.util.weapon.MapleModItemTier;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleSetWeaponInit {
    protected static final Tier MAPLE = new MapleModItemTier(1, 20, 5, 25f, 2500,
        () -> Ingredient.of(MapleModItems.MAPLE.get()));

    private MapleSetWeaponInit() {
    }
}
