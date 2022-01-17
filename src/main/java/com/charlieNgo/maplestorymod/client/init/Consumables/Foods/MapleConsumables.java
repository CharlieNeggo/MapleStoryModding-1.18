package com.charlieNgo.maplestorymod.client.init.Consumables.Foods;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.init.Consumables.Potions.Elixir;
import com.charlieNgo.maplestorymod.client.init.Consumables.Potions.PowerElixir;
import com.charlieNgo.maplestorymod.client.init.Consumables.Potions.ReindeerMilk;
import com.charlieNgo.maplestorymod.client.init.Consumables.Potions.WhitePotion;
import com.charlieNgo.maplestorymod.setup.MapleSetup;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleConsumables {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    //Potions
    public static final RegistryObject<Item> ELIXIR = ITEMS.register("elixir", Elixir::new);
    public static final RegistryObject<Item> WHITE_POTIION = ITEMS.register("white_potion", WhitePotion::new);
    public static final RegistryObject<Item> REINDEER_MILK = ITEMS.register("reindeer_milk", ReindeerMilk::new);
    public static final RegistryObject<Item> POWER_ELIXIR = ITEMS.register("power_elixir", PowerElixir::new);

    //Foods
    public static final RegistryObject<Item> MELTING_CHEESE = ITEMS.register("melting_cheese", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB) .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.4f).
                    fast().alwaysEat().effect(new MobEffectInstance(MobEffects.HEAL, 2), 2).build())));
    public static final RegistryObject<Item> UNAGI = ITEMS.register("unagi", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB) .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).
                    fast().alwaysEat().effect(new MobEffectInstance(MobEffects.HEAL, 1), 1).build())));
}


