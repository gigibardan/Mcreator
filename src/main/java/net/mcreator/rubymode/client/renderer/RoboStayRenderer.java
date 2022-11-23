
package net.mcreator.rubymode.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.rubymode.entity.RoboStayEntity;
import net.mcreator.rubymode.client.model.Modeltest;

public class RoboStayRenderer extends MobRenderer<RoboStayEntity, Modeltest<RoboStayEntity>> {
	public RoboStayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltest(context.bakeLayer(Modeltest.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RoboStayEntity entity) {
		return new ResourceLocation("rubymode:textures/entities/robot_idle.png");
	}
}
