package com.charlieNgo.maplestorymod.blocks;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleStoryBlocks {
    public final static DeferredRegister<Block> BLOCK =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MapleStoryMod.MODID);

    public static final RegistryObject<Block> SILVER_BLOCK = BLOCK.register("silver_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(12f).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> SILVER_ORE_BLOCK = BLOCK.register("silver_ore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(10f).requiresCorrectToolForDrops().friction(0.5f)));

}
