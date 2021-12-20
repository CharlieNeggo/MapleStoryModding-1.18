package com.charlieNgo.maplestorymod.init.AbsolabSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Bowman.AbsolabBowmanBuff;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Bowman.AbsolabBowmanBuffTwo;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Bowman.MapleAbsolabBowmanMaterial;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Magician.AbsolabMagicianBuff;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Magician.AbsolabMagicianBuffTwo;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Magician.MapleAbsolabMagicianMaterial;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Pirate.AbsolabPirateBuff;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Pirate.AbsolabPirateBuffTwo;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Pirate.MapleAbsolabPirateMaterial;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Thief.AbsolabThiefBuff;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Thief.AbsolabThiefBuffTwo;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Thief.MapleAbsolabThiefMaterial;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Warrior.AbsolabWarriorBuff;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Warrior.AbsolabWarriorBuffTwo;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.Warrior.MapleAbsolabWarriorMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleAbsolabSetItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    //Warrior Weapons
    public static final RegistryObject<AxeItem> ABSOLAB_POLEARM = ITEMS.register("absolab_polearm", () ->
            new AxeItem(MapleAbsolabWeaponInit.ABSOLAB, 20, -3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ABSOLAB_TWOHANDED_SWORD = ITEMS.register("absolab_twohanded_sword", () ->
            new SwordItem(MapleAbsolabWeaponInit.ABSOLAB, 16, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Thief Weapons
    public static final RegistryObject<SwordItem> ABSOLAB_DAGGER = ITEMS.register("absolab_dagger", () ->
            new SwordItem(MapleAbsolabWeaponInit.ABSOLAB, 12, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ABSOLAB_KATARA = ITEMS.register("absolab_katara", () ->
            new SwordItem(MapleAbsolabWeaponInit.ABSOLAB, 12, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor for Thief
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_CAP = ITEMS.register("absolab_bandit_cap", () ->
            new AbsolabThiefBuff(MapleAbsolabThiefMaterial.ABSOLAB, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_BANDIT_CHEST = ITEMS.register("absolab_bandit_chest", () ->
            new ArmorItem(MapleAbsolabThiefMaterial.ABSOLAB, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_KNIGHT_SHOES = ITEMS.register("absolab_knight_shoes", () ->
            new AbsolabThiefBuffTwo(MapleAbsolabThiefMaterial.ABSOLAB, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor for Warriors
    public static final RegistryObject<ArmorItem> ABSOLAB_KNIGHT_HELMET = ITEMS.register("absolab_knight_helmet", () ->
            new AbsolabWarriorBuff(MapleAbsolabWarriorMaterial.ABSOLAB, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_KNIGHT_CHEST = ITEMS.register("absolab_knight_chest", () ->
            new ArmorItem(MapleAbsolabWarriorMaterial.ABSOLAB, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_KNIGHT_SHOE = ITEMS.register("absolab_knight_shoe", () ->
            new AbsolabWarriorBuffTwo(MapleAbsolabWarriorMaterial.ABSOLAB, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor for Magicians
    public static final RegistryObject<ArmorItem> ABSOLAB_MAGE_CROWN = ITEMS.register("absolab_mage_crown", () ->
            new AbsolabMagicianBuff(MapleAbsolabMagicianMaterial.ABSOLAB, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_MAGE_SUIT = ITEMS.register("absolab_mage_suit", () ->
            new ArmorItem(MapleAbsolabMagicianMaterial.ABSOLAB, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_MAGE_SHOES = ITEMS.register("absolab_mage_shoes", () ->
            new AbsolabMagicianBuffTwo(MapleAbsolabMagicianMaterial.ABSOLAB, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor for bowman
    public static final RegistryObject<ArmorItem> ABSOLAB_ARCHER_HOOD = ITEMS.register("absolab_archer_hood", () ->
            new AbsolabBowmanBuff(MapleAbsolabBowmanMaterial.ABSOLAB, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_ARCHER_SUIT = ITEMS.register("absolab_archer_suit", () ->
            new ArmorItem(MapleAbsolabBowmanMaterial.ABSOLAB, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_ARCHER_SHOES = ITEMS.register("absolab_archer_shoes", () ->
            new AbsolabBowmanBuffTwo(MapleAbsolabBowmanMaterial.ABSOLAB, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor for Pirate
    public static final RegistryObject<ArmorItem> ABSOLAB_PIRATE_FEDORA = ITEMS.register("absolab_pirate_fedora", () ->
            new AbsolabPirateBuff(MapleAbsolabPirateMaterial.ABSOLAB, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_PIRATE_SUIT = ITEMS.register("absolab_pirate_suit", () ->
            new ArmorItem(MapleAbsolabPirateMaterial.ABSOLAB, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ABSOLAB_PIRATE_SHOES = ITEMS.register("absolab_pirate_shoes", () ->
            new AbsolabPirateBuffTwo(MapleAbsolabPirateMaterial.ABSOLAB, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
