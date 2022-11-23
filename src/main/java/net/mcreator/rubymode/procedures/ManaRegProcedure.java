package net.mcreator.rubymode.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ManaRegProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("ManaReg") > 0) {
			entity.getPersistentData().putDouble("ManaReg", (entity.getPersistentData().getDouble("ManaReg") - 1));
		} else {
			if (entity.getPersistentData().getDouble("Mana") < 100) {
				entity.getPersistentData().putDouble("Mana", (entity.getPersistentData().getDouble("Mana") + 1));
			}
			entity.getPersistentData().putDouble("ManaReg", 10);
		}
	}
}
