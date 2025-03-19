
package net.mcreator.futureweapons.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class WolframItem extends Item {
	public WolframItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
