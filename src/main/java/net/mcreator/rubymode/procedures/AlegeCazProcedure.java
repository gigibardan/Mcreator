package net.mcreator.rubymode.procedures;

import net.minecraftforge.server.ServerLifecycleHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.ChatType;
import net.minecraft.Util;

import net.mcreator.rubymode.network.RubymodeModVariables;

public class AlegeCazProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		RubymodeModVariables.MapVariables.get(world).numarCazuri = 2;
		RubymodeModVariables.MapVariables.get(world).syncData(world);
		if (!world.isClientSide()) {
			MinecraftServer _mcserv = ServerLifecycleHooks.getCurrentServer();
			if (_mcserv != null)
				_mcserv.getPlayerList().broadcastMessage(new TextComponent(("" + RubymodeModVariables.MapVariables.get(world).sansaRandom)),
						ChatType.SYSTEM, Util.NIL_UUID);
		}
		GenerareSansaProcedure.execute(world);
		if (RubymodeModVariables.MapVariables.get(world).sansaRandom >= 1) {
			SpawnEntityProcedure.execute(world, x, y, z);
		} else if (RubymodeModVariables.MapVariables.get(world).sansaRandom >= 0) {
			SpawnItemsProcedure.execute(world, x, y, z);
		}
		if (!entity.level.isClientSide())
			entity.discard();
	}
}
