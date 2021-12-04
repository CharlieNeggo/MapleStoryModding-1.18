package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.blocks.BlockItemBase;
import com.charlieNgo.maplestorymod.items.*;
import com.charlieNgo.maplestorymod.items.MapleModSpawnEggItem;
import com.charlieNgo.maplestorymod.util.enums.weapon.MapleModItemTier;
import net.minecraft.item.*;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MapleStoryMod.MOD_ID);

    // For Armor Sets/Weapons for what material their going to be made out of
    public static final RegistryObject<Item> MAPLE = ITEMS.register("maple", ItemBase::new);
    public static final RegistryObject<Item> UTGARD = ITEMS.register("utgard", ItemBase::new);
    public static final RegistryObject<Item> ABSOLAB_ESSENCE = ITEMS.register("absolab_essence", ItemBase::new);
    public static final RegistryObject<Item> ARCANE_ESSENCE = ITEMS.register("arcane_essence", ItemBase::new);
    public static final RegistryObject<Item> GENESIS = ITEMS.register("genesis", ItemBase::new);
    public static final RegistryObject<Item> CRA = ITEMS.register("cra", ItemBase::new);

    // Items
    public static final RegistryObject<Item> ELIXIR = ITEMS.register("elixir", Elixir::new);
    public static final RegistryObject<Item> MELTING_CHEESE = ITEMS.register("melting_cheese", MeltingCheese::new);
    public static final RegistryObject<Item> REINDEER_MILK = ITEMS.register("reindeer_milk", ReindeerMilk::new);
    public static final RegistryObject<Item> POWER_ELIXIR = ITEMS.register("power_elixir", PowerElixir::new);
    public static final RegistryObject<Item> WHITE_POTION = ITEMS.register("white_potion", WhitePotion::new);
    public static final RegistryObject<Item> ORANGEMUSHROOMCAP = ITEMS.register("orangemushroomcap", ItemBase::new);
    public static final RegistryObject<Item> SQUISHY_LIQUID = ITEMS.register("squishy_liquid", ItemBase::new);
    public static final RegistryObject<Item> BLUE_SNAIL_SHELL = ITEMS.register("blue_snail_shell", ItemBase::new);
    public static final RegistryObject<Item> SLIME_BUBBLE =  ITEMS.register("slime_bubble", ItemBase::new);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);

    //Spawn eggs for the mobs
    public static final RegistryObject<MapleModSpawnEggItem> MUSHROOM_SPAWN_EGG = ITEMS.register("mushroom_spawn_egg", () -> new MapleModSpawnEggItem
            (MapleModEntityTypes.MUSHROOM, 0xF1BF7B, 0x705128, new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<MapleModSpawnEggItem> BLUE_SNAIL_SPAWN_EGG = ITEMS.register("blue_snail_spawn_egg", () -> new MapleModSpawnEggItem
            (MapleModEntityTypes.BLUESNAIL, 0xF1BF7B, 0x3C4EED, new Item.Properties().group(MapleStoryMod.TAB)));

    public static final RegistryObject<MapleModSpawnEggItem> GREEN_SLIME_SPAWN_EGG = ITEMS.register("green_slime_spawn_egg", () -> new MapleModSpawnEggItem
            (MapleModEntityTypes.GREENSLIME, 0xF1BF7B, 0x4AED3C, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    //Weapons
    //Kaiser Sword
    public static final RegistryObject<SwordItem> KAISER_KAISREUM = ITEMS.register("kaiser_kaisereum", () -> new SwordItem(MapleModItemTier.MAPLE, 6, -2.0F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //Dual Blade Dagger
    public static final RegistryObject<SwordItem> DUAL_BLADE_DAGGER = ITEMS.register("dual_blade_dagger", () -> new SwordItem(MapleModItemTier.MAPLE, 6, 0.5F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //Dual Blade Katara
    public static final RegistryObject<SwordItem> DUAL_BLADE_KATARA = ITEMS.register("dual_blade_katara", () -> new SwordItem(MapleModItemTier.MAPLE, 6, 0.5F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));

    //Aran Polearm
    public static final RegistryObject<AxeItem> ARAN_AXE_ONE = ITEMS.register("aran_axe_one", () -> new AxeItem(MapleModItemTier.MAPLE, 8, -3.0F
            , new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));


//    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(MapleModItemTier.RUBY, 3, -1.9F
//            , new Item.Properties().group(MapleStoryMod.TAB)));
//
//    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(MapleModItemTier.RUBY, -1,-1.1F
//            , new Item.Properties().group(MapleStoryMod.TAB)));
//
//    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(MapleModItemTier.RUBY, 4, -1.7F
//            , new Item.Properties().group(MapleStoryMod.TAB)));

//    public static final RegistryObject<SwordItem> DICK = ITEMS.register("dick", () -> new SwordItem(MapleModItemTier.MAPLE, 100, -0.5F
//            , new Item.Properties().group(MapleStoryMod.TAB)));

    //Block Items
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", () -> new BlockItemBase(MapleModBlocks.RUBY_BLOCK.get()));

    public static final RegistryObject<Item> RUBY_ORE_ITEM = ITEMS.register("ruby_ore", () -> new BlockItemBase(MapleModBlocks.RUBY_ORE.get()));

    public static final RegistryObject<Item> OVEN_ITEM = ITEMS.register("oven", () -> new BlockItemBase(MapleModBlocks.OVEN.get()));
}
