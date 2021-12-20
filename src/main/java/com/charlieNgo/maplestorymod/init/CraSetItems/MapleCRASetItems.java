package com.charlieNgo.maplestorymod.init.CraSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.WeaponItemsTier.MapleBowItem;
import com.charlieNgo.maplestorymod.WeaponItemsTier.MapleCrossbowItem;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Thief.MapleArcaneThiefMaterial;
import com.charlieNgo.maplestorymod.init.CraSetItems.Bowman.MapleCraBowmanBuff;
import com.charlieNgo.maplestorymod.init.CraSetItems.Bowman.MapleCraBowmanBuffTwo;
import com.charlieNgo.maplestorymod.init.CraSetItems.Bowman.MapleCraBowmanMaterial;
import com.charlieNgo.maplestorymod.init.CraSetItems.Magician.MapleCraMagicianBuff;
import com.charlieNgo.maplestorymod.init.CraSetItems.Magician.MapleCraMagicianBuffTwo;
import com.charlieNgo.maplestorymod.init.CraSetItems.Magician.MapleCraMagicianMaterial;
import com.charlieNgo.maplestorymod.init.CraSetItems.Pirate.MapleCraPirateBuff;
import com.charlieNgo.maplestorymod.init.CraSetItems.Pirate.MapleCraPirateBuffTwo;
import com.charlieNgo.maplestorymod.init.CraSetItems.Pirate.MapleCraPirateMaterial;
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

    //Magician Items
    public static final RegistryObject<SwordItem> CRA_STAFF = ITEMS.register("cra_staff", () ->
            new SwordItem(MapleCraWeaponInit.CRA, 3, -2F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> CRA_WAND = ITEMS.register("cra_wand", ()->
            new SwordItem(MapleCraWeaponInit.CRA, 3, -2F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Bowman Items
    public static final RegistryObject<MapleCrossbowItem> CRA_CROSSBOW = ITEMS.register("cra_crossbow", () ->
            new MapleCrossbowItem(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(1)));
    public static final RegistryObject<MapleBowItem> CRA_BOW = ITEMS.register("cra_bow", () ->
            new MapleBowItem(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(1)));

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

    //Magician
    public static final RegistryObject<ArmorItem> CRA_DUNWITCH_HAT = ITEMS.register("cra_dunwitch_hat", () ->
            new MapleCraMagicianBuff(MapleCraMagicianMaterial.CRA, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_DUNWTICH_ROBE = ITEMS.register("cra_dunwitch_robe", () ->
            new ArmorItem(MapleCraMagicianMaterial.CRA, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_DUNWITCH_PANTS = ITEMS.register("cra_dunwitch_pants", () ->
            new MapleCraMagicianBuffTwo(MapleCraMagicianMaterial.CRA, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Pirate
    public static final RegistryObject<ArmorItem> CRA_WANDERER_HAT = ITEMS.register("cra_wanderer_hat", () ->
            new MapleCraPirateBuff(MapleCraPirateMaterial.CRA, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_WANDERER_COAT = ITEMS.register("cra_wanderer_coat", () ->
            new ArmorItem(MapleCraPirateMaterial.CRA, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_WANDERER_PANTS = ITEMS.register("cra_wanderer_pants", () ->
            new MapleCraPirateBuffTwo(MapleCraPirateMaterial.CRA, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Bowman
    public static final RegistryObject<ArmorItem> CRA_RANGER_BERET = ITEMS.register("cra_ranger_beret", () ->
            new MapleCraBowmanBuff(MapleCraBowmanMaterial.CRA, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_RANGER_COWL = ITEMS.register("cra_ranger_cowl", () ->
            new ArmorItem(MapleCraBowmanMaterial.CRA, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> CRA_RANGER_PANTS = ITEMS.register("cra_ranger_pants", () ->
            new MapleCraBowmanBuffTwo(MapleCraBowmanMaterial.CRA, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
