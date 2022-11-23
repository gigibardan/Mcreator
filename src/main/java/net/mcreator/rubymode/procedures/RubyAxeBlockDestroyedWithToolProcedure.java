package net.mcreator.rubymode.procedures;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RubyAxeBlockDestroyedWithToolProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double block = 0;
		if ((world.getBlockState(new BlockPos(x, y, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
			block = y + 1;
			while ((world.getBlockState(new BlockPos(x, block, z))).getMaterial() == net.minecraft.world.level.material.Material.WOOD) {
				{
					BlockPos _pos = new BlockPos(x, block, z);
					Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, block, z), null);
					world.destroyBlock(_pos, false);
				}
				block = block + 1;
			}
		}
	}
}
