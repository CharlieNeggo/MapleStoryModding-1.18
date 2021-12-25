package com.charlieNgo.maplestorymod.init.SpawnEggs;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleModEntityTypes {
    private MapleModEntityTypes() {

    }

    public static DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, MapleStoryMod.MODID);

    //Orange Mushroom
    public static final RegistryObject<EntityType<MushRoom>> MUSHROOM = ENTITIES.register("mushroom", () ->
            EntityType.Builder.of(MushRoom::new, MobCategory.MONSTER).sized(0.8f, 0.9f).build(new ResourceLocation(MapleStoryMod.MODID, "mushroom").toString()));
    //Green Slime
    public static final RegistryObject<EntityType<GreenSlime>> GREENSLIME = ENTITIES.register("green_slime", () ->
            EntityType.Builder.of(GreenSlime::new, MobCategory.MONSTER).sized(0.55f, 0.5f).build(new ResourceLocation(MapleStoryMod.MODID, "green_slime").toString()));
    //Blue Snail
    public static final RegistryObject<EntityType<BlueSnail>> BLUESNAIL = ENTITIES.register("blue_snail", () ->
            EntityType.Builder.of(BlueSnail::new, MobCategory.MONSTER).sized(0.6f, 0.4f).build(new ResourceLocation(MapleStoryMod.MODID, "blue_snail").toString()));
    //Octopus
    public static final RegistryObject<EntityType<Octopus>> OCTOPUS = ENTITIES.register("octopus", () ->
            EntityType.Builder.of(Octopus::new, MobCategory.MONSTER).sized(1.0f, 1.95f).build(new ResourceLocation(MapleStoryMod.MODID, "octopus").toString()));
    //Muddy Swamp Monster
    public static final RegistryObject<EntityType<MuddySwampMonster>> MUDDYSWAMPMONSTER = ENTITIES.register("muddy_swamp_monster", () ->
            EntityType.Builder.of(MuddySwampMonster::new, MobCategory.MONSTER).sized(0.9f, 1.1f).build(new ResourceLocation(MapleStoryMod.MODID, "muddy_swamp_monster").toString()));
    //Smirky Ghost Stump
    public static final RegistryObject<EntityType<SmirkyGhostStump>> SMIRKYGHOSTSTUMP = ENTITIES.register("smirky_ghost_stump", () ->
            EntityType.Builder.of(SmirkyGhostStump::new, MobCategory.MONSTER).sized(0.9f, 1.1f).build(new ResourceLocation(MapleStoryMod.MODID, "smirky_ghost_stump").toString()));
    //Copper Drake
    public static final RegistryObject<EntityType<CopperDrake>> COPPERDRAKE = ENTITIES.register("copper_drake", () ->
            EntityType.Builder.of(CopperDrake::new, MobCategory.MONSTER).sized(0.9f, 1.1f).build(new ResourceLocation(MapleStoryMod.MODID, "copper_drake").toString()));

}
