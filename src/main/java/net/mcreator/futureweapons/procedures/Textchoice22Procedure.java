package net.mcreator.futureweapons.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

public class Textchoice22Procedure {
	public static String execute(LevelAccessor world) {
		if ((FutureWeaponsModVariables.MapVariables.get(world).choice22).length() <= 20) {
			return FutureWeaponsModVariables.MapVariables.get(world).choice22;
		}
		return "";
	}
}
