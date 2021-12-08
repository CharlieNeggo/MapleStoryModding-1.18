package com.charlieNgo.maplestorymod.events.MapleMobsAttributes;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.BlueSnailModel;
import com.charlieNgo.maplestorymod.client.model.GreenSlimeModel;
import com.charlieNgo.maplestorymod.client.model.MushRoomModel;
import com.charlieNgo.maplestorymod.client.render.BlueSnailRender;
import com.charlieNgo.maplestorymod.client.render.GreenSlimeRender;
import com.charlieNgo.maplestorymod.client.render.MushRoomRender;
import com.charlieNgo.maplestorymod.init.SpawnEggs.MapleModEntityTypes;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MapleClientModEvents {

    public MapleClientModEvents() {
    }

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MushRoomModel.LAYER_LOCATION, MushRoomModel::createBodyLayer);
        event.registerLayerDefinition(GreenSlimeModel.LAYER_LOCATION, GreenSlimeModel::createBodyLayer);
        event.registerLayerDefinition(BlueSnailModel.LAYER_LOCATION, BlueSnailModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
//        event.registerEntityRenderer(MapleModEntityTypes.BLUESNAIL.get(), BlueSnailRender::new);
        event.registerEntityRenderer(MapleModEntityTypes.GREENSLIME.get(), GreenSlimeRender::new);
        event.registerEntityRenderer(MapleModEntityTypes.MUSHROOM.get(), MushRoomRender::new);

    }
}
