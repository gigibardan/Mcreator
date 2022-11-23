package net.mcreator.rubymode.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.rubymode.network.RubymodeModVariables;

public class GenerareSansaProcedure {
	public static void execute(LevelAccessor world) {
		RubymodeModVariables.MapVariables.get(world).sansaRandom = Math.random() * RubymodeModVariables.MapVariables.get(world).numarCazuri;
		RubymodeModVariables.MapVariables.get(world).syncData(world);
	}
}
