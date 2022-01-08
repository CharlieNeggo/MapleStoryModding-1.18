package com.charlieNgo.maplestorymod.setup;

import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.charlieNgo.maplestorymod.world.structures.MapleStructures;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import org.jetbrains.annotations.NotNull;
import static com.charlieNgo.maplestorymod.MapleStoryMod.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MapleSetup {

    public static final CreativeModeTab MAPLESTORY_TAB = new CreativeModeTab(MODID) { //maplestorymod
        @Override
        public @NotNull ItemStack makeIcon() {
            return MapleModItems.ORANGEMUSHROOMCAP.get().getDefaultInstance();
        }
    };

    public static void setup() {
        IEventBus bus = MinecraftForge.EVENT_BUS;
        bus.addListener(EventPriority.NORMAL, MapleStructures::addDimensionalSpacing);
        bus.addListener(EventPriority.NORMAL, MapleStructures::setupStructureSpawns);
    }

    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            MapleStructures.setupStructures();
            MapleStructures.registerConfiguredStructures();
        });
    }
}
