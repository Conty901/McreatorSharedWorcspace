package net.mcreator.futureweapons.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.CommandSourceStack;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;

public class Choice22Procedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		FutureWeaponsModVariables.MapVariables.get(world).choice22 = (new Object() {
			public String getMessage() {
				try {
					return MessageArgument.getMessage(arguments, "choice22").getString();
				} catch (CommandSyntaxException ignored) {
					return "";
				}
			}
		}).getMessage();
		FutureWeaponsModVariables.MapVariables.get(world).syncData(world);
	}
}
