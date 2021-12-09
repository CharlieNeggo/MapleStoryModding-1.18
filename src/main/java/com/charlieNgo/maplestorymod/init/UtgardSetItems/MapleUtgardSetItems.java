package com.charlieNgo.maplestorymod.init.UtgardSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleUtgardSetItems {

    //Weapons for Utgard Set
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MODID);

    //Utgard set for warriors
    public static final RegistryObject<AxeItem> UTGARD_POLEARM = ITEMS.register("utgard_polearm", () ->
            new AxeItem(MapleUtgardWeaponInit.UTGARD, 20, -3.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> UTGARD_TWOHANDED_SWORD = ITEMS.register("utgard_twohanded_sword", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 15, -2.0F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> UTGARD_KATANA = ITEMS.register("utgard_katana", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 16, -1.8F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Bowman class
//    public static final RegistryObject<BowItem> UTGARD_BOW = ITEMS.register("utgard_bow", () ->
//            new BowItem(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).maxStackSize(1)));
//    public static final RegistryObject<BowItem> UTGARD_CROSSBOW = ITEMS.register("utgard_crossbow", () ->
//            new BowItem(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).maxStackSize(1)));

    //Magician Class
    public static final RegistryObject<SwordItem> UTGARD_STAFF = ITEMS.register("utgard_staff", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 2, -2F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> UTGARD_SHINING_ROD = ITEMS.register("utgard_shining_rod", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 2, -2F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Utgard set for thiefs
    public static final RegistryObject<SwordItem> UTGARD_DAGGER = ITEMS.register("utgard_dagger", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 14, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> UTGARD_KATARA = ITEMS.register("utgard_katara", () ->
            new SwordItem(MapleUtgardWeaponInit.UTGARD, 9, 0.5F, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor for Utgard Set
    //Utgard Set for Thiefs
    public static final RegistryObject<ArmorItem> UTGARD_CHASER_HAT = ITEMS.register("utgard_chaser_hat", () ->
            new ArmorItem(MapleUtgardMaterialInit.UTGARD, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_CHASER_CHEST = ITEMS.register("utgard_chaser_chest", () ->
            new ArmorItem(MapleUtgardMaterialInit.UTGARD, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_LEGGINGS = ITEMS.register("utgard_battle_leggings", () ->
            new ArmorItem(MapleUtgardMaterialInit.UTGARD, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_BOOTS = ITEMS.register("utgard_battle_boots", () ->
            new ArmorItem(MapleUtgardMaterialInit.UTGARD, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
