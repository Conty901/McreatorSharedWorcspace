package net.mcreator.futureweapons.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.futureweapons.init.FutureWeaponsModMobEffects;

public class AcidgunprojectileProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(FutureWeaponsModMobEffects.ACID.get(), 100, 1, false, true));
	}
}
