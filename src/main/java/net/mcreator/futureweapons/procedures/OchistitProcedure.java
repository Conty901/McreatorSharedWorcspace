package net.mcreator.futureweapons.procedures;

import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class OchistitProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double slot = 0;
		slot = 2;
		for (int index0 = 0; index0 < 9; index0++) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) slot)).remove(1);
				_player.containerMenu.broadcastChanges();
			}
			slot = slot + 1;
		}
	}
}
