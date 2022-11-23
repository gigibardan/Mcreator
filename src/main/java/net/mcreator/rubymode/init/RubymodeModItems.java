
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubymode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.rubymode.item.SceptruItem;
import net.mcreator.rubymode.item.RubyTarnacopItem;
import net.mcreator.rubymode.item.RubySwordItem;
import net.mcreator.rubymode.item.RubyItem;
import net.mcreator.rubymode.item.RubyAxeItem;
import net.mcreator.rubymode.item.RubyArmourArmorItem;
import net.mcreator.rubymode.item.LaserBulletItem;
import net.mcreator.rubymode.item.EnergyGunItem;
import net.mcreator.rubymode.item.CiocanItem;
import net.mcreator.rubymode.RubymodeMod;

public class RubymodeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RubymodeMod.MODID);
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_ARMOUR_ARMOR_HELMET = REGISTRY.register("ruby_armour_armor_helmet",
			() -> new RubyArmourArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOUR_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armour_armor_chestplate",
			() -> new RubyArmourArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOUR_ARMOR_LEGGINGS = REGISTRY.register("ruby_armour_armor_leggings",
			() -> new RubyArmourArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOUR_ARMOR_BOOTS = REGISTRY.register("ruby_armour_armor_boots",
			() -> new RubyArmourArmorItem.Boots());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> RUBY_TARNACOP = REGISTRY.register("ruby_tarnacop", () -> new RubyTarnacopItem());
	public static final RegistryObject<Item> CIOCAN = REGISTRY.register("ciocan", () -> new CiocanItem());
	public static final RegistryObject<Item> ROBOT_FOLLOW = REGISTRY.register("robot_follow_spawn_egg",
			() -> new ForgeSpawnEggItem(RubymodeModEntities.ROBOT_FOLLOW, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ROBOT_ATTACK = REGISTRY.register("robot_attack_spawn_egg",
			() -> new ForgeSpawnEggItem(RubymodeModEntities.ROBOT_ATTACK, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ROBO_STAY = REGISTRY.register("robo_stay_spawn_egg",
			() -> new ForgeSpawnEggItem(RubymodeModEntities.ROBO_STAY, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SCEPTRU = REGISTRY.register("sceptru", () -> new SceptruItem());
	public static final RegistryObject<Item> LUCKY_BLOCK = block(RubymodeModBlocks.LUCKY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LASER_BULLET = REGISTRY.register("laser_bullet", () -> new LaserBulletItem());
	public static final RegistryObject<Item> ENERGY_GUN = REGISTRY.register("energy_gun", () -> new EnergyGunItem());
	public static final RegistryObject<Item> BOSS = REGISTRY.register("boss_spawn_egg",
			() -> new ForgeSpawnEggItem(RubymodeModEntities.BOSS, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> STONE_MINION = REGISTRY.register("stone_minion_spawn_egg",
			() -> new ForgeSpawnEggItem(RubymodeModEntities.STONE_MINION, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
