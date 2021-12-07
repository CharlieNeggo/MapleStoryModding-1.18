package com.charlieNgo.maplestorymod.init.SpawnEggs;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.BlueSnail;
import com.charlieNgo.maplestorymod.entities.GreenSlime;
import com.charlieNgo.maplestorymod.entities.MushRoom;
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
            EntityType.Builder.of(MushRoom::new, MobCategory.MONSTER).sized(0.8f, 0.6f).build(new ResourceLocation(MapleStoryMod.MODID, "mushroom").toString()));
}

    //Orange Mushroom
//    public static final RegistryObject<EntityType<MushRoom>> MUSHROOM = ENTITY_TYPES.register("mushroom", () -> EntityType.Builder.of(MushRoom::new
//    , MobCategory.MONSTER).sized(0.8f, 0.6f)
//            .build(new ResourceLocation(MapleStoryMod.MOD_ID, "mushroom").toString()));

    //Blue Snail
//    public static final RegistryObject<EntityType<BlueSnail>> BLUESNAIL = ENTITY_TYPES.register("bluesnail", () -> EntityType.Builder.of(BlueSnail::new
//                    , MobCategory.MONSTER).sized(0.8f, 0.6f)
//            .build(new ResourceLocation(MapleStoryMod.MOD_ID, "bluesnail").toString()));
//
//    //Green Slime
//    public static final RegistryObject<EntityType<GreenSlime>> GREENSLIME  = ENTITY_TYPES.register("greenslime", () -> EntityType.Builder.of(GreenSlime::new
//                    , MobCategory.MONSTER).sized(0.8f, 0.6f)
//            .build(new ResourceLocation(MapleStoryMod.MOD_ID, "greenslime").toString()));
