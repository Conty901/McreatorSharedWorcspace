package net.mcreator.futureweapons.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class Choice21Procedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		FutureWeaponsModVariables.MapVariables.get(world).choice21 = (new Object() {
			public String getMessage() {
				try {
					return MessageArgument.getMessage(arguments, "choice21").getString();
				} catch (CommandSyntaxException ignored) {
					return "";
				}
			}
		}).getMessage();
		FutureWeaponsModVariables.MapVariables.get(world).syncData(world);
	}
}
