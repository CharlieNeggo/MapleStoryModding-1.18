package com.charlieNgo.maplestorymod.init.Consumables.Foods;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.Consumables.Potions.Elixir;
import com.charlieNgo.maplestorymod.init.Consumables.Potions.PowerElixir;
import com.charlieNgo.maplestorymod.init.Consumables.Potions.ReindeerMilk;
import com.charlieNgo.maplestorymod.init.Consumables.Potions.WhitePotion;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraftforge.registries.ForgeRegistries.ITEMS;
import static net.minecraftforge.registries.ForgeRegistries.POTIONS;

public class MapleConsumables {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    //Potions
    public static final RegistryObject<Item> ELIXIR = ITEMS.register("elixir", Elixir::new);
    public static final RegistryObject<Item> WHITE_POTIION = ITEMS.register("white_potion", WhitePotion::new);
    public static final RegistryObject<Item> REINDEER_MILK = ITEMS.register("reindeer_milk", ReindeerMilk::new);
    public static final RegistryObject<Item> POWER_ELIXIR = ITEMS.register("power_elixir", PowerElixir::new);

    //Foods
    public static final RegistryObject<Item> MELTING_CHEESE = ITEMS.register("melting_cheese", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB) .food(new FoodProperties.Builder().nutrition(4).saturationMod(0.4f).
                    fast().alwaysEat().effect(new MobEffectInstance(MobEffects.HEAL, 2), 2).build())));
    public static final RegistryObject<Item> UNAGI = ITEMS.register("unagi", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB) .food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).
                    fast().alwaysEat().effect(new MobEffectInstance(MobEffects.HEAL, 1), 1).build())));
}


