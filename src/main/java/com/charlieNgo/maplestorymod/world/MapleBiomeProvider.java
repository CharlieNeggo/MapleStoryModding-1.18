package com.charlieNgo.maplestorymod.world;

import com.mojang.serialization.Codec;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;
import net.minecraft.resources.RegistryLookupCodec;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.biome.BiomeSource;
import net.minecraft.world.level.biome.Climate;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class MapleBiomeProvider extends BiomeSource {

    public static final Codec<MapleBiomeProvider> CODEC = RegistryLookupCodec.create(Registry.BIOME_REGISTRY)
            .xmap(MapleBiomeProvider::new, MapleBiomeProvider::getBiomeRegistry).codec();

    private final Biome biome;
    private final Registry<Biome> biomeRegistry;
    private static final List<ResourceKey<Biome>> SPAWN = Collections.singletonList(Biomes.PLAINS);

    public MapleBiomeProvider(Registry<Biome> biomeRegistry) {
        super(getStartBiomes(biomeRegistry));
        this.biomeRegistry = biomeRegistry;
        biome = biomeRegistry.get(Biomes.PLAINS.location());
    }

    private static List<Biome> getStartBiomes(Registry<Biome> registry) {
        return SPAWN.stream().map(s -> registry.get(s.location())).collect(Collectors.toList());
    }

    public Registry<Biome> getBiomeRegistry() {
        return biomeRegistry;
    }

    @Override
    protected Codec<? extends BiomeSource> codec() {
        return CODEC;
    }

    @Override
    public BiomeSource withSeed(long seed) {
        return this;
    }

    @Override
    public Biome getNoiseBiome(int x, int y, int z, Climate.Sampler sampler) {
        return biome;
    }
}