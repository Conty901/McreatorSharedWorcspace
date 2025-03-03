package net.mcreator.futureweapons.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.level.BlockEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class IfblockisbrokenProcedure {
	@SubscribeEvent
	public static void onBlockBreak(BlockEvent.BreakEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			{
				double _setval = (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina - 20;
				entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.stamina = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 0;
				entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.adding_delay = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
