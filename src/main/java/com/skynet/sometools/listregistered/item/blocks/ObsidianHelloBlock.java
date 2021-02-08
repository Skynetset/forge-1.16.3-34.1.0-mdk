package com.skynet.sometools.listregistered.item.blocks;

import com.skynet.sometools.listregistered.tileentities.ObsidianHelloTileEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;

/**
 *  ObsidianHelloBlock
 *
 * @program: forge-1.16.3-34.1.0-mdk
 * @author: 1260535819@qq.com
 * @create: 2021-01-14 14:14
 */

public class ObsidianHelloBlock extends Block {
    public ObsidianHelloBlock() {
        super(Properties.create(Material.ROCK).hardnessAndResistance(5));
    }

    @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Nullable
    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return new ObsidianHelloTileEntity();
    }
}

