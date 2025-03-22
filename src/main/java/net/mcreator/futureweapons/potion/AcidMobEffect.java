
package net.mcreator.futureweapons.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.futureweapons.procedures.AcidOnEffectActiveTickProcedure;

public class AcidMobEffect extends MobEffect {
	public AcidMobEffect() {
		super(MobEffectCategory.HARMFUL, -16740096);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AcidOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
