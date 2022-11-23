
package net.mcreator.rubymode.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.rubymode.entity.RobotFollowEntity;
import net.mcreator.rubymode.client.model.Modeltest;

public class RobotFollowRenderer extends MobRenderer<RobotFollowEntity, Modeltest<RobotFollowEntity>> {
	public RobotFollowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltest(context.bakeLayer(Modeltest.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RobotFollowEntity entity) {
		return new ResourceLocation("rubymode:textures/entities/robot_follow.png");
	}
}
