package com.charlieNgo.maplestorymod.init;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;

public class MapleModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MapleStoryMod.MOD_ID);

    public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", RubyOre::new);

    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", ()-> new Block
            (BlockBehaviour.Properties.of(Material.STONE).strength(4F, 10F).destroyTime(15).requiresCorrectToolForDrops()));


}
