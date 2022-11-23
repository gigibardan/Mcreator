
package net.mcreator.rubymode.entity;

import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.ItemSupplier;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.network.protocol.Packet;

import net.mcreator.rubymode.init.RubymodeModEntities;

@OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
public class StoneMinionEntityProjectile extends AbstractArrow implements ItemSupplier {
	public StoneMinionEntityProjectile(PlayMessages.SpawnEntity packet, Level world) {
		super(RubymodeModEntities.STONE_MINION_PROJECTILE.get(), world);
	}

	public StoneMinionEntityProjectile(EntityType<? extends StoneMinionEntityProjectile> type, Level world) {
		super(type, world);
	}

	public StoneMinionEntityProjectile(EntityType<? extends StoneMinionEntityProjectile> type, double x, double y, double z, Level world) {
		super(type, x, y, z, world);
	}

	public StoneMinionEntityProjectile(EntityType<? extends StoneMinionEntityProjectile> type, LivingEntity entity, Level world) {
		super(type, entity, world);
	}

	@Override
	public Packet<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected void doPostHurtEffects(LivingEntity livingEntity) {
		super.doPostHurtEffects(livingEntity);
		livingEntity.setArrowCount(livingEntity.getArrowCount() - 1);
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public ItemStack getItem() {
		return new ItemStack(Items.FLINT);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.FLINT);
	}
}
