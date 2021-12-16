package com.charlieNgo.maplestorymod.init.UtgardSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.WeaponItemsTier.MapleBowItem;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Thief.MapleUtgardThiefBuff;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Thief.MapleUtgardThiefBuffTwo;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Thief.MapleUtgardThiefMaterial;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleUtgardSetItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    //Weapons Warrior
    public static final RegistryObject<AxeItem> UTGARD_POLEARM = ITEMS.register("utgard_polearm", () ->
            new AxeItem(MapleUtgardWeaponInit.UTGARD, 10, -3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> UTGARD_TWOHANDED_SWORD = ITEMS.register("utgard_twohanded_sword", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 8, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> UTGARD_KATANA = ITEMS.register("utgard_katana", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 7, -1.8F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Weapons Bowman
    public static final RegistryObject<MapleBowItem> UTGARD_BOW = ITEMS.register("utgard_bow", () ->
            new MapleBowItem(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(1)));
    public static final RegistryObject<CrossbowItem> UTGARD_CROSSBOW = ITEMS.register("utgard_crossbow", () ->
            new CrossbowItem(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(1)));

    //Weapons Magicians
    public static final RegistryObject<SwordItem> UTGARD_STAFF = ITEMS.register("utgard_staff", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 2, -2F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> UTGARD_SHINING_ROD = ITEMS.register("utgard_shining_rod", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 2, -2F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Weapons Thief
    public static final RegistryObject<SwordItem> UTGARD_DAGGER = ITEMS.register("utgard_dagger", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 6, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> UTGARD_KATARA = ITEMS.register("utgard_katara", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 6, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor Thief
    public static final RegistryObject<ArmorItem> UTGARD_CHASER_HAT = ITEMS.register("utgard_chaser_hat", () ->
            new MapleUtgardThiefBuff(MapleUtgardThiefMaterial.UTGARD, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_CHASER_CHEST = ITEMS.register("utgard_chaser_chest", () ->
            new ArmorItem(MapleUtgardThiefMaterial.UTGARD, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_CHASER_LEGGINGS = ITEMS.register("utgard_chaser_leggings", () ->
            new ArmorItem(MapleUtgardThiefMaterial.UTGARD, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_CHASER_BOOTS = ITEMS.register("utgard_chaser_boots", () ->
            new MapleUtgardThiefBuffTwo(MapleUtgardThiefMaterial.UTGARD, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor Warrior
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_HELMET = ITEMS.register("utgard_battle_helmet", () ->
            new MapleUtgardThiefBuff(MapleUtgardThiefMaterial.UTGARD, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_CHEST = ITEMS.register("utgard_battle_chest", () ->
            new ArmorItem(MapleUtgardThiefMaterial.UTGARD, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_LEGGINGS = ITEMS.register("utgard_battle_leggings", () ->
            new ArmorItem(MapleUtgardThiefMaterial.UTGARD, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_BOOTS = ITEMS.register("utgard_battle_boots", () ->
            new MapleUtgardThiefBuffTwo(MapleUtgardThiefMaterial.UTGARD, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
