package net.MrGise.bricked.content.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BrickStation extends Block {
    public BrickStation(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return Shapes.or(Block.box(0, 0, 0, 2, 14, 2), Block.box(0, 0, 14, 2, 14, 16),
                Block.box(14, 0, 0, 16, 14, 2), Block.box(14, 0, 14, 16, 14, 16),
                Block.box(0, 14, 0, 16, 16, 16));
    }
}
