package com.charlieNgo.maplestorymod.init.MapleSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.blocks.MapleStoryBlocks;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    // For Armor Sets/Weapons for what material their going to be made out of
    public static final RegistryObject<Item> MAPLE = ITEMS.register("maple", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> UTGARD = ITEMS.register("utgard", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> ABSOLAB_ESSENCE = ITEMS.register("absolab_essence", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> ARCANE_ESSENCE = ITEMS.register("arcane_essence", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> CRA = ITEMS.register("cra", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> SILVER = ITEMS.register("silver_ore", ()->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));

    // Items
    public static final RegistryObject<Item> ORANGEMUSHROOMCAP = ITEMS.register("orangemushroomcap", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> SQUISHY_LIQUID = ITEMS.register("squishy_liquid", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> BLUE_SNAIL_SHELL = ITEMS.register("blue_snail_shell", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> SLIME_BUBBLE =  ITEMS.register("slime_bubble", () ->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> OCTOPUS_TENTACLE = ITEMS.register("octopus_tentacle",()->
            new Item(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(64)));

    //Kaiser Sword
    public static final RegistryObject<SwordItem> KAISER_KAISREUM = ITEMS.register("kaiser_kaisereum", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 15, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    //Dual Blade Dagger
    public static final RegistryObject<SwordItem> DUAL_BLADE_DAGGER = ITEMS.register("dual_blade_dagger", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 6, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    //Dual Blade Katara
    public static final RegistryObject<SwordItem> DUAL_BLADE_KATARA = ITEMS.register("dual_blade_katara", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 6, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    //Aran Polearm
    public static final RegistryObject<AxeItem> ARAN_AXE_ONE = ITEMS.register("aran_axe_one", () ->
            new AxeItem(MapleSetWeaponInit.MAPLE, 12, -3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Items for daggers levels 10-130
    public static final RegistryObject<SwordItem> BEGINNER_DAGGER = ITEMS.register("beginner_dagger", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 1, 3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> IRON_DAGGER = ITEMS.register("iron_dagger", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 2, 3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> DRAGON_TOENAIL_DAGGER = ITEMS.register("dragon_toenail_dagger", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 3, 3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> CURSAYER_DAGGER = ITEMS.register("cursayer_dagger", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 5, 3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> TIMELESS_PESCAS_DAGGER = ITEMS.register("timeless_pescas_dagger", ()->
            new SwordItem(MapleSetWeaponInit.MAPLE, 6, 3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Items for Two handed swords 10-130
    public static final RegistryObject<SwordItem> SPARTA = ITEMS.register("sparta", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 3, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> BASIC_TWOHANDED_SWORD = ITEMS.register("basic_twohanded_sword", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 2, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ZARD = ITEMS.register("zard", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 4, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> DOOMBRINGER = ITEMS.register("doombringer", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 5, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> DEVIL_SUNRISE = ITEMS.register("devil_sunrise", ()->
            new SwordItem(MapleSetWeaponInit.MAPLE, 6, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Block Items
    public static final RegistryObject<BlockItem> SILVER_ORE_BLOCK = ITEMS.register("silver_ore_block",
            () -> new BlockItem(MapleStoryBlocks.SILVER_ORE_BLOCK.get(),
                    new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

}
