package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.util.enums.armor.MapleUtgardArmorMaterial;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleUtgardItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class MapleUtgardSetItems {

    //Weapons for Utgard Set
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    //Utgard set for warriors
    public static final RegistryObject<AxeItem> UTGARD_POLEARM = ITEMS.register("utgard_polearm", () -> new AxeItem(MapleUtgardItemTier.UTGARD, 20, -3.0F
            , new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<SwordItem> UTGARD_TWOHANDED_SWORD = ITEMS.register("utgard_twohanded_sword", () -> new SwordItem(MapleUtgardItemTier.UTGARD, 15, -2.0F
            , new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<SwordItem> UTGARD_KATANA = ITEMS.register("utgard_katana", () -> new SwordItem(MapleUtgardItemTier.UTGARD, 16, -1.8F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    //Bowman class
    public static final RegistryObject<BowItem> UTGARD_BOW = ITEMS.register("utgard_bow", () ->
            new BowItem(new Item.Properties().group(MapleStoryMod.TAB).maxStackSize(1)));
    public static final RegistryObject<BowItem> UTGARD_CROSSBOW = ITEMS.register("utgard_crossbow", () ->
            new BowItem(new Item.Properties().group(MapleStoryMod.TAB).maxStackSize(1)));

    //Magician Class
    public static final RegistryObject<SwordItem> UTGARD_STAFF = ITEMS.register("utgard_staff", () -> new SwordItem(MapleUtgardItemTier.UTGARD, 2, -2F
           , new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<SwordItem> UTGARD_SHINING_ROD = ITEMS.register("utgard_shining_rod", () -> new SwordItem(MapleUtgardItemTier.UTGARD, 2, -2F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    //Utgard set for thiefs
    public static final RegistryObject<SwordItem> UTGARD_DAGGER = ITEMS.register("utgard_dagger", () -> new SwordItem(MapleUtgardItemTier.UTGARD, 14, 0.5F
            , new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<SwordItem> UTGARD_KATARA = ITEMS.register("utgard_katara", () -> new SwordItem(MapleUtgardItemTier.UTGARD, 9, 0.5F
            , new Item.Properties().group(MapleStoryMod.TAB)));

    //Armor for Utgard Set
    //Utgard Set for Thiefs
    public static final RegistryObject<ArmorItem> UTGARD_CHASER_HAT = ITEMS.register("utgard_chaser_hat", () ->
            new ArmorItem(MapleUtgardArmorMaterial.UTGARD, EquipmentSlotType.HEAD, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_CHASER_CHEST = ITEMS.register("utgard_chaser_chest", () ->
            new ArmorItem(MapleUtgardArmorMaterial.UTGARD, EquipmentSlotType.CHEST, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_LEGGINGS = ITEMS.register("utgard_battle_leggings", () ->
            new ArmorItem(MapleUtgardArmorMaterial.UTGARD, EquipmentSlotType.LEGS, new Item.Properties().group(MapleStoryMod.TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_BOOTS = ITEMS.register("utgard_battle_boots", () ->
            new ArmorItem(MapleUtgardArmorMaterial.UTGARD, EquipmentSlotType.FEET, new Item.Properties().group(MapleStoryMod.TAB)));
}
