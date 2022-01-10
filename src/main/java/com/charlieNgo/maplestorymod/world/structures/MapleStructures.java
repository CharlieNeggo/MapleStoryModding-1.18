package com.charlieNgo.maplestorymod.world.structures;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import com.google.common.collect.*;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.PlainVillagePools;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biome.BiomeCategory;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.FlatLevelSource;
import net.minecraft.world.level.levelgen.StructureSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.StructureFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.pieces.PieceGeneratorSupplier;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.event.world.StructureSpawnListGatherEvent;
import net.minecraftforge.event.world.WorldEvent;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.BiConsumer;

public class MapleStructures {
    /**
     * Static instances of our structures so we can reference it and add it to biomes easily.
     * We cannot get our own pool here at mod init so we use PlainVillagePools.START.
     * We will modify this pool at runtime later in createPiecesGenerator
     */
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_HENESY = MapleModItems.HENESY.get()
            .configured(new JigsawConfiguration(() -> PlainVillagePools.START, 6));
    public static ConfiguredStructureFeature<?, ?> CONFIGURED_LITH_HARBOR = MapleModItems.LITH_HARBOR.get()
            .configured(new JigsawConfiguration(() -> PlainVillagePools.START, 6));

    /**
     * Registers the configured structure which is what gets added to the biomes.
     * Noticed we are not using a forge registry because there is none for configured structures.
     *
     * We can register configured structures at any time before a world is clicked on and made.
     * But the best time to register configured features by code is honestly to do it in FMLCommonSetupEvent.
     */
    public static void registerConfiguredStructures() {
        Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, new ResourceLocation(MapleStoryMod.MODID, "henesy"), CONFIGURED_HENESY);
        Registry.register(BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE, new ResourceLocation(MapleStoryMod.MODID, "lith_harbor"), CONFIGURED_LITH_HARBOR);
    }

    /**
     * This is where we set the rarity of your structures and determine if land conforms to it.
     * See the comments in below for more details. This is also called from FMLCommonSetupEvent.
     */
    public static void setupStructures() {
        setupMapSpacingAndLand(
                MapleModItems.HENESY.get(),
                new StructureFeatureConfiguration(10, // average distance apart in chunks between spawn attempts
                        5,            // minimum distance apart in chunks between spawn attempts. MUST BE LESS THAN ABOVE VALUE
                        1234567890),  // this modifies the seed of the structure so no two structures always spawn over each-other. Make this large and unique. */
                true);

        setupMapSpacingAndLand(
                MapleModItems.LITH_HARBOR.get(),
                new StructureFeatureConfiguration(10, // average distance apart in chunks between spawn attempts
                        5,            // minimum distance apart in chunks between spawn attempts. MUST BE LESS THAN ABOVE VALUE
                        1999967890),  // this modifies the seed of the structure so no two structures always spawn over each-other. Make this large and unique. */
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

    private static void register(BiConsumer<ConfiguredStructureFeature<?, ?>, ResourceKey<Biome>> p_194760_, ConfiguredStructureFeature<?, ?> p_194761_, Set<ResourceKey<Biome>> p_194762_) {
        p_194762_.forEach((p_194770_) -> {
            p_194760_.accept(p_194761_, p_194770_);
        });
    }
    private static void register(BiConsumer<ConfiguredStructureFeature<?, ?>, ResourceKey<Biome>> p_194764_, ConfiguredStructureFeature<?, ?> p_194765_, ResourceKey<Biome> p_194766_) {
        p_194764_.accept(p_194765_, p_194766_);
    }

    public static void registerStructures(BiConsumer<ConfiguredStructureFeature<?, ?>, ResourceKey<Biome>> p_194758_) {
        Set<ResourceKey<Biome>> set = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.DEEP_FROZEN_OCEAN).add(Biomes.DEEP_COLD_OCEAN).add(Biomes.DEEP_OCEAN).add(Biomes.DEEP_LUKEWARM_OCEAN).build();
        Set<ResourceKey<Biome>> set1 = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.FROZEN_OCEAN).add(Biomes.OCEAN).add(Biomes.COLD_OCEAN).add(Biomes.LUKEWARM_OCEAN).add(Biomes.WARM_OCEAN).addAll(set).build();
        Set<ResourceKey<Biome>> set2 = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.BEACH).add(Biomes.SNOWY_BEACH).build();
        Set<ResourceKey<Biome>> set3 = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.RIVER).add(Biomes.FROZEN_RIVER).build();
        Set<ResourceKey<Biome>> set4 = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.MEADOW).add(Biomes.FROZEN_PEAKS).add(Biomes.JAGGED_PEAKS).add(Biomes.STONY_PEAKS).add(Biomes.SNOWY_SLOPES).build();
        Set<ResourceKey<Biome>> set5 = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.BADLANDS).add(Biomes.ERODED_BADLANDS).add(Biomes.WOODED_BADLANDS).build();
        Set<ResourceKey<Biome>> set6 = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.WINDSWEPT_HILLS).add(Biomes.WINDSWEPT_FOREST).add(Biomes.WINDSWEPT_GRAVELLY_HILLS).build();
        Set<ResourceKey<Biome>> set7 = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.TAIGA).add(Biomes.SNOWY_TAIGA).add(Biomes.OLD_GROWTH_PINE_TAIGA).add(Biomes.OLD_GROWTH_SPRUCE_TAIGA).build();
        Set<ResourceKey<Biome>> set8 = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.BAMBOO_JUNGLE).add(Biomes.JUNGLE).add(Biomes.SPARSE_JUNGLE).build();
        Set<ResourceKey<Biome>> set9 = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.FOREST).add(Biomes.FLOWER_FOREST).add(Biomes.BIRCH_FOREST).add(Biomes.OLD_GROWTH_BIRCH_FOREST).add(Biomes.DARK_FOREST).add(Biomes.GROVE).build();
        Set<ResourceKey<Biome>> set10 = ImmutableSet.<ResourceKey<Biome>>builder().add(Biomes.NETHER_WASTES).add(Biomes.BASALT_DELTAS).add(Biomes.SOUL_SAND_VALLEY).add(Biomes.CRIMSON_FOREST).add(Biomes.WARPED_FOREST).build();

        register(p_194758_, CONFIGURED_HENESY, Biomes.PLAINS);
        register(p_194758_, CONFIGURED_LITH_HARBOR, Biomes.BEACH);
    }

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
                boolean b = category != BiomeCategory.OCEAN && category != BiomeCategory.THEEND && category != BiomeCategory.NETHER &&
                        category != BiomeCategory.FOREST  &&  category != BiomeCategory.RIVER && category != BiomeCategory.NONE;
                if (b) {
                    associateBiomeToConfiguredStructure(structureToMultimap, CONFIGURED_HENESY, biomeEntry.getKey());
                }

                if (b) {
                    associateBiomeToConfiguredStructure(structureToMultimap, CONFIGURED_LITH_HARBOR, biomeEntry.getKey());
                }
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

    private static final Lazy<List<MobSpawnSettings.SpawnerData>> STRUCTURE_MONSTERS = Lazy.of(() -> ImmutableList.of(
            new MobSpawnSettings.SpawnerData(EntityType.VILLAGER, 200, 4, 9)
    ));

    public static void setupStructureSpawns(final StructureSpawnListGatherEvent event) {
        if (event.getStructure() == MapleModItems.HENESY.get() || event.getStructure() == MapleModItems.LITH_HARBOR.get()) {
            event.addEntitySpawns(MobCategory.MONSTER, STRUCTURE_MONSTERS.get());
        }
    }
}
