package net.mcreator.futureweapons.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

public class Choice22Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 2;
			entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.last_choice = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
