package com.charlieNgo.maplestorymod.world;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleModEntityTypes;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)

public class MapleModEntitySpawn {

    @SubscribeEvent
    public static void spawnEntities(FMLLoadCompleteEvent event) {

        for (Biome biome : ForgeRegistries.BIOMES) {

            if (biome.getCategory() != Biome.Category.OCEAN) {
                biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(MapleModEntityTypes.MUSHROOM.get(), 30, 3, 4));

                biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(MapleModEntityTypes.GREENSLIME.get(), 30, 3, 4));

                biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(MapleModEntityTypes.BLUESNAIL.get(), 30, 3, 4));
            }

//            else if (biome.getCategory() != Biome.Category.PLAINS) {
//                biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(MapleModEntityTypes.MUSHROOM.get(), 30, 3, 4));
//
//                biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(MapleModEntityTypes.GREENSLIME.get(), 30, 3, 4));
//
//                biome.getSpawns(EntityClassification.MONSTER).add(new Biome.SpawnListEntry(MapleModEntityTypes.BLUESNAIL.get(), 30, 3, 4));
//            }
        }
    }
}
