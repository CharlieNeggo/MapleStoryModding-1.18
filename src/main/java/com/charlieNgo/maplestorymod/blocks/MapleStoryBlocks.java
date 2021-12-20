package com.charlieNgo.maplestorymod.blocks;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MapleStoryBlocks {
    public final static DeferredRegister<Block> BLOCK = DeferredRegister.create(ForgeRegistries.BLOCKS, MapleStoryMod.MODID);

    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = BLOCK.register("deepslate_silver_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));

    public static final RegistryObject<Block> SILVER_ORE_BLOCK = BLOCK.register("silver_ore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));

}
