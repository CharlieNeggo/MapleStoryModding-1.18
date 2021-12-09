package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleStorySoundInit {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create (ForgeRegistries.SOUND_EVENTS, MapleStoryMod.MODID);

    public static final RegistryObject<SoundEvent> MUSHROOM_AMBIENT = SOUNDS.register("entity.mushroom_entity_ambient", () ->
            new SoundEvent(new ResourceLocation(MapleStoryMod.MODID, "entity.mushroom_entity.ambient")));

    public static final RegistryObject<SoundEvent> MUSHROOM_HURT = SOUNDS.register("entity.mushroom_entity.hurt", () ->
            new SoundEvent(new ResourceLocation(MapleStoryMod.MODID, "entity.mushroom_entity.hurt")));

    public static final RegistryObject<SoundEvent> MUSHROOM_DEATH = SOUNDS.register("entity.mushroom_entity.death", () ->
            new SoundEvent(new ResourceLocation(MapleStoryMod.MODID, "entity.mushroom_entity.death")));


    private MapleStorySoundInit() {

    }
}
