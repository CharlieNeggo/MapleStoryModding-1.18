package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleCraArmorMaterial;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleCraItemTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleCRASetItems {

    //Weapons for AbsoLab Set
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    public static final RegistryObject<AxeItem> CRA_POLEARM = ITEMS.register("cra_polearm", () ->
            new AxeItem(MapleCraItemTier.CRA, 25, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> CRA_TWOHANDED_SWORD = ITEMS.register("cra_twohanded_sword", () ->
            new SwordItem(MapleCraItemTier.CRA, 20, -2.0F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> CRA_DAGGER = ITEMS.register("cra_dagger", () ->
            new SwordItem(MapleCraItemTier.CRA, 19, 0.5F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<SwordItem> CRA_KATARA = ITEMS.register("cra_katara", () ->
            new SwordItem(MapleCraItemTier.CRA, 15, 0.5F, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //Armor for AbsoLab Set
    public static final RegistryObject<ArmorItem> CRA_BANDIT_CAP = ITEMS.register("cra_bandit_cap", () ->
            new ArmorItem(MapleCraArmorMaterial.CRA, EquipmentSlot.HEAD, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> CRA_BANDIT_CHEST = ITEMS.register("cra_bandit_chest", () ->
            new ArmorItem(MapleCraArmorMaterial.CRA, EquipmentSlot.CHEST, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> CRA_BANDIT_LEGGINGS = ITEMS.register("cra_bandit_leggings", () ->
            new ArmorItem(MapleCraArmorMaterial.CRA, EquipmentSlot.LEGS, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<ArmorItem> CRA_KNIGHT_SHOES = ITEMS.register("cra_knight_shoes", () ->
            new ArmorItem(MapleCraArmorMaterial.CRA, EquipmentSlot.FEET, new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
}
