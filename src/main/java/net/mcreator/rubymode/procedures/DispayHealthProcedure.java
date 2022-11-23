package net.mcreator.rubymode.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.TextComponent;

public class DispayHealthProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setCustomName(new TextComponent(((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + "/"
				+ (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1))));
	}
}
