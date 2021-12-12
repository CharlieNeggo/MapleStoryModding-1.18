package com.charlieNgo.maplestorymod.world;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.BiomeSpecialEffects;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.common.world.MobSpawnSettingsBuilder;
import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BiomeLoadingEvent extends Event
{
    private final ResourceLocation name;
    private Biome.ClimateSettings climate;
    private Biome.BiomeCategory category;
    private BiomeSpecialEffects effects;
    private final BiomeGenerationSettingsBuilder gen;
    private final MobSpawnSettingsBuilder spawns;

    public BiomeLoadingEvent(@Nullable final ResourceLocation name, final Biome.ClimateSettings climate, final Biome.BiomeCategory category, final BiomeSpecialEffects effects, final BiomeGenerationSettingsBuilder gen, final MobSpawnSettingsBuilder spawns)
    {
        this.name = name;
        this.climate = climate;
        this.category = category;
        this.effects = effects;
        this.gen = gen;
        this.spawns = spawns;
    }

    @Nullable
    public ResourceLocation getName()
    {
        return name;
    }

    public Biome.ClimateSettings getClimate()
    {
        return climate;
    }

    public void setClimate(final Biome.ClimateSettings value)
    {
        this.climate = value;
    }

    public Biome.BiomeCategory getCategory()
    {
        return category;
    }

    public void setCategory(final Biome.BiomeCategory value)
    {
        this.category = value;
    }

    public BiomeSpecialEffects getEffects()
    {
        return effects;
    }

    public void setEffects(final BiomeSpecialEffects value)
    {
        this.effects = value;
    }

    public BiomeGenerationSettingsBuilder getGeneration()
    {
        return gen;
    }

    public MobSpawnSettingsBuilder getSpawns()
    {
        return spawns;
    }
}