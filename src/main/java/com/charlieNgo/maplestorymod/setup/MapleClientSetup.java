package com.charlieNgo.maplestorymod.setup;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.world.structures.MapleStructures;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MapleClientSetup {

    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            MapleStructures.setupStructures();
            MapleStructures.registerConfiguredStructures();
        });
    }
}
