package com.charlieNgo.maplestorymod.world;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.maplemobattributes.MapleModEntityTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.function.Supplier;


@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class MapleCommonForgeEvents {
    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public static void biomeLoading(BiomeLoadingEvent event) {
        final List<Supplier<PlacedFeature>> features = event.getGeneration()
                .getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES);

        OreGeneration.OVERWORLD_ORES.forEach(ore -> features.add(() -> ore));

        if (event.getName().equals(new ResourceLocation("minecraft:plains"))) {
            event.getSpawns().addSpawn(MobCategory.MONSTER,
                    new MobSpawnSettings.SpawnerData(MapleModEntityTypes.BLUESNAIL.get(), 15, 5, 20));
        }
        if (event.getName().equals(new ResourceLocation("minecraft:plains"))) {
            event.getSpawns().addSpawn(MobCategory.MONSTER,
                    new MobSpawnSettings.SpawnerData(MapleModEntityTypes.MUSHROOM.get(), 15, 5, 20));
        }
        if (event.getName().equals(new ResourceLocation("minecraft:swamp"))) {
            event.getSpawns().addSpawn(MobCategory.MONSTER,
                    new MobSpawnSettings.SpawnerData(MapleModEntityTypes.MUDDYSWAMPMONSTER.get(), 20, 5, 25));
        }
        if (event.getName().equals(new ResourceLocation("minecraft:plains"))) {
            event.getSpawns().addSpawn(MobCategory.MONSTER,
                    new MobSpawnSettings.SpawnerData(MapleModEntityTypes.OCTOPUS.get(), 15, 5, 20));
        }
        if (event.getName().equals(new ResourceLocation("minecraft:plains"))) {
            event.getSpawns().addSpawn(MobCategory.MONSTER,
                    new MobSpawnSettings.SpawnerData(MapleModEntityTypes.GREENSLIME.get(), 15, 5, 20));
        }
        if (event.getName().equals(new ResourceLocation("minecraft:desert"))) {
            event.getSpawns().addSpawn(MobCategory.MONSTER,
                    new MobSpawnSettings.SpawnerData(MapleModEntityTypes.SMIRKYGHOSTSTUMP.get(), 15, 5, 20));
        }
        if (event.getName().equals(new ResourceLocation("minecraft:desert"))) {
            event.getSpawns().addSpawn(MobCategory.MONSTER,
                    new MobSpawnSettings.SpawnerData(MapleModEntityTypes.WOODENMASK.get(), 15, 5, 20));
        }
        if (event.getName().equals(new ResourceLocation("minecraft:dark_forest"))) {
            event.getSpawns().addSpawn(MobCategory.MONSTER,
                    new MobSpawnSettings.SpawnerData(MapleModEntityTypes.COPPERDRAKE.get(), 15, 5, 20));
        }
    }
}
