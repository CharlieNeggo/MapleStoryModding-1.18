package com.charlieNgo.maplestorymod.world;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.blocks.MapleStoryBlocks;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

public class OreGeneration {

    public static final List<PlacedFeature> OVERWORLD_ORES = new ArrayList<>();

    public static void registerOres() {
        final ConfiguredFeature<?, ?> deepslateSilverOre = FeatureUtils.register("deepslate_silver_ore_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES,
                                MapleStoryBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())),
                        4)));

        final PlacedFeature placedDeepslateSilverOre = PlacementUtils.register("deepslate_silver_ore_block",
                deepslateSilverOre.placed(
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(60)),
                        InSquarePlacement.spread(), CountPlacement.of(250)));
        OVERWORLD_ORES.add(placedDeepslateSilverOre);

        final ConfiguredFeature<?, ?> silverOre = FeatureUtils.register("silver_ore_block",
                Feature.ORE.configured(new OreConfiguration(List.of(
                        OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES,
                                MapleStoryBlocks.SILVER_ORE_BLOCK.get().defaultBlockState())),
                        4)));

        final PlacedFeature placedSilverOre = PlacementUtils.register("silver_ore_block",
                silverOre.placed(
                        HeightRangePlacement.uniform(VerticalAnchor.bottom(), VerticalAnchor.aboveBottom(200)),
                        InSquarePlacement.spread(), CountPlacement.of(250)));
        OVERWORLD_ORES.add(placedSilverOre);

    }
}