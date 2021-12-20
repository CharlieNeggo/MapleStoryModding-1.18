package com.charlieNgo.maplestorymod;

import com.charlieNgo.maplestorymod.blocks.MapleStoryBlocks;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.MapleAbsolabSetItems;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.MapleArcaneSetItems;
import com.charlieNgo.maplestorymod.init.Consumables.Foods.MapleConsumables;
import com.charlieNgo.maplestorymod.init.CraSetItems.MapleCRASetItems;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.init.SpawnEggs.MapleModEntityTypes;
import com.charlieNgo.maplestorymod.init.SpawnEggs.MapleSpawnEggs;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.MapleUtgardSetItems;
import com.charlieNgo.maplestorymod.slots.MapleSlot;
import com.charlieNgo.maplestorymod.world.MapleBiomeProvider;
import com.charlieNgo.maplestorymod.world.MapleChunkGenerator;
import com.charlieNgo.maplestorymod.world.OreGeneration;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("maplestorymod")
public class MapleStoryMod {

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger("Maple Story");
    public static final String MODID = "maplestorymod";
    public MapleStoryMod() {

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MapleStoryBlocks.BLOCK.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleConsumables.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleSpawnEggs.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleUtgardSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleArcaneSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleCRASetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleAbsolabSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleModEntityTypes.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleSlot.SHOULDER.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

    }

    public static final CreativeModeTab MAPLESTORY_TAB = new CreativeModeTab(MODID) { //maplestorymod
        @Override
        public ItemStack makeIcon() {
            return MapleModItems.ORANGEMUSHROOMCAP.get().getDefaultInstance();
        }
    };

    private void setup(final FMLCommonSetupEvent event) {

        event.enqueueWork(() -> {
            Registry.register(Registry.CHUNK_GENERATOR, new ResourceLocation(MapleStoryMod.MODID, "chunkgen"),
                    MapleChunkGenerator.CODEC);
            Registry.register(Registry.BIOME_SOURCE, new ResourceLocation(MapleStoryMod.MODID, "biomes"),
                    MapleBiomeProvider.CODEC);

            event.enqueueWork(OreGeneration::registerOres);
        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
}

