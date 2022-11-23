package net.mcreator.rubymode.procedures;

import net.minecraft.world.entity.Entity;

public class CoolDownProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("cooldown", 100);
	}
}
