
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubymode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.rubymode.block.LuckyBlockBlock;
import net.mcreator.rubymode.RubymodeMod;

public class RubymodeModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RubymodeMod.MODID);
	public static final RegistryObject<Block> LUCKY_BLOCK = REGISTRY.register("lucky_block", () -> new LuckyBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			LuckyBlockBlock.registerRenderLayer();
		}
	}
}
