package net.mcreator.futureweapons.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.GameType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.Minecraft;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class StaminaprocProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity) || new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.SPECTATOR;
				} else if (_ent.level().isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.SPECTATOR;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			{
				double _setval = 1;
				entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.gamemode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				double _setval = 0;
				entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.gamemode = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).gamemode == 0) {
			if (entity.isSprinting() && (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina > 0) {
				{
					double _setval = (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina
							- (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina_remove;
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
			if (!entity.isSprinting() && (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina < (entity
					.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina_max) {
				{
					double _setval = (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina
							+ (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina_add;
					entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stamina = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina >= (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina_max) {
				{
					double _setval = (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina_max;
					entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stamina = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina <= 4) {
				{
					double _setval = 4;
					entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stamina = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 1, 4, false, false));
				entity.setSprinting(false);
			}
			if ((entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).adding_delay <= 50) {
				{
					double _setval = (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina
							- (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).stamina_add;
					entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.stamina = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = (entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).adding_delay + 1;
					entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.adding_delay = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if ((entity.getCapability(FutureWeaponsModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new FutureWeaponsModVariables.PlayerVariables())).adding_delay <= 0) {
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
}
