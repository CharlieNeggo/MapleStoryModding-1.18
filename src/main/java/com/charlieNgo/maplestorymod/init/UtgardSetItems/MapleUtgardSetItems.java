package com.charlieNgo.maplestorymod.init.UtgardSetItems;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Bowman.MapleUtgardBowmanBuff;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Bowman.MapleUtgardBowmanBuffTwo;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Bowman.MapleUtgardBowmanMaterial;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Magician.MapleUtgardMagicianBuff;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Magician.MapleUtgardMagicianBuffTwo;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Magician.MapleUtgardMagicianMaterial;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Pirate.MapleUtgardPirateBuff;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Pirate.MapleUtgardPirateMaterial;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Thief.MapleUtgardThiefBuff;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Thief.MapleUtgardThiefMaterial;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Thief.MapleUtgardThiefBuffTwo;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Warrior.MapleUtgardWarriorBuff;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Warrior.MapleUtgardWarriorBuffTwo;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Warrior.MapleUtgardWarriorMaterial;
import com.charlieNgo.maplestorymod.weaponitemstier.BowItem.MapleBowItem;
import com.charlieNgo.maplestorymod.weaponitemstier.BowItem.MapleCrossbowItem;
import com.charlieNgo.maplestorymod.weaponitemstier.BowItem.MapleStoryBow;
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
            new MapleBowItem(1, 1, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(1)));
    public static final RegistryObject<MapleCrossbowItem> UTGARD_CROSSBOW = ITEMS.register("utgard_crossbow", () ->
            new MapleCrossbowItem(new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB).stacksTo(1)));
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
    public static final RegistryObject<ArmorItem> UTGARD_CHASER_BOOTS = ITEMS.register("utgard_chaser_boots", () ->
            new MapleUtgardThiefBuffTwo(MapleUtgardThiefMaterial.UTGARD, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    //Armor Warrior
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_HELMET = ITEMS.register("utgard_battle_helmet", () ->
            new MapleUtgardWarriorBuff(MapleUtgardWarriorMaterial.UTGARD, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_CHEST = ITEMS.register("utgard_battle_chest", () ->
            new ArmorItem(MapleUtgardWarriorMaterial.UTGARD, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_BATTLE_BOOTS = ITEMS.register("utgard_battle_boots", () ->
            new MapleUtgardWarriorBuffTwo(MapleUtgardWarriorMaterial.UTGARD, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    //Armor Bowman
    public static final RegistryObject<ArmorItem> UTGARD_SENTINEL_CAP = ITEMS.register("utgard_sentinel_cap", () ->
            new MapleUtgardBowmanBuff(MapleUtgardBowmanMaterial.UTGARD, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_SENTINEL_CHEST = ITEMS.register("utgard_sentinel_chest", () ->
            new ArmorItem(MapleUtgardBowmanMaterial.UTGARD, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_SENTINEL_BOOTS = ITEMS.register("utgard_sentinel_boots", () ->
            new MapleUtgardBowmanBuffTwo(MapleUtgardBowmanMaterial.UTGARD, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    //Armor Pirate
    public static final RegistryObject<ArmorItem> UTGARD_SKIPPER_HAT = ITEMS.register("utgard_skipper_hat", () ->
            new MapleUtgardPirateBuff(MapleUtgardPirateMaterial.UTGARD, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_SKIPPER_COAT = ITEMS.register("utgard_skipper_coat", () ->
            new ArmorItem(MapleUtgardPirateMaterial.UTGARD, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_SKIPPER_BOOTS = ITEMS.register("utgard_skipper_boots", () ->
            new MapleUtgardPirateBuff(MapleUtgardPirateMaterial.UTGARD, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    //Armor Magician
    public static final RegistryObject<ArmorItem> UTGARD_MAGE_SALLET = ITEMS.register("utgard_mage_sallet", () ->
            new MapleUtgardMagicianBuff(MapleUtgardMagicianMaterial.UTGARD, EquipmentSlot.HEAD, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_MAGE_ROBE = ITEMS.register("utgard_mage_robe", () ->
            new ArmorItem(MapleUtgardMagicianMaterial.UTGARD, EquipmentSlot.CHEST, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> UTGARD_MAGE_BOOTS = ITEMS.register("utgard_mage_boots", () ->
            new MapleUtgardMagicianBuffTwo(MapleUtgardMagicianMaterial.UTGARD, EquipmentSlot.FEET, new Item.Properties().tab(MapleStoryMod.MAPLESTORY_TAB)));
}
