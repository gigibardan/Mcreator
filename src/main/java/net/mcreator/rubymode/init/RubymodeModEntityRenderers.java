
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubymode.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.rubymode.client.renderer.StoneMinionRenderer;
import net.mcreator.rubymode.client.renderer.RobotFollowRenderer;
import net.mcreator.rubymode.client.renderer.RobotAttackRenderer;
import net.mcreator.rubymode.client.renderer.RoboStayRenderer;
import net.mcreator.rubymode.client.renderer.BossRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RubymodeModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(RubymodeModEntities.ROBOT_FOLLOW.get(), RobotFollowRenderer::new);
		event.registerEntityRenderer(RubymodeModEntities.ROBOT_ATTACK.get(), RobotAttackRenderer::new);
		event.registerEntityRenderer(RubymodeModEntities.ROBO_STAY.get(), RoboStayRenderer::new);
		event.registerEntityRenderer(RubymodeModEntities.ENERGY_GUN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(RubymodeModEntities.BOSS.get(), BossRenderer::new);
		event.registerEntityRenderer(RubymodeModEntities.STONE_MINION.get(), StoneMinionRenderer::new);
		event.registerEntityRenderer(RubymodeModEntities.STONE_MINION_PROJECTILE.get(), ThrownItemRenderer::new);
	}
}
