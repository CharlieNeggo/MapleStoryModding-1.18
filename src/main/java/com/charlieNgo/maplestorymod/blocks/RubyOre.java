package com.charlieNgo.maplestorymod.blocks;

import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

import java.util.Random;

public class RubyOre extends OreBlock {
    public RubyOre() {
        super(Properties.create(Material.IRON)
                .hardnessAndResistance(3.0f, 4.0f)
                .sound(SoundType.STONE)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool());
    }

    @Override
    protected int getExperience(Random p_220281_1_) {
        return super.getExperience(p_220281_1_);
    }
}



