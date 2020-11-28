package com.regnegade.firstmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class EtherealThreadBlock  extends Block {
    public EtherealThreadBlock() {
        super(AbstractBlock.Properties.create(Material.WOOL)
            .hardnessAndResistance(1.0f, 1.0f)
            .sound(SoundType.CLOTH)
            .harvestLevel(0)
        );
    }

}
