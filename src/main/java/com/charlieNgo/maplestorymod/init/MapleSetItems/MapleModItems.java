package com.charlieNgo.maplestorymod.init.MapleSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.blocks.BlockItemBase;
import com.charlieNgo.maplestorymod.init.MapleModBlocks;
import com.charlieNgo.maplestorymod.init.SpawnEggs.MapleModEntityTypes;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleModItemTier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    // For Armor Sets/Weapons for what material their going to be made out of
    public static final RegistryObject<Item> MAPLE = ITEMS.register("maple", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
    public static final RegistryObject<Item> UTGARD = ITEMS.register("utgard", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
    public static final RegistryObject<Item> ABSOLAB_ESSENCE = ITEMS.register("absolab_essence", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
    public static final RegistryObject<Item> ARCANE_ESSENCE = ITEMS.register("arcane_essence", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
    public static final RegistryObject<Item> GENESIS = ITEMS.register("genesis", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
    public static final RegistryObject<Item> CRA = ITEMS.register("cra", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));

    // Items
    public static final RegistryObject<Item> ELIXIR = ITEMS.register("elixir", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(9999).food(new FoodProperties.Builder().
                    effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1), 1).build())));
    public static final RegistryObject<Item> MELTING_CHEESE = ITEMS.register("melting_cheese", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(9999).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).
                    effect(new MobEffectInstance(MobEffects.HEALTH_BOOST, 1), 1).build())));
    public static final RegistryObject<Item> REINDEER_MILK = ITEMS.register("reindeer_milk", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(9999).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> POWER_ELIXIR = ITEMS.register("power_elixir", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(9999).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> WHITE_POTION = ITEMS.register("white_potion", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(9999).food(new FoodProperties.Builder().nutrition(2).saturationMod(0.2f).build())));
    public static final RegistryObject<Item> ORANGEMUSHROOMCAP = ITEMS.register("orangemushroomcap", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(9999)));
    public static final RegistryObject<Item> SQUISHY_LIQUID = ITEMS.register("squishy_liquid", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(9999)));
    public static final RegistryObject<Item> BLUE_SNAIL_SHELL = ITEMS.register("blue_snail_shell", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(9999)));
    public static final RegistryObject<Item> SLIME_BUBBLE =  ITEMS.register("slime_bubble", () ->
            new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(9999)));

    //Spawn eggs for the mobs
    public static final RegistryObject<ForgeSpawnEggItem> BLUE_SNAIL_SPAWN_EGG = ITEMS.register("blue_snail_spawn_egg", () ->
            new ForgeSpawnEggItem(MapleModEntityTypes.BLUESNAIL, 0xF1BF7B, 0x3C4EED, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> GREEN_SLIME_SPAWN_EGG = ITEMS.register("green_slime_spawn_egg", () ->
            new ForgeSpawnEggItem(MapleModEntityTypes.GREENSLIME, 0xF1BF7B, 0x4AED3C, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));
    public static final RegistryObject<ForgeSpawnEggItem> MUSHROOM_SPAWN_EGG = ITEMS.register("mushroom_spawn_egg", () ->
                    new ForgeSpawnEggItem (MapleModEntityTypes.MUSHROOM, 0xF1BF7B, 0x705128, new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64)));

    //Kaiser Sword
    public static final RegistryObject<SwordItem> KAISER_KAISREUM = ITEMS.register("kaiser_kaisereum", () -> new SwordItem(MapleSetWeaponInit.MAPLE, 6, -2.0F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    //Dual Blade Dagger
    public static final RegistryObject<SwordItem> DUAL_BLADE_DAGGER = ITEMS.register("dual_blade_dagger", () -> new SwordItem(MapleSetWeaponInit.MAPLE, 6, 0.5F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    //Dual Blade Katara
    public static final RegistryObject<SwordItem> DUAL_BLADE_KATARA = ITEMS.register("dual_blade_katara", () -> new SwordItem(MapleSetWeaponInit.MAPLE, 6, 0.5F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    //Aran Polearm
    public static final RegistryObject<AxeItem> ARAN_AXE_ONE = ITEMS.register("aran_axe_one", () -> new AxeItem(MapleSetWeaponInit.MAPLE, 8, -3.0F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //Block Items
//    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(MapleModBlocks.RUBY_BLOCK.get()));

//    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(MapleModBlocks.RUBY_ORE.get()));

}
