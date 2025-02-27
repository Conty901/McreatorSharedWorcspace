
package net.mcreator.futureweapons.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SerebroItem extends Item {
	public SerebroItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
