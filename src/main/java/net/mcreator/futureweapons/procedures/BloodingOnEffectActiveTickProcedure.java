package net.mcreator.futureweapons.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.futureweapons.init.FutureWeaponsModParticleTypes;

public class BloodingOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Mth.nextInt(RandomSource.create(), 1, 40) == 20) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.MAGIC)), 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (FutureWeaponsModParticleTypes.BLOOD.get()), (entity.getX()), (entity.getY()), (entity.getZ()), 200, 0.5, 1, 0.5, 0);
		}
	}
}
