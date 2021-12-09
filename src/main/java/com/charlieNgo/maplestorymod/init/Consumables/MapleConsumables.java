package com.charlieNgo.maplestorymod.init.Consumables;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleConsumables {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    public static final RegistryObject<Item> ELIXIR = ITEMS.register("elixir", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB) .food(new FoodProperties.Builder().
                    effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1), 1).build())));
    public static final RegistryObject<Item> MELTING_CHEESE = ITEMS.register("melting_cheese", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB) .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).
                    effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1), 1).build())));
    public static final RegistryObject<Item> REINDEER_MILK = ITEMS.register("reindeer_milk", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB) .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> POWER_ELIXIR = ITEMS.register("power_elixir", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> WHITE_POTION = ITEMS.register("white_potion", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB) .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));

}
