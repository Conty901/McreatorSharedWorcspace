
package net.mcreator.futureweapons.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.futureweapons.procedures.BionicheartWhileBaubleIsEquippedTickProcedure;
import net.mcreator.futureweapons.procedures.BionicheartBaubleIsUnequippedProcedure;

public class BionicheartItem extends Item implements ICurioItem {
	public BionicheartItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
		BionicheartWhileBaubleIsEquippedTickProcedure.execute(slotContext.entity());
	}

	@Override
	public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
		BionicheartBaubleIsUnequippedProcedure.execute(slotContext.entity());
	}
}
