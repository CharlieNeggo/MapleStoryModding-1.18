package com.charlieNgo.maplestorymod.init.CraSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Thief.MapleArcaneThiefMaterial;
import com.charlieNgo.maplestorymod.init.CraSetItems.Thief.MapleCraThiefBuff;
import com.charlieNgo.maplestorymod.init.CraSetItems.Thief.MapleCraThiefBuffTwo;
import com.charlieNgo.maplestorymod.init.CraSetItems.Thief.MapleCraThiefMaterial;
import com.charlieNgo.maplestorymod.init.CraSetItems.Warrior.MapleCraWarriorBuff;
import com.charlieNgo.maplestorymod.init.CraSetItems.Warrior.MapleCraWarriorBuffTwo;
import com.charlieNgo.maplestorymod.init.CraSetItems.Warrior.MapleCraWarriorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleCRASetItems {

    //Weapons for Cra Set
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    //Warrior Weapons
    public static final RegistryObject<AxeItem> CRA_POLEARM = ITEMS.register("cra_polearm", () ->
            new AxeItem(MapleCraWeaponInit.CRA, 16, -3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> CRA_TWOHANDED_SWORD = ITEMS.register("cra_twohanded_sword", () ->
            new SwordItem(MapleCraWeaponInit.CRA, 13, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Thief Weapons
    public static final RegistryObject<SwordItem> CRA_DAGGER = ITEMS.register("cra_dagger", () ->
            new SwordItem(MapleCraWeaponInit.CRA, 9, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> CRA_KATARA = ITEMS.register("cra_katara", () ->
            new SwordItem(MapleCraWeaponInit.CRA, 9, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Thief
    public static final RegistryObject<ArmorItem> CRA_ASSASSIN_HOOD = ITEMS.register("cra_assassin_hood", () ->
            new MapleCraThiefBuffTwo(MapleCraThiefMaterial.CRA, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_ASSASSIN_CHEST = ITEMS.register("cra_assassin_chest", () ->
            new ArmorItem(MapleCraThiefMaterial.CRA, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_ASSASSIN_LEGGINGS = ITEMS.register("cra_assassin_leggings", () ->
            new MapleCraThiefBuff(MapleCraThiefMaterial.CRA, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Warrior
    public static final RegistryObject<ArmorItem> CRA_WARRIOR_HELMET = ITEMS.register("cra_warrior_helmet", () ->
            new MapleCraWarriorBuff(MapleCraWarriorMaterial.CRA, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_WARRIOR_CHEST = ITEMS.register("cra_warrior_chest", () ->
            new ArmorItem(MapleCraWarriorMaterial.CRA, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_WARRIOR_PANTS = ITEMS.register("cra_warrior_pants", () ->
            new MapleCraWarriorBuffTwo(MapleCraWarriorMaterial.CRA, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
