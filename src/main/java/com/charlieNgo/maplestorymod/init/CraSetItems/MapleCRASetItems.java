package com.charlieNgo.maplestorymod.init.CraSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.MapleArcaneMaterialInit;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleCraArmorMaterial;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleCraItemTier;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleCRASetItems {

    //Weapons for Cra Set
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    public static final RegistryObject<AxeItem> CRA_POLEARM = ITEMS.register("cra_polearm", () ->
            new AxeItem(MapleCraWeaponInit.CRA, 25, -3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> CRA_TWOHANDED_SWORD = ITEMS.register("cra_twohanded_sword", () ->
            new SwordItem(MapleCraWeaponInit.CRA, 20, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> CRA_DAGGER = ITEMS.register("cra_dagger", () ->
            new SwordItem(MapleCraWeaponInit.CRA, 19, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> CRA_KATARA = ITEMS.register("cra_katara", () ->
            new SwordItem(MapleCraWeaponInit.CRA, 15, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor for AbsoLab Set
    public static final RegistryObject<ArmorItem> CRA_ASSASSIN_HOOD = ITEMS.register("cra_assassin_hood", () ->
            new ArmorItem(MapleCraMaterialInit.CRA, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_ASSASSIN_CHEST = ITEMS.register("cra_assassin_chest", () ->
            new ArmorItem(MapleCraMaterialInit.CRA, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_ASSASSIN_LEGGINGS = ITEMS.register("cra_assassin_leggings", () ->
            new ArmorItem(MapleCraMaterialInit.CRA, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
