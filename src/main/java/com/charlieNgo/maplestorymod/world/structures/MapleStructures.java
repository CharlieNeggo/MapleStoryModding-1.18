package com.charlieNgo.maplestorymod.world.structures;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.setup.MapleRegistry;
import com.google.common.collect.*;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.PlainVillagePools;
import net.minecraft.data.worldgen.Pools;
import net.minecraft.data.worldgen.ProcessorLists;
import net.minecraft.data.worldgen.placement.VillagePlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.FlatLevelSource;
import net.minecraft.world.level.levelgen.StructureSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.StructureFeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.structures.StructurePoolElement;
import net.minecraft.world.level.levelgen.feature.structures.StructureTemplatePool;
import net.minecraft.world.level.levelgen.structure.pieces.PieceGeneratorSupplier;
import net.minecraftforge.event.world.StructureSpawnListGatherEvent;
import net.minecraftforge.event.world.WorldEvent;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapleStructures {

    /**
     * Static instances of our structures so we can reference it and add it to biomes easily.
     * We cannot get our own pool here at mod init so we use PlainVillagePools.START.
     * We will modify this pool at runtime later in createPiecesGenerator
     */
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_HENESY = MapleRegistry.HENESY.get()
            .configured(new JigsawConfiguration(() -> PlainVillagePools.START, 6));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_LITH_HARBOR = MapleRegistry.LITH_HARBOR.get()
            .configured(new JigsawConfiguration(() -> PlainVillagePools.START, 6));

    /**
     * Registers the configured structure which is what gets added to the biomes.
     * Noticed we are not using a forge registry because there is none for configured structures.
     *
     * We can register configured structures at any time before a world is clicked on and made.
     * But the best time to register configured features by code is honestly to do it in FMLCommonSetupEvent.
     */
    public static void registerConfiguredStructures() {
        Pools.register(new StructureTemplatePool(new ResourceLocation("plains/henesy/houses"), new ResourceLocation("plains/henesy/terminators"),
                ImmutableList.of(Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesyhouse_01", ProcessorLists.HOUSING), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesyhouse_02", ProcessorLists.HOUSING), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesyhouse_03", ProcessorLists.HOUSING), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesyhouse_04", ProcessorLists.HOUSING), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesyhouse_05", ProcessorLists.HOUSING), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesyhouse_06", ProcessorLists.HOUSING), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesyhouse_07", ProcessorLists.HOUSING), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesytower_01", ProcessorLists.HOUSING), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesytower_01", ProcessorLists.HOUSING), 4),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesy_towncenter_01", ProcessorLists.HOUSING), 3),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesy_towncenter_02", ProcessorLists.HOUSING), 3),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesy_ardent_mill", ProcessorLists.HOUSING), 5),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/henesy_houses", ProcessorLists.HOUSING), 5),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/houses/mushroom_park", ProcessorLists.HOUSING), 4)),
                StructureTemplatePool.Projection.RIGID));

        Pools.register(new StructureTemplatePool(new ResourceLocation("plains/henesy/town_centers"), new ResourceLocation("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.legacy("plains/henesy/town_centers/henesy_fountain_01", ProcessorLists.MOSSIFY_20_PERCENT), 50),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/town_centers/henesy_meeting_point_1", ProcessorLists.MOSSIFY_20_PERCENT), 50),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/town_centers/henesy_meeting_point_2"), 50)),
                StructureTemplatePool.Projection.RIGID));

        Pools.register(new StructureTemplatePool(new ResourceLocation("plains/henesy/villagers"), new ResourceLocation("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.legacy("plains/henesy/villagers/nitwit"), 1),
                Pair.of(StructurePoolElement.legacy("plains/henesy/villagers/baby"), 1),
                Pair.of(StructurePoolElement.legacy("plains/henesy/villagers/unemployed"), 10)), StructureTemplatePool.Projection.RIGID));

        Pools.register(new StructureTemplatePool(new ResourceLocation("plains/henesy/common/cats"), new ResourceLocation("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.legacy("plains/henesy/common/animals/cat_black"), 1),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/common/animals/cat_british"), 1),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/common/animals/cat_calico"), 1),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/common/animals/cat_persian"), 1),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/common/animals/cat_ragdoll"), 1),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/common/animals/cat_red"), 1),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/common/animals/cat_siamese"), 1),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/common/animals/cat_tabby"), 1),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/common/animals/cat_white"), 1),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/common/animals/cat_jellie"), 1),
                        Pair.of(StructurePoolElement.empty(), 3)), StructureTemplatePool.Projection.RIGID));

        Pools.register(new StructureTemplatePool(new ResourceLocation("plains/henesy/terminators"), new ResourceLocation("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.legacy("plains/henesy/terminators/henesy_terminator_01",
                        ProcessorLists.STREET_PLAINS), 1), Pair.of(StructurePoolElement.legacy("plains/henesy/terminators/henesy_terminator_02",
                        ProcessorLists.STREET_PLAINS), 1), Pair.of(StructurePoolElement.legacy("plains/henesy/terminators/henesy_terminator_03",
                        ProcessorLists.STREET_PLAINS), 1), Pair.of(StructurePoolElement.legacy("plains/henesy/terminators/henesy_terminator_04",
                        ProcessorLists.STREET_PLAINS), 1), Pair.of(StructurePoolElement.empty(), 10)),
                StructureTemplatePool.Projection.TERRAIN_MATCHING));

        Pools.register(new StructureTemplatePool(new ResourceLocation("plains/henesy/decoration"), new ResourceLocation("empty"),
                ImmutableList.of(Pair.of(StructurePoolElement.legacy("plains/henesy/decoration/henesy_lamp_01"), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/decoration/henesy_bench_01"), 2),
                        Pair.of(StructurePoolElement.feature(VillagePlacements.OAK_VILLAGE), 1),
                        Pair.of(StructurePoolElement.feature(VillagePlacements.FLOWER_PLAIN_VILLAGE), 1),
                        Pair.of(StructurePoolElement.feature(VillagePlacements.PILE_HAY_VILLAGE), 1),
                        Pair.of(StructurePoolElement.empty(), 2)), StructureTemplatePool.Projection.RIGID));

        Pools.register(new StructureTemplatePool(new ResourceLocation("plains/henesy/streets"), new ResourceLocation("plains/henesy/terminators"),
                ImmutableList.of(Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_corner_01", ProcessorLists.STREET_PLAINS), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_corner_02", ProcessorLists.STREET_PLAINS), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_corner_03", ProcessorLists.STREET_PLAINS), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_straight_01", ProcessorLists.STREET_PLAINS), 4),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_straight_02", ProcessorLists.STREET_PLAINS), 4),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_straight_03", ProcessorLists.STREET_PLAINS), 7),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_straight_04", ProcessorLists.STREET_PLAINS), 7),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_straight_05", ProcessorLists.STREET_PLAINS), 3),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_crossroad_01", ProcessorLists.STREET_PLAINS), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_crossroad_02", ProcessorLists.STREET_PLAINS), 1),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_crossroad_03", ProcessorLists.STREET_PLAINS), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_crossroad_04", ProcessorLists.STREET_PLAINS), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_crossroad_05", ProcessorLists.STREET_PLAINS), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_crossroad_06", ProcessorLists.STREET_PLAINS), 2),
                        Pair.of(StructurePoolElement.legacy("plains/henesy/streets/henesy_turn_01", ProcessorLists.STREET_PLAINS), 3)),
                StructureTemplatePool.Projection.TERRAIN_MATCHING));

        Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, new ResourceLocation(MapleStoryMod.MODID, "beach/lith_harbor/houses/lith_harbor"), CONFIGURED_LITH_HARBOR);
    }

    /**
     * This is where we set the rarity of your structures and determine if land conforms to it.
     * See the comments in below for more details. This is also called from FMLCommonSetupEvent.
     */
    public static void setupStructures() {
        setupMapSpacingAndLand(
                MapleRegistry.HENESY.get(),
                new StructureFeatureConfiguration(15, // average distance apart in chunks between spawn attempts
                        10,            // minimum distance apart in chunks between spawn attempts. MUST BE LESS THAN ABOVE VALUE
                        1934567890),  // this modifies the seed of the structure so no two structures always spawn over each-other. Make this large and unique. */
                true);

        setupMapSpacingAndLand(
                MapleRegistry.LITH_HARBOR.get(),
                new StructureFeatureConfiguration(10, // average distance apart in chunks between spawn attempts
                        5,            // minimum distance apart in chunks between spawn attempts. MUST BE LESS THAN ABOVE VALUE
                        1234567890),  // this modifies the seed of the structure so no two structures always spawn over each-other. Make this large and unique. */
                true);
    }



    /**
     * Adds the provided structure to the registry, and adds the separation settings.
     * The rarity of the structure is determined based on the values passed into
     * this method in the StructureFeatureConfiguration argument.
     * This method is called by setupStructures above.
     */
    private static <F extends StructureFeature<?>> void setupMapSpacingAndLand(
            F structure,
            StructureFeatureConfiguration structureFeatureConfiguration,
            boolean transformSurroundingLand)
    {
        // Add our own structure into the structure feature map. Otherwise you get errors
        StructureFeature.STRUCTURES_REGISTRY.put(Objects.requireNonNull(structure.getRegistryName()).toString(), structure);

        // Adapt the surrounding land to the bottom of our structure
        if (transformSurroundingLand) {
            StructureFeature.NOISE_AFFECTING_FEATURES =
                    ImmutableList.<StructureFeature<?>>builder()
                            .addAll(StructureFeature.NOISE_AFFECTING_FEATURES)
                            .add(structure)
                            .build();
        }

        // This is the map that holds the default spacing of all structures. This is normally
        // private and final. That's why we need an access transformer.
        // Always add your structure to here so that other mods can utilize it if needed
        StructureSettings.DEFAULTS =
                ImmutableMap.<StructureFeature<?>, StructureFeatureConfiguration>builder()
                        .putAll(StructureSettings.DEFAULTS)
                        .put(structure, structureFeatureConfiguration)
                        .build();


        // Add our structure to all the noise generator settings.
        // structureConfig requires AccessTransformer
        BuiltinRegistries.NOISE_GENERATOR_SETTINGS.entrySet().forEach(settings -> {
            Map<StructureFeature<?>, StructureFeatureConfiguration> structureMap = settings.getValue().structureSettings().structureConfig();

            // Be careful with mods that make the structure map immutable (like datapacks do)
            if (structureMap instanceof ImmutableMap) {
                Map<StructureFeature<?>, StructureFeatureConfiguration> tempMap = new HashMap<>(structureMap);
                tempMap.put(structure, structureFeatureConfiguration);
                settings.getValue().structureSettings().structureConfig = tempMap;
            } else {
                structureMap.put(structure, structureFeatureConfiguration);
            }
        });
    }

    /**
     * Tells the chunkgenerator which biomes our structure can spawn in.
     * Will go into the world's chunkgenerator where we manually add our structure spacing.
     * If the spacing is not added, the structure doesn't spawn.
     *
     * Use this for dimension blacklists for your structure.
     * (Don't forget to attempt to remove your structure too from the map if you are blacklisting that dimension!)
     * (It might have your structure in it already.)
     *
     * Basically use this to make absolutely sure the chunkgenerator can or cannot spawn your structure.
     */

    public static void addDimensionalSpacing(final WorldEvent.Load event) {
        if (event.getWorld() instanceof ServerLevel serverLevel) {
            ChunkGenerator chunkGenerator = serverLevel.getChunkSource().getGenerator();
            // Skip superflat to prevent issues with it. Plus, users don't want structures clogging up their superflat worlds.
            if (chunkGenerator instanceof FlatLevelSource && serverLevel.dimension().equals(Level.OVERWORLD)) {
                return;
            }

            StructureSettings worldStructureConfig = chunkGenerator.getSettings();

            /*
             * NOTE: BiomeLoadingEvent from Forge API does not work with structures anymore.
             * Instead, we will use the below to add our structure to overworld biomes.
             * Remember, this is temporary until Forge API finds a better solution for adding structures to biomes.
             */

            // Create a mutable map we will use for easier adding to biomes
            var structureToMultimap = new HashMap<StructureFeature<?>, HashMultimap<ConfiguredStructureFeature<?, ?>, ResourceKey<Biome>>>();

            // Add the resourcekey of all biomes that this Configured Structure can spawn in.
            for (var biomeEntry : serverLevel.registryAccess().ownedRegistryOrThrow(Registry.BIOME_REGISTRY).entrySet()) {
                // Skip all ocean, end, nether, and none category biomes.
                // You can do checks for other traits that the biome has.
                BiomeCategory category = biomeEntry.getValue().getBiomeCategory();
                /*
                This is for checking if the biomes allow the structures to spawn in
                 */

                 ResourceKey.create(Registry.BIOME_REGISTRY, new ResourceLocation("maplestorymod", "plains"));
            ImmutableSet<ResourceKey<Biome>> overworldBiomes = ImmutableSet.<ResourceKey<Biome>>builder()
                    .add(Biomes.PLAINS)
                    .build();
            overworldBiomes.forEach(biomeKey -> associateBiomeToConfiguredStructure(structureToMultimap, CONFIGURED_HENESY, biomeKey));
                ImmutableSet<ResourceKey<Biome>> overworldBiomes1 = ImmutableSet.<ResourceKey<Biome>>builder()
                        .add(Biomes.BEACH)
                        .build();
            overworldBiomes1.forEach(biomeKey -> associateBiomeToConfiguredStructure(structureToMultimap, CONFIGURED_LITH_HARBOR, biomeKey));

            }

            // Grab the map that holds what ConfigureStructures a structure has and what biomes it can spawn in.
            // Requires AccessTransformer  (see resources/META-INF/accesstransformer.cfg)
            ImmutableMap.Builder<StructureFeature<?>, ImmutableMultimap<ConfiguredStructureFeature<?, ?>, ResourceKey<Biome>>> tempStructureToMultiMap = ImmutableMap.builder();
            worldStructureConfig.configuredStructures.entrySet()
                    .stream()
                    .filter(entry -> !structureToMultimap.containsKey(entry.getKey()))
                    .forEach(tempStructureToMultiMap::put);

            // Add our structures to the structure map/multimap and set the world to use this combined map/multimap.
            structureToMultimap.forEach((key, value) -> tempStructureToMultiMap.put(key, ImmutableMultimap.copyOf(value)));

            // Requires AccessTransformer (see resources/META-INF/accesstransformer.cfg)
            worldStructureConfig.configuredStructures = tempStructureToMultiMap.build();
        }
    }

    /**
     * Helper method that handles setting up the map to multimap relationship to help prevent issues.
     */
    private static void associateBiomeToConfiguredStructure(Map<StructureFeature<?>, HashMultimap<ConfiguredStructureFeature<?, ?>, ResourceKey<Biome>>> structureToMultimap, ConfiguredStructureFeature<?, ?> configuredStructureFeature, ResourceKey<Biome> biomeRegistryKey) {
        structureToMultimap.putIfAbsent(configuredStructureFeature.feature, HashMultimap.create());
        var configuredStructureToBiomeMultiMap = structureToMultimap.get(configuredStructureFeature.feature);
        if (configuredStructureToBiomeMultiMap.containsValue(biomeRegistryKey)) {
            MapleStoryMod.LOGGER.error("""
                    Detected 2 ConfiguredStructureFeatures that share the same base StructureFeature trying to be added to same biome. One will be prevented from spawning.
                    This issue happens with vanilla too and is why a Snowy Village and Plains Village cannot spawn in the same biome because they both use the Village base structure.
                    The two conflicting ConfiguredStructures are: {}, {}
                    The biome that is attempting to be shared: {}
                """,
                    BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(configuredStructureFeature),
                    BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE.getId(configuredStructureToBiomeMultiMap.entries().stream().filter(e -> e.getValue() == biomeRegistryKey).findFirst().get().getKey()),
                    biomeRegistryKey
            );
        } else {
            configuredStructureToBiomeMultiMap.put(configuredStructureFeature, biomeRegistryKey);
        }
    }

    /**
     * Create a copy of a piece generator context with another config. This is used by the structures
     */
    @NotNull
    static PieceGeneratorSupplier.Context<JigsawConfiguration> createContextWithConfig(PieceGeneratorSupplier.Context<JigsawConfiguration> context, JigsawConfiguration newConfig) {
        return new PieceGeneratorSupplier.Context<>(
                context.chunkGenerator(),
                context.biomeSource(),
                context.seed(),
                context.chunkPos(),
                newConfig,
                context.heightAccessor(),
                context.validBiome(),
                context.structureManager(),
                context.registryAccess()
        );
    }

//    private static final Lazy<List<MobSpawnSettings.SpawnerData>> STRUCTURE_MONSTERS = Lazy.of(() -> ImmutableList.of(
//            new MobSpawnSettings.SpawnerData(EntityType.VILLAGER, 200, 4, 9)
//    ));

    public static void setupStructureSpawns(final StructureSpawnListGatherEvent event) {
        if (event.getStructure() == MapleRegistry.HENESY.get() || event.getStructure() == MapleRegistry.LITH_HARBOR.get()) {
//            event.addEntitySpawns(MobCategory.MONSTER, STRUCTURE_MONSTERS.get());
        }
    }
}
