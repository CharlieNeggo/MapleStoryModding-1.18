package com.charlieNgo.maplestorymod.init.UtgardSetItems;

import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.util.weapon.MapleUtgardItemTier;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class MapleUtgardWeaponInit {
    protected static final Tier UTGARD = new MapleUtgardItemTier(2f, 20, 5, 25f, 2500,
        () -> Ingredient.of(MapleModItems.UTGARD.get()));

    private MapleUtgardWeaponInit() {
    }
}
