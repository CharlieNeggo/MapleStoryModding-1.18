package com.charlieNgo.maplestorymod;

import com.charlieNgo.maplestorymod.init.*;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.MapleUtgardSetItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("maplestorymod")
public class MapleStoryMod
{

    public static final CreativeModeTab MAPLESTORYMOD= new CreativeModeTab("maplestorymod") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(MapleModItems.ORANGEMUSHROOMCAP.get());
        }
    };

    // Directly reference a log4j logger.
    public static final Logger LOGGER =
            LogManager.getLogger("Maple Story");

    public static final String MOD_ID = "maplestorymod";

    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    public MapleStoryMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        MapleModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleUtgardSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleArcaneSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleAbsolabSetItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        MapleModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MapleStoryMod.MOD_ID);

    private void setup(final FMLCommonSetupEvent event) {
//        DeferredWorkQueue.runLater(() -> {
//            GlobalEntityTypeAttributes.put(MapleModEntityTypes.MUSHROOM.get(), MushRoom.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(MapleModEntityTypes.BLUESNAIL.get(), BlueSnail.setCustomAttributes().create());
//            GlobalEntityTypeAttributes.put(MapleModEntityTypes.GREENSLIME.get(), GreenSlime.setCustomAttributes().create());
//        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {

    }
}

