package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleAbsolabArmorMaterial;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleAbsolabItemTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleAbsolabSetItems {

    //Weapons for AbsoLab Set
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    public static final RegistryObject<AxeItem> ABSOLAB_POLEARM = ITEMS.register("absolab_polearm", () ->
            new AxeItem(MapleAbsolabItemTier.ABSOLAB, 25, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> ABSOLAB_TWOHANDED_SWORD = ITEMS.register("absolab_twohanded_sword", () ->
            new SwordItem(MapleAbsolabItemTier.ABSOLAB, 20, -2.0F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> ABSOLAB_DAGGER = ITEMS.register("absolab_dagger", () ->
            new SwordItem(MapleAbsolabItemTier.ABSOLAB, 19, 0.5F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> ABSOLAB_KATARA = ITEMS.register("absolab_katara", () ->
            new SwordItem(MapleAbsolabItemTier.ABSOLAB, 15, 0.5F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //Armor for AbsoLab Set
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_CAP = ITEMS.register("absolab_bandit_cap", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_CHEST = ITEMS.register("absolab_bandit_chest", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_LEGGINGS = ITEMS.register("absolab_bandit_leggings", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> ABSOLAB_KNIGHT_SHOES = ITEMS.register("absolab_knight_shoes", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}
