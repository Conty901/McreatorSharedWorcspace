package net.mcreator.futureweapons.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

public class S5Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina_max >= 200) {
			return true;
		}
		return false;
	}
}
