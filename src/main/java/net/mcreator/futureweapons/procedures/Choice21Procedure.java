package net.mcreator.futureweapons.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class Choice21Procedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		FutureWeaponsModVariables.MapVariables.get(world).choice21 = StringArgumentType.getString(arguments, "choice21");
		FutureWeaponsModVariables.MapVariables.get(world).syncData(world);
		FutureWeaponsModVariables.MapVariables.get(world).choice22 = StringArgumentType.getString(arguments, "choice22");
		FutureWeaponsModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
