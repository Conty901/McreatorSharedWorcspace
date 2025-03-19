
package net.mcreator.futureweapons.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AluminumItem extends Item {
	public AluminumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
