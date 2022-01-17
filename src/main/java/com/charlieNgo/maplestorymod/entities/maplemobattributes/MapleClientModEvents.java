package com.charlieNgo.maplestorymod.entities.maplemobattributes;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.model.*;
import com.charlieNgo.maplestorymod.entities.render.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MapleClientModEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MushRoomModel.LAYER_LOCATION, MushRoomModel::createBodyLayer);
        event.registerLayerDefinition(GreenSlimeModel.LAYER_LOCATION, GreenSlimeModel::createBodyLayer);
        event.registerLayerDefinition(BlueSnailModel.LAYER_LOCATION, BlueSnailModel::createBodyLayer);
        event.registerLayerDefinition(OctopusModel.LAYER_LOCATION, OctopusModel::createBodyLayer);
        event.registerLayerDefinition(MuddySwampMonsterModel.LAYER_LOCATION, MuddySwampMonsterModel::createBodyLayer);
        event.registerLayerDefinition(SmirkyGhostStumpModel.LAYER_LOCATION, SmirkyGhostStumpModel::createBodyLayer);
        event.registerLayerDefinition(CopperDrakeModel.LAYER_LOCATION, CopperDrakeModel::createBodyLayer);
        event.registerLayerDefinition(WoodenMaskModel.LAYER_LOCATION, WoodenMaskModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(MapleModEntityTypes.BLUESNAIL.get(), BlueSnailRender::new);
        event.registerEntityRenderer(MapleModEntityTypes.GREENSLIME.get(), GreenSlimeRender::new);
        event.registerEntityRenderer(MapleModEntityTypes.MUSHROOM.get(), MushRoomRender::new);
        event.registerEntityRenderer(MapleModEntityTypes.OCTOPUS.get(), OctopusRender::new);
        event.registerEntityRenderer(MapleModEntityTypes.MUDDYSWAMPMONSTER.get(), MuddySwampMonsterRender::new);
        event.registerEntityRenderer(MapleModEntityTypes.SMIRKYGHOSTSTUMP.get(), SmirkyGhostStumpRender::new);
        event.registerEntityRenderer(MapleModEntityTypes.COPPERDRAKE.get(), CopperDrakeRender::new);
        event.registerEntityRenderer(MapleModEntityTypes.WOODENMASK.get(), WoodenMaskRender::new);

    }
}
