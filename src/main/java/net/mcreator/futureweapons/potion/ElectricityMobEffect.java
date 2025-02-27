
package net.mcreator.futureweapons.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.futureweapons.procedures.ElectricityEffectExpiresProcedure;
import net.mcreator.futureweapons.procedures.ElectricityActiveTickConditionProcedure;

public class ElectricityMobEffect extends MobEffect {
	public ElectricityMobEffect() {
		super(MobEffectCategory.HARMFUL, -13382401);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		ElectricityActiveTickConditionProcedure.execute(entity.level(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ElectricityEffectExpiresProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
