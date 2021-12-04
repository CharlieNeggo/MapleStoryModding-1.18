package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleAbsolabArmorMaterial;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleArcaneItemTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleArcaneSetItems {


    //Weapon Set for Arcane
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    public static final RegistryObject<AxeItem> ARCANE_POLEARM = ITEMS.register("arcane_polearm", () -> new AxeItem(MapleArcaneItemTier.ARCANE, 30, -3.0F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> ARCANE_TWOHANDED_SWORD = ITEMS.register("arcane_twohanded_sword", () -> new SwordItem(MapleArcaneItemTier.ARCANE, 25, -2.0F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> ARCANE_DAGGER = ITEMS.register("arcane_dagger", () -> new SwordItem(MapleArcaneItemTier.ARCANE, 24, 0.5F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> ARCANE_KATARA = ITEMS.register("arcane_katara", () -> new SwordItem(MapleArcaneItemTier.ARCANE, 20, 0.5F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //Armor Set for Arcane
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_HAT = ITEMS.register("arcane_thief_hat", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_CHEST = ITEMS.register("arcane_thief_chest", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_LEGGINGS = ITEMS.register("arcane_thief_leggings", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_SHOES = ITEMS.register("arcane_knight_shoes", () ->
            new ArmorItem(MapleAbsolabArmorMaterial.ABSOLAB, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}
