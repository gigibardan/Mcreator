
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubymode.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.rubymode.client.model.Modeltest;
import net.mcreator.rubymode.client.model.Modelstoneminion;
import net.mcreator.rubymode.client.model.ModelStoneGolem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class RubymodeModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltest.LAYER_LOCATION, Modeltest::createBodyLayer);
		event.registerLayerDefinition(Modelstoneminion.LAYER_LOCATION, Modelstoneminion::createBodyLayer);
		event.registerLayerDefinition(ModelStoneGolem.LAYER_LOCATION, ModelStoneGolem::createBodyLayer);
	}
}
