package com.charlieNgo.maplestorymod.init.ArcaneSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.WeaponItemsTier.DaggerItem;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Thief.MapleArcaneThiefBuff;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Thief.MapleArcaneThiefBuffTwo;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Thief.MapleArcaneThiefMaterial;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Warrior.MapleArcaneWarriorBuff;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Warrior.MapleArcaneWarriorBuffTwo;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Warrior.MapleArcaneWarriorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleArcaneSetItems {


    //Weapon Warriors
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    public static final RegistryObject<AxeItem> ARCANE_POLEARM = ITEMS.register("arcane_polearm", () -> new AxeItem(MapleArcaneWeaponInit.ARCANE, 24, -3.0F
            , new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ARCANE_TWOHANDED_SWORD = ITEMS.register("arcane_twohanded_sword", () -> new SwordItem(MapleArcaneWeaponInit.ARCANE, 20, -2.0F
            , new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Weapon for Thieves
    public static final RegistryObject<SwordItem> ARCANE_DAGGER = ITEMS.register("arcane_dagger", () -> new SwordItem(MapleArcaneWeaponInit.ARCANE, 16, 0.5F
            , new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<DaggerItem> ARCANE_KATARA = ITEMS.register("arcane_katara", () -> new DaggerItem(MapleArcaneWeaponInit.ARCANE, 16, 0.5F
            , new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Thiefs
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_HAT = ITEMS.register("arcane_thief_hat", () ->
            new MapleArcaneThiefBuffTwo(MapleArcaneThiefMaterial.ARCANE, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_CHEST = ITEMS.register("arcane_thief_chest", () ->
            new ArmorItem(MapleArcaneThiefMaterial.ARCANE, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_LEGGINGS = ITEMS.register("arcane_thief_leggings", () ->
            new ArmorItem(MapleArcaneThiefMaterial.ARCANE, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_SHOES = ITEMS.register("arcane_knight_shoes", () ->
            new MapleArcaneThiefBuff(MapleArcaneThiefMaterial.ARCANE, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    //Warriors
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_HAT = ITEMS.register("arcane_knight_hat", () ->
            new MapleArcaneWarriorBuffTwo(MapleArcaneWarriorMaterial.ARCANE, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_CHEST = ITEMS.register("arcane_knight_chest", () ->
            new ArmorItem(MapleArcaneWarriorMaterial.ARCANE, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_LEGGINGS = ITEMS.register("arcane_knight_leggings", () ->
            new ArmorItem(MapleArcaneWarriorMaterial.ARCANE, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_BOOTS = ITEMS.register("arcane_knight_boots", () ->
            new MapleArcaneWarriorBuff(MapleArcaneWarriorMaterial.ARCANE, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
