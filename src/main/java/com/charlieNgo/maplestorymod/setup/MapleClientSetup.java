package com.charlieNgo.maplestorymod.setup;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.world.MapleBiomeProvider;
import com.charlieNgo.maplestorymod.world.MapleChunkGenerator;
import com.charlieNgo.maplestorymod.world.OreGeneration;
import com.charlieNgo.maplestorymod.world.structures.MapleStructures;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MapleClientSetup {

    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            MapleStructures.setupStructures();
            MapleStructures.registerConfiguredStructures();

            event.enqueueWork(() -> {
                Registry.register(Registry.CHUNK_GENERATOR, new ResourceLocation(MapleStoryMod.MODID, "chunkgen"),
                        MapleChunkGenerator.CODEC);
                Registry.register(Registry.BIOME_SOURCE, new ResourceLocation(MapleStoryMod.MODID, "biomes"),
                        MapleBiomeProvider.CODEC);
                event.enqueueWork(OreGeneration::registerOres);
            });
        });
    }
}
