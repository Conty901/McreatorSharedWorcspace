package net.mcreator.futureweapons.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.futureweapons.network.FutureWeaponsModVariables;

public class Textchoice21Procedure {
	public static String execute(LevelAccessor world) {
		return FutureWeaponsModVariables.MapVariables.get(world).choice21;
	}
}
