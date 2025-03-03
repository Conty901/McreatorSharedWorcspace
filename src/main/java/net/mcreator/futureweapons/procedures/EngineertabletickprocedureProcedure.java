package net.mcreator.futureweapons.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.futureweapons.init.FutureWeaponsModItems;

import java.util.function.Supplier;
import java.util.Map;

public class EngineertabletickprocedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double output_slot = 0;
		output_slot = 1;
		if (CraftkingalProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(FutureWeaponsModItems.KINGAL.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) output_slot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (CraftelectricswordProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(FutureWeaponsModItems.ELECTRICSWORD.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) output_slot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) output_slot)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
