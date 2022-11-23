
package net.mcreator.rubymode.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.rubymode.entity.RobotAttackEntity;
import net.mcreator.rubymode.client.model.Modeltest;

public class RobotAttackRenderer extends MobRenderer<RobotAttackEntity, Modeltest<RobotAttackEntity>> {
	public RobotAttackRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltest(context.bakeLayer(Modeltest.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RobotAttackEntity entity) {
		return new ResourceLocation("rubymode:textures/entities/robot_attack.png");
	}
}
