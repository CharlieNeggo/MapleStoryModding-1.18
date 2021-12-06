package com.charlieNgo.maplestorymod.init.ArcaneSetItems;

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

    public static final RegistryObject<AxeItem> ARCANE_POLEARM = ITEMS.register("arcane_polearm", () -> new AxeItem(MapleArcaneWeaponInit.ARCANE, 30, -3.0F
            , new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ARCANE_TWOHANDED_SWORD = ITEMS.register("arcane_twohanded_sword", () -> new SwordItem(MapleArcaneWeaponInit.ARCANE, 25, -2.0F
            , new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ARCANE_DAGGER = ITEMS.register("arcane_dagger", () -> new SwordItem(MapleArcaneWeaponInit.ARCANE, 24, 0.5F
            , new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ARCANE_KATARA = ITEMS.register("arcane_katara", () -> new SwordItem(MapleArcaneWeaponInit.ARCANE, 20, 0.5F
            , new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));

    //Armor Set for Arcane
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_HAT = ITEMS.register("arcane_thief_hat", () ->
            new ArmorItem(MapleArcaneMaterialInit.ARCANE, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_CHEST = ITEMS.register("arcane_thief_chest", () ->
            new ArmorItem(MapleArcaneMaterialInit.ARCANE, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_THIEF_LEGGINGS = ITEMS.register("arcane_thief_leggings", () ->
            new ArmorItem(MapleArcaneMaterialInit.ARCANE, EquipmentSlot.LEGS, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> ARCANE_KNIGHT_SHOES = ITEMS.register("arcane_knight_shoes", () ->
            new ArmorItem(MapleArcaneMaterialInit.ARCANE, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
