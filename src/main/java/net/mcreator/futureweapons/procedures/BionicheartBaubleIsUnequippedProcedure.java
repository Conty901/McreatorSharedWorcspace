package net.mcreator.futureweapons.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

public class BionicheartBaubleIsUnequippedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina_max - 40;
			entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.stamina_max = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
