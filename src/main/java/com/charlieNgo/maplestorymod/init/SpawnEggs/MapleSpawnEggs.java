package com.charlieNgo.maplestorymod.init.SpawnEggs;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleSpawnEggs {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    public static final RegistryObject<ForgeSpawnEggItem> MUSHROOM_SPAWN_EGG = ITEMS.register("mushroom_spawn_egg", () ->
            new ForgeSpawnEggItem (MapleModEntityTypes.MUSHROOM, 0xF1BF7B, 0xFE7F1B, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> BLUESNAIL_SPAWN_EGG = ITEMS.register("blue_snail_spawn_egg", () ->
            new ForgeSpawnEggItem (MapleModEntityTypes.BLUESNAIL, 0xF1BF7B, 0x1B67FE, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> GREENSLIME_SPAWN_EGG = ITEMS.register("green_slime_spawn_egg", () ->
            new ForgeSpawnEggItem (MapleModEntityTypes.GREENSLIME, 0xF1BF7B, 0x1BFE30, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> OCTOPUS_SPAWN_EGG = ITEMS.register("octopus_spawn_egg", () ->
            new ForgeSpawnEggItem (MapleModEntityTypes.OCTOPUS, 0xF1BF7B, 0xB21BFE, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> MUDDY_SWAMP_MONSTER_SPAWN_EGG = ITEMS.register("muddy_swamp_monster_spawn_egg", () ->
            new ForgeSpawnEggItem (MapleModEntityTypes.MUDDYSWAMPMONSTER, 0xF1BF7B, 0x895500, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));

}
