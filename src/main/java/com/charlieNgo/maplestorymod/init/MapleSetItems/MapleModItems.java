package com.charlieNgo.maplestorymod.init.MapleSetItems;

import com.charlieNgo.maplestorymod.init.MapleSilverMaterial;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Warrior.MapleUtgardWarriorBuff;
import com.charlieNgo.maplestorymod.init.UtgardSetItems.Warrior.MapleUtgardWarriorBuffTwo;
import com.charlieNgo.maplestorymod.setup.MapleSetup;
import com.charlieNgo.maplestorymod.util.weaponitemstier.BowItem.MapleBowItem;
import com.charlieNgo.maplestorymod.util.weaponitemstier.DaggerItem.MapleDaggerItem;
import com.charlieNgo.maplestorymod.blocks.MapleStoryBlocks;
import com.charlieNgo.maplestorymod.world.structures.HenesyStructure;
import com.charlieNgo.maplestorymod.world.structures.LithHarborStructure;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.charlieNgo.maplestorymod.MapleStoryMod.MODID;

public class MapleModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<StructureFeature<?>> STRUCTURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, MODID);


    // For Armor Sets/Weapons for what material their going to be made out of
    public static final RegistryObject<Item> MAPLE = ITEMS.register("maple", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> UTGARD = ITEMS.register("utgard", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> ABSOLAB_ESSENCE = ITEMS.register("absolab_essence", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> ARCANE_ESSENCE = ITEMS.register("arcane_essence", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> CRA = ITEMS.register("cra", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> SILVER = ITEMS.register("silver_ore", ()->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    //Currency
    public static final RegistryObject<Item> MESO_ZERO = ITEMS.register("meso_zero", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> MESO_ONE = ITEMS.register("meso_one", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> MESO_TWO = ITEMS.register("meso_two", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> MESO_THREE = ITEMS.register("meso_three", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    //Items
    public static final RegistryObject<Item> ORANGEMUSHROOMCAP = ITEMS.register("orangemushroomcap", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> SQUISHY_LIQUID = ITEMS.register("squishy_liquid", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> BLUE_SNAIL_SHELL = ITEMS.register("blue_snail_shell", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> SLIME_BUBBLE =  ITEMS.register("slime_bubble", () ->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> OCTOPUS_TENTACLE = ITEMS.register("octopus_tentacle",()->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> MUD_CLUMP = ITEMS.register("mud_clump",()->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> SMIRKY_SEEDLING = ITEMS.register("smirky_seedling",()->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> DRAKE_SKULL = ITEMS.register("drake_skull",()->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    public static final RegistryObject<Item> WOODEN_BOARD = ITEMS.register("wooden_board",()->
            new Item(new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(64)));
    //OG weapons
    public static final RegistryObject<SwordItem> KAISER_KAISREUM = ITEMS.register("kaiser_kaisereum", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 15, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> DUAL_BLADE_DAGGER = ITEMS.register("dual_blade_dagger", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 6, 0.5F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> DUAL_BLADE_KATARA = ITEMS.register("dual_blade_katara", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 6, 0.5F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<AxeItem> ARAN_AXE_ONE = ITEMS.register("aran_axe_one", () ->
            new AxeItem(MapleSetWeaponInit.MAPLE, 12, -3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    //Items for daggers/kataras levels 10-130
    public static final RegistryObject<SwordItem> BEGINNER_DAGGER = ITEMS.register("beginner_dagger", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 1, 3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> IRON_DAGGER = ITEMS.register("iron_dagger", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 2, 3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> DRAGON_TOENAIL_DAGGER = ITEMS.register("dragon_toenail_dagger", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 3, 3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> CURSAYER_DAGGER = ITEMS.register("cursayer_dagger", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 5, 3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> TIMELESS_PESCAS_DAGGER = ITEMS.register("timeless_pescas_dagger", ()->
            new SwordItem(MapleSetWeaponInit.MAPLE, 6, 3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<MapleDaggerItem> CHAMPION_KATARA = ITEMS.register("champion_katara", () ->
            new MapleDaggerItem(MapleSetWeaponInit.MAPLE, 2, 3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<MapleDaggerItem> JUSTICE_KATARA = ITEMS.register("justice_katara", () ->
            new MapleDaggerItem(MapleSetWeaponInit.MAPLE, 3, 3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<MapleDaggerItem> MOONSLICER_KATARA= ITEMS.register("moonslicer_katara", () ->
            new MapleDaggerItem(MapleSetWeaponInit.MAPLE, 5, 3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<MapleDaggerItem> BLOODSOAKED_KATARA = ITEMS.register("bloodsoaked_katara", () ->
            new MapleDaggerItem(MapleSetWeaponInit.MAPLE, 6, 3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<MapleDaggerItem> TIMELESS_KATARA = ITEMS.register("timeless_katara", ()->
            new MapleDaggerItem(MapleSetWeaponInit.MAPLE, 7, 3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    //Items for Two-handed swords 10-130
    public static final RegistryObject<SwordItem> SPARTA = ITEMS.register("sparta", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 3, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> BASIC_TWOHANDED_SWORD = ITEMS.register("basic_twohanded_sword", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 2, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> ZARD = ITEMS.register("zard", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 4, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> DOOMBRINGER = ITEMS.register("doombringer", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 5, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> DEVIL_SUNRISE = ITEMS.register("devil_sunrise", ()->
            new SwordItem(MapleSetWeaponInit.MAPLE, 6, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    //Items for Pole-arms 10-130
    public static final RegistryObject<SwordItem> BASIC_POLEARM = ITEMS.register("basic_polearm", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 4, -3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> STEEL_POLEARM = ITEMS.register("steel_polearm", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 5, -3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> SKYLAR_POLEARM = ITEMS.register("skylar_polearm", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 7, -3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> HELLSLAYER_POLEARM = ITEMS.register("hellslayer_polearm", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 8, -3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> TIMELESS_POLEARM = ITEMS.register("timeless_polearm", ()->
            new SwordItem(MapleSetWeaponInit.MAPLE, 9, -3.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    //Items for Shining Rods for 10-130
    public static final RegistryObject<SwordItem> PLAIN = ITEMS.register("plain", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 1, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> DECOR = ITEMS.register("decor", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 2, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> LIGHT_SAGE_WING = ITEMS.register("light_sage_wing", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 3, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> GLEAMING_GOLD_WING = ITEMS.register("gleaming_gold_wing", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 4, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<SwordItem> TIMELESS_DEAD_END = ITEMS.register("timeless_dead_end", () ->
            new SwordItem(MapleSetWeaponInit.MAPLE, 5, -2.0F, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    //Item for Bowman for 10-130
    public static final RegistryObject<MapleBowItem> BEGINNER_BOWMAN_BOW = ITEMS.register("beginner_bowman_bow", () ->
            new MapleBowItem(1, 1,  new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(1)));
    public static final RegistryObject<MapleBowItem> RYDEN = ITEMS.register("ryden", () ->
            new MapleBowItem(1, 1, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(1)));
    public static final RegistryObject<MapleBowItem> RED_HINKEL = ITEMS.register("red_hinkel", () ->
            new MapleBowItem(1, 1, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(1)));
    public static final RegistryObject<MapleBowItem> METUS = ITEMS.register("metus", () ->
            new MapleBowItem(1, 1, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(1)));
    public static final RegistryObject<MapleBowItem> TIMELESS_ENGAW = ITEMS.register("timeless_engaw", () ->
            new MapleBowItem(1, 1, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB).stacksTo(1)));
    //Armor for warriors 10-130
    public static final RegistryObject<ArmorItem> RED_DUKE = ITEMS.register("red_duke", () ->
            new MapleUtgardWarriorBuff(MapleSilverMaterial.SILVER, EquipmentSlot.HEAD, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> YELLOW_JANGOON_ARMOR = ITEMS.register("yellow_jangoon_armor", () ->
            new ArmorItem(MapleSilverMaterial.SILVER, EquipmentSlot.CHEST, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> BROWN_JANGOON_PANTS = ITEMS.register("brown_jangoon_pants", () ->
            new ArmorItem(MapleSilverMaterial.SILVER, EquipmentSlot.LEGS, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<ArmorItem> MAROON_JANGOON_SHOES = ITEMS.register("maroon_jangoon_shoes", () ->
            new MapleUtgardWarriorBuffTwo(MapleSilverMaterial.SILVER, EquipmentSlot.FEET, new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    //Armor for pirates 10-130

    //Armor for magicians 10-130

    //Armor for thiefs 10-130

    //Armor for pirates 10-130

    //Block Items
    public static final RegistryObject<BlockItem> SILVER_ORE_BLOCK = ITEMS.register("silver_ore_block",
            () -> new BlockItem(MapleStoryBlocks.SILVER_ORE_BLOCK.get(), new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    public static final RegistryObject<BlockItem> DEEPSLATE_SILVER_ORE = ITEMS.register("deepslate_silver_ore",
            () -> new BlockItem(MapleStoryBlocks.DEEPSLATE_SILVER_ORE.get(), new Item.Properties().tab(MapleSetup.MAPLESTORY_TAB)));
    //Structures
    public static final RegistryObject<StructureFeature<JigsawConfiguration>> HENESY = STRUCTURES.register("henesy", HenesyStructure::new);
    public static final RegistryObject<StructureFeature<JigsawConfiguration>> LITH_HARBOR = STRUCTURES.register("lith_harbor", LithHarborStructure::new);
}
