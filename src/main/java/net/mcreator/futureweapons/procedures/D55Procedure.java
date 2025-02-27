package net.mcreator.futureweapons.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

public class D55Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina >= 275) {
			return true;
		}
		return false;
	}
}
