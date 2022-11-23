
package net.mcreator.rubymode.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.rubymode.entity.BossEntity;
import net.mcreator.rubymode.client.model.ModelStoneGolem;

public class BossRenderer extends MobRenderer<BossEntity, ModelStoneGolem<BossEntity>> {
	public BossRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStoneGolem(context.bakeLayer(ModelStoneGolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BossEntity entity) {
		return new ResourceLocation("rubymode:textures/entities/model2.png");
	}
}
