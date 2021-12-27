package com.charlieNgo.maplestorymod.init.SpawnEggs;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.maplemobattributes.MapleModEntityTypes;
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
    public static final RegistryObject<ForgeSpawnEggItem> SMIRKY_GHOST_STUMP_SPAWN_EGG = ITEMS.register("smirky_ghost_stump_spawn_egg", () ->
            new ForgeSpawnEggItem (MapleModEntityTypes.SMIRKYGHOSTSTUMP, 0xF1BF7B, 0xA27437, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> COPPER_DRAKE_SPAWN_EGG = ITEMS.register("copper_drake_spawn_egg", () ->
            new ForgeSpawnEggItem (MapleModEntityTypes.COPPERDRAKE, 0xF1BF7B, 0x0A3E00, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> WOODEN_MASK_EGG = ITEMS.register("wooden_mask_spawn_egg", () ->
            new ForgeSpawnEggItem (MapleModEntityTypes.WOODENMASK, 0xF1BF7B, 0xE0C58C, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));

}
