package com.charlieNgo.maplestorymod.blocks;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {
        super(block, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));
    }


}
