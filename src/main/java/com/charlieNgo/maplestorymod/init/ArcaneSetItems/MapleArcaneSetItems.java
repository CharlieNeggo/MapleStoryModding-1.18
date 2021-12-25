package com.charlieNgo.maplestorymod.init.ArcaneSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.weaponitemstier.DaggerItem.MapleDaggerItem;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Bowman.MapleArcaneBowmanBuff;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Bowman.MapleArcaneBowmanBuffTwo;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Bowman.MapleArcaneBowmanMaterial;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Magician.MapleArcaneMagicianBuff;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Magician.MapleArcaneMagicianBuffTwo;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Magician.MapleArcaneMagicianMaterial;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Pirate.MapleArcanePirateBuff;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Pirate.MapleArcanePirateBuffTwo;
import com.charlieNgo.maplestorymod.init.ArcaneSetItems.Pirate.MapleArcanePirateMaterial;
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
    public static final RegistryObject<MapleDaggerItem> ARCANE_KATARA = ITEMS.register("arcane_katara", () -> new MapleDaggerItem(MapleArcaneWeaponInit.ARCANE, 16, 0.5F
            , new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Thiefs
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_HAT = ITEMS.register("arcane_thief_hat", () ->
            new MapleArcaneThiefBuff(MapleArcaneThiefMaterial.ARCANE, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_SUIT = ITEMS.register("arcane_thief_suit", () ->
            new ArmorItem(MapleArcaneThiefMaterial.ARCANE, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_SHOES = ITEMS.register("arcane_knight_shoes", () ->
            new MapleArcaneThiefBuffTwo(MapleArcaneThiefMaterial.ARCANE, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    //Warriors
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_HAT = ITEMS.register("arcane_knight_hat", () ->
            new MapleArcaneWarriorBuffTwo(MapleArcaneWarriorMaterial.ARCANE, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_SUIT = ITEMS.register("arcane_knight_suit", () ->
            new ArmorItem(MapleArcaneWarriorMaterial.ARCANE, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_BOOTS = ITEMS.register("arcane_knight_boots", () ->
            new MapleArcaneWarriorBuff(MapleArcaneWarriorMaterial.ARCANE, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Bowman
    public static final RegistryObject<ArmorItem> ARCANE_ARCHER_HAT = ITEMS.register("arcane_archer_hat", () ->
            new MapleArcaneBowmanBuff(MapleArcaneBowmanMaterial.ARCANE, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_ARCHER_SUIT = ITEMS.register("arcane_archer_suit", () ->
            new ArmorItem(MapleArcaneBowmanMaterial.ARCANE, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_ARCHER_SHOES = ITEMS.register("arcane_archer_shoes", () ->
            new MapleArcaneBowmanBuffTwo(MapleArcaneBowmanMaterial.ARCANE, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Pirate
    public static final RegistryObject<ArmorItem> ARCANE_PIRATE_HAT = ITEMS.register("arcane_pirate_hat", () ->
            new MapleArcanePirateBuff(MapleArcanePirateMaterial.ARCANE, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_PIRATE_SUIT = ITEMS.register("arcane_pirate_suit", () ->
            new ArmorItem(MapleArcanePirateMaterial.ARCANE, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_PIRATE_SHOES = ITEMS.register("arcane_pirate_shoes", () ->
            new MapleArcanePirateBuffTwo(MapleArcanePirateMaterial.ARCANE, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Magician
    public static final RegistryObject<ArmorItem> ARCANE_MAGE_HAT = ITEMS.register("arcane_mage_hat", () ->
            new MapleArcaneMagicianBuff(MapleArcaneMagicianMaterial.ARCANE, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_MAGE_SUIT = ITEMS.register("arcane_mage_suit", () ->
            new ArmorItem(MapleArcaneMagicianMaterial.ARCANE, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_MAGE_SHOES = ITEMS.register("arcane_mage_shoes", () ->
            new MapleArcaneMagicianBuffTwo(MapleArcaneMagicianMaterial.ARCANE, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
