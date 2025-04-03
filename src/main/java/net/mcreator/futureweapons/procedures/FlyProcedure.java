package net.mcreator.futureweapons.procedures;

import net.minecraft.world.entity.Entity;

public class FlyProcedure {
	public static void execute(Entity immediatesourceentity) {
		if (immediatesourceentity == null)
			return;
		immediatesourceentity.setNoGravity(true);
	}
}
