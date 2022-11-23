package net.mcreator.rubymode.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;

import net.mcreator.rubymode.network.RubymodeModVariables;

public class SpawnItemsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RubymodeModVariables.MapVariables.get(world).numarCazuri = 3;
		RubymodeModVariables.MapVariables.get(world).syncData(world);
		GenerareSansaProcedure.execute(world);
		if (RubymodeModVariables.MapVariables.get(world).sansaRandom >= 2) {
			RubymodeModVariables.MapVariables.get(world).numarCazuri = 5;
			RubymodeModVariables.MapVariables.get(world).syncData(world);
			GenerareSansaProcedure.execute(world);
			for (int index0 = 0; index0 < (int) (20); index0++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + RubymodeModVariables.MapVariables.get(world).sansaRandom),
							(y + RubymodeModVariables.MapVariables.get(world).sansaRandom),
							(z + RubymodeModVariables.MapVariables.get(world).sansaRandom), new ItemStack(Items.DIAMOND));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (RubymodeModVariables.MapVariables.get(world).sansaRandom >= 1) {
			RubymodeModVariables.MapVariables.get(world).numarCazuri = 5;
			RubymodeModVariables.MapVariables.get(world).syncData(world);
			GenerareSansaProcedure.execute(world);
			for (int index1 = 0; index1 < (int) (20); index1++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + RubymodeModVariables.MapVariables.get(world).sansaRandom),
							(y + RubymodeModVariables.MapVariables.get(world).sansaRandom),
							(z + RubymodeModVariables.MapVariables.get(world).sansaRandom), new ItemStack(Items.GOLD_INGOT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		} else if (RubymodeModVariables.MapVariables.get(world).sansaRandom >= 0) {
			RubymodeModVariables.MapVariables.get(world).numarCazuri = 5;
			RubymodeModVariables.MapVariables.get(world).syncData(world);
			GenerareSansaProcedure.execute(world);
			for (int index2 = 0; index2 < (int) (20); index2++) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, (x + RubymodeModVariables.MapVariables.get(world).sansaRandom),
							(y + RubymodeModVariables.MapVariables.get(world).sansaRandom),
							(z + RubymodeModVariables.MapVariables.get(world).sansaRandom), new ItemStack(Items.NETHERITE_INGOT));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
