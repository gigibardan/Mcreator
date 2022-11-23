package net.mcreator.rubymode.procedures;

import net.minecraft.world.entity.Entity;

public class MF3Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("Mana") >= 60) {
			return true;
		}
		return false;
	}
}
