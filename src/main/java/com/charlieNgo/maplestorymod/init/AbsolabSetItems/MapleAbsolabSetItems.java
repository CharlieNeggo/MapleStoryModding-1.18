package com.charlieNgo.maplestorymod.init.AbsolabSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleAbsolabSetItems {

    //Weapons for AbsoLab Set
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    public static final RegistryObject<AxeItem> ABSOLAB_POLEARM = ITEMS.register("absolab_polearm", () ->
            new AxeItem(MapleAbsolabWeaponInit.ABSOLAB, 25, -3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ABSOLAB_TWOHANDED_SWORD = ITEMS.register("absolab_twohanded_sword", () ->
            new SwordItem(MapleAbsolabWeaponInit.ABSOLAB, 20, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ABSOLAB_DAGGER = ITEMS.register("absolab_dagger", () ->
            new SwordItem(MapleAbsolabWeaponInit.ABSOLAB, 19, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ABSOLAB_KATARA = ITEMS.register("absolab_katara", () ->
            new SwordItem(MapleAbsolabWeaponInit.ABSOLAB, 15, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor for AbsoLab Set
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_CAP = ITEMS.register("absolab_bandit_cap", () ->
            new ArmorItem(MapleAbsolabMaterialInit.ABSOLAB, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_CHEST = ITEMS.register("absolab_bandit_chest", () ->
            new ArmorItem(MapleAbsolabMaterialInit.ABSOLAB, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_LEGGINGS = ITEMS.register("absolab_bandit_leggings", () ->
            new ArmorItem(MapleAbsolabMaterialInit.ABSOLAB, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_KNIGHT_SHOES = ITEMS.register("absolab_knight_shoes", () ->
            new ArmorItem(MapleAbsolabMaterialInit.ABSOLAB, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
