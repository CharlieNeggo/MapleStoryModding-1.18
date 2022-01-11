package com.charlieNgo.maplestorymod.setup;

import com.charlieNgo.maplestorymod.world.structures.HenesyStructure;
import com.charlieNgo.maplestorymod.world.structures.LithHarborStructure;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.charlieNgo.maplestorymod.MapleStoryMod.MODID;

public class MapleRegistry {
    public static final DeferredRegister<StructureFeature<?>> STRUCTURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, MODID);

    public static void init() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MapleRegistry.STRUCTURES.register(FMLJavaModLoadingContext.get().getModEventBus());

    }
    //Structures and towns
    public static final RegistryObject<StructureFeature<JigsawConfiguration>> HENESY = STRUCTURES.register("henesy", HenesyStructure::new);
    public static final RegistryObject<StructureFeature<JigsawConfiguration>> LITH_HARBOR = STRUCTURES.register("lith_harbor", LithHarborStructure::new);
}
