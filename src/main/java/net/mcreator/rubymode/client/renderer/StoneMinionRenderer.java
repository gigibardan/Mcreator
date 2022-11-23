
package net.mcreator.rubymode.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.rubymode.entity.StoneMinionEntity;
import net.mcreator.rubymode.client.model.Modelstoneminion;

public class StoneMinionRenderer extends MobRenderer<StoneMinionEntity, Modelstoneminion<StoneMinionEntity>> {
	public StoneMinionRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstoneminion(context.bakeLayer(Modelstoneminion.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(StoneMinionEntity entity) {
		return new ResourceLocation("rubymode:textures/entities/textura.png");
	}
}
