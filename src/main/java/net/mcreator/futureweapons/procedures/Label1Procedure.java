package net.mcreator.futureweapons.procedures;

import net.minecraft.world.entity.Entity;

public class Label1Procedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return entity.getPersistentData().getString("choice21");
	}
}
