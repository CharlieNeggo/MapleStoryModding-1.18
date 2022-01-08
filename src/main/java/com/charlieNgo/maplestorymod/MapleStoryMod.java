package com.charlieNgo.maplestorymod;

import com.charlieNgo.maplestorymod.blocks.MapleStoryBlocks;
import com.charlieNgo.maplestorymod.client.maplemobattributes.MapleModEntityTypes;
import com.charlieNgo.maplestorymod.enchantment.MapleModEnchantments;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.MapleAbsolabSetItems;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.MapleArcaneSetItems;
import com.charlieNgo.maplestorymod.init.Consumables.Foods.MapleConsumables;
import com.charlieNgo.maplestorymod.init.CraSetItems.MapleCRASetItems;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.init.SpawnEggs.MapleSpawnEggs;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.MapleUtgardSetItems;
import com.charlieNgo.maplestorymod.setup.MapleClientSetup;
import com.charlieNgo.maplestorymod.setup.MapleSetup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("maplestorymod")
public class MapleStoryMod {

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger("Maple Story");
    public static final String MODID = "maplestorymod";

    public MapleStoryMod() {

        // Register the deferred registry
        MapleSetup.setup();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(MapleSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(MapleClientSetup::init));

        MapleModEnchantments.ENCHANTMENTS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleStoryBlocks.BLOCK.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleConsumables.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleSpawnEggs.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleUtgardSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleArcaneSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleCRASetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleAbsolabSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleModEntityTypes.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleModItems.STRUCTURES.register(FMLJavaModLoadingContext.get().getModEventBus());
        MinecraftForge.EVENT_BUS.register(this);

    }
}

