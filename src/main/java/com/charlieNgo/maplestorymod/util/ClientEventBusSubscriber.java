package com.charlieNgo.maplestorymod.util;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.render.BlueSnailRender;
import com.charlieNgo.maplestorymod.client.render.GreenSlimeRender;
import com.charlieNgo.maplestorymod.client.render.MushRoomRender;
import com.charlieNgo.maplestorymod.init.MapleModEntityTypes;
import com.charlieNgo.maplestorymod.items.MapleModSpawnEggItem;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(MapleModEntityTypes.MUSHROOM.get(), MushRoomRender::new);
    }

    @SubscribeEvent
    public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
        MapleModSpawnEggItem.initSpawnEggs();
    }

    @Mod.EventBusSubscriber(modid = MapleStoryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class BlueSnailClientEventBusSubscriber {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            RenderingRegistry.registerEntityRenderingHandler(MapleModEntityTypes.BLUESNAIL.get(), BlueSnailRender::new);
        }

        @SubscribeEvent
        public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
            MapleModSpawnEggItem.initSpawnEggs();
        }
    }

    @Mod.EventBusSubscriber(modid = MapleStoryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class GreenSlimeClientEventBusSubscriber {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            RenderingRegistry.registerEntityRenderingHandler(MapleModEntityTypes.GREENSLIME.get(), GreenSlimeRender::new);
        }

        @SubscribeEvent
        public static void onRegisterEntities(final RegistryEvent.Register<EntityType<?>> event) {
            MapleModSpawnEggItem.initSpawnEggs();
        }
    }
}
