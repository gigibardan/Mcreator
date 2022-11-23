package net.mcreator.rubymode.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class EnergyGunWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.ENCHANTED_HIT, x, y, z, 5, 0, 1, 0, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.EFFECT, x, y, z, 5, 0, 1, 0, 0);
	}
}
