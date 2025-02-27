
package net.mcreator.futureweapons.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.futureweapons.procedures.BloodingOnEffectActiveTickProcedure;

public class BloodingMobEffect extends MobEffect {
	public BloodingMobEffect() {
		super(MobEffectCategory.HARMFUL, -3407821);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BloodingOnEffectActiveTickProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
