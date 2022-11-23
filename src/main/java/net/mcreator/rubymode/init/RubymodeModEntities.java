
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.rubymode.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.rubymode.entity.StoneMinionEntityProjectile;
import net.mcreator.rubymode.entity.StoneMinionEntity;
import net.mcreator.rubymode.entity.RobotFollowEntity;
import net.mcreator.rubymode.entity.RobotAttackEntity;
import net.mcreator.rubymode.entity.RoboStayEntity;
import net.mcreator.rubymode.entity.EnergyGunEntity;
import net.mcreator.rubymode.entity.BossEntity;
import net.mcreator.rubymode.RubymodeMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class RubymodeModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, RubymodeMod.MODID);
	public static final RegistryObject<EntityType<RobotFollowEntity>> ROBOT_FOLLOW = register("robot_follow",
			EntityType.Builder.<RobotFollowEntity>of(RobotFollowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RobotFollowEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RobotAttackEntity>> ROBOT_ATTACK = register("robot_attack",
			EntityType.Builder.<RobotAttackEntity>of(RobotAttackEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RobotAttackEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RoboStayEntity>> ROBO_STAY = register("robo_stay",
			EntityType.Builder.<RoboStayEntity>of(RoboStayEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RoboStayEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EnergyGunEntity>> ENERGY_GUN = register("projectile_energy_gun",
			EntityType.Builder.<EnergyGunEntity>of(EnergyGunEntity::new, MobCategory.MISC).setCustomClientFactory(EnergyGunEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BossEntity>> BOSS = register("boss",
			EntityType.Builder.<BossEntity>of(BossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(BossEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoneMinionEntity>> STONE_MINION = register("stone_minion",
			EntityType.Builder.<StoneMinionEntity>of(StoneMinionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(StoneMinionEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<StoneMinionEntityProjectile>> STONE_MINION_PROJECTILE = register("projectile_stone_minion",
			EntityType.Builder.<StoneMinionEntityProjectile>of(StoneMinionEntityProjectile::new, MobCategory.MISC)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1)
					.setCustomClientFactory(StoneMinionEntityProjectile::new).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RobotFollowEntity.init();
			RobotAttackEntity.init();
			RoboStayEntity.init();
			BossEntity.init();
			StoneMinionEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(ROBOT_FOLLOW.get(), RobotFollowEntity.createAttributes().build());
		event.put(ROBOT_ATTACK.get(), RobotAttackEntity.createAttributes().build());
		event.put(ROBO_STAY.get(), RoboStayEntity.createAttributes().build());
		event.put(BOSS.get(), BossEntity.createAttributes().build());
		event.put(STONE_MINION.get(), StoneMinionEntity.createAttributes().build());
	}
}
