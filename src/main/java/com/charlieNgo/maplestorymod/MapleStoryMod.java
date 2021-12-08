package com.charlieNgo.maplestorymod;

import com.charlieNgo.maplestorymod.init.AbsolabSetItems.MapleAbsolabSetItems;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.MapleArcaneSetItems;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.init.SpawnEggs.MapleModEntityTypes;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.MapleUtgardSetItems;
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
        public static final String MODID = "maplestorymod";

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger("Maple Story");
    public static final String MOD_ID = "maplestorymod";

    public MapleStoryMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MapleModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleUtgardSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleArcaneSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleAbsolabSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleModEntityTypes.ENTITIES.register(FMLJavaModLoadingContext.get().getModEventBus());
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

    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
}

