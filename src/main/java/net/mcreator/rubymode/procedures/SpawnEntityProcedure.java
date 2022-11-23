package net.mcreator.rubymode.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.rubymode.network.RubymodeModVariables;

public class SpawnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		RubymodeModVariables.MapVariables.get(world).numarCazuri = 3;
		RubymodeModVariables.MapVariables.get(world).syncData(world);
		GenerareSansaProcedure.execute(world);
		if (RubymodeModVariables.MapVariables.get(world).sansaRandom >= 2) {
			for (int index0 = 0; index0 < (int) (5); index0++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else if (RubymodeModVariables.MapVariables.get(world).sansaRandom >= 1) {
			for (int index1 = 0; index1 < (int) (5); index1++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Skeleton(EntityType.SKELETON, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		} else if (RubymodeModVariables.MapVariables.get(world).sansaRandom >= 0) {
			for (int index2 = 0; index2 < (int) (5); index2++) {
				if (world instanceof ServerLevel _level) {
					Entity entityToSpawn = new Creeper(EntityType.CREEPER, _level);
					entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof Mob _mobToSpawn)
						_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED,
								null, null);
					world.addFreshEntity(entityToSpawn);
				}
			}
		}
	}
}
