package com.charlieNgo.maplestorymod.init.Consumables;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraftforge.registries.ForgeRegistries.ITEMS;
import static net.minecraftforge.registries.ForgeRegistries.POTIONS;

public class MapleConsumables {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);
    public static final DeferredRegister<Potion> POTIONS =  DeferredRegister.create(ForgeRegistries.POTIONS, MapleStoryMod.MODID);

    public static final RegistryObject<Item> MELTING_CHEESE = ITEMS.register("melting_cheese", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB) .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).
                    effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1), 1).build())));
    public static final RegistryObject<Potion> REINDEER_MILK = POTIONS.register("reindeer_milk", ()->
            new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST,1, 1)));
    public static final RegistryObject<Potion> POWER_ELIXIR = POTIONS.register("power_elixir", ()->
            new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST,1, 1)));
    public static final RegistryObject<Potion> WHITE_POTION = POTIONS.register("white_potion", ()->
            new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST,1, 1)));
    public static final RegistryObject<Potion> ELIXIR = POTIONS.register("elixir", ()->
            new Potion(new MobEffectInstance(MobEffects.DAMAGE_BOOST,1, 1)));

}
