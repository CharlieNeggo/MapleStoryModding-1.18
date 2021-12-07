package com.charlieNgo.maplestorymod.init.SpawnEggs;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleSpawnEggs {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    public static final RegistryObject<ForgeSpawnEggItem> BLUE_SNAIL_SPAWN_EGG = ITEMS.register("blue_snail_spawn_egg", () ->
            new ForgeSpawnEggItem(MapleModEntityTypes.BLUESNAIL, 0xF1BF7B, 0x3C4EED, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> GREEN_SLIME_SPAWN_EGG = ITEMS.register("green_slime_spawn_egg", () ->
            new ForgeSpawnEggItem(MapleModEntityTypes.GREENSLIME, 0xF1BF7B, 0x4AED3C, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> MUSHROOM_SPAWN_EGG = ITEMS.register("mushroom_spawn_egg", () ->
            new ForgeSpawnEggItem (MapleModEntityTypes.MUSHROOM, 0xF1BF7B, 0x705128, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
}
