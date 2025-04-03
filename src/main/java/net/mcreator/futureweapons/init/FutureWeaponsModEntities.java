
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.futureweapons.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.futureweapons.entity.RaigunprojectileEntity;
import net.mcreator.futureweapons.entity.AcidgunprojectileEntity;
import net.mcreator.futureweapons.FutureWeaponsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FutureWeaponsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FutureWeaponsMod.MODID);
	public static final RegistryObject<EntityType<AcidgunprojectileEntity>> ACIDGUNPROJECTILE = register("acidgunprojectile", EntityType.Builder.<AcidgunprojectileEntity>of(AcidgunprojectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(AcidgunprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<RaigunprojectileEntity>> RAIGUNPROJECTILE = register("raigunprojectile", EntityType.Builder.<RaigunprojectileEntity>of(RaigunprojectileEntity::new, MobCategory.MISC)
			.setCustomClientFactory(RaigunprojectileEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
