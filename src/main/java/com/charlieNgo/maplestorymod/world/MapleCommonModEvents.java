package com.charlieNgo.maplestorymod.world;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.*;
import com.charlieNgo.maplestorymod.init.SpawnEggs.MapleModEntityTypes;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MapleCommonModEvents {

    @SubscribeEvent
    public static void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            SpawnPlacements.register(MapleModEntityTypes.BLUESNAIL.get(), SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.WORLD_SURFACE, BlueSnail::canSpawnBlueSnail);
            SpawnPlacements.register(MapleModEntityTypes.MUSHROOM.get(), SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.WORLD_SURFACE, MushRoom::canSpawnMushRoom);
            SpawnPlacements.register(MapleModEntityTypes.MUDDYSWAMPMONSTER.get(), SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.WORLD_SURFACE, MuddySwampMonster::canSpawnMuddySwampMonster);
            SpawnPlacements.register(MapleModEntityTypes.OCTOPUS.get(), SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.WORLD_SURFACE, Octopus::canSpawnOctopus);
            SpawnPlacements.register(MapleModEntityTypes.GREENSLIME.get(), SpawnPlacements.Type.ON_GROUND,
                    Heightmap.Types.WORLD_SURFACE, GreenSlime::canSpawnGreenSlime);
        });
    }
}