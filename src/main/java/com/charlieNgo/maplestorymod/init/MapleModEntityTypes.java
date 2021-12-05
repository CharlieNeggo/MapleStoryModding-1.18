package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.BlueSnail;
import com.charlieNgo.maplestorymod.entities.GreenSlime;
import com.charlieNgo.maplestorymod.entities.MushRoom;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES,MapleStoryMod.MOD_ID);

    //Orange Mushroom
    public static final RegistryObject<EntityType<MushRoom>> MUSHROOM = ENTITY_TYPES.register("mushroom", () -> EntityType.Builder.create(MushRoom::new
    , EntityClassification.MONSTER)
            .size(1.0f, 1.0f)
            .build(new ResourceLocation(MapleStoryMod.MOD_ID, "mushroom").toString()));

    //Blue Snail
    public static final RegistryObject<EntityType<BlueSnail>> BLUESNAIL = ENTITY_TYPES.register("blue_snail", () -> EntityType.Builder.create(BlueSnail::new
                    , EntityClassification.MONSTER)
            .size(1.0f, 1.0f)
            .build(new ResourceLocation(MapleStoryMod.MOD_ID, "blue_snail").toString()));

    //Green Slime
    public static final RegistryObject<EntityType<GreenSlime>> GREENSLIME  = ENTITY_TYPES.register("green_slime", () -> EntityType.Builder.create(GreenSlime::new
                    , EntityClassification.MONSTER)
            .size(1.0f, 1.0f)
            .build(new ResourceLocation(MapleStoryMod.MOD_ID, "green_slime").toString()));
}
