package net.mcreator.rubymode.procedures;

import net.minecraft.world.entity.Entity;

public class MF2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity.getPersistentData().getDouble("Mana") >= 40) {
			return true;
		}
		return false;
	}
}
