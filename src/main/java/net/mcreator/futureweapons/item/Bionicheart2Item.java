
package net.mcreator.futureweapons.item;

import top.theillusivec4.curios.api.type.capability.ICurioItem;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Bionicheart2Item extends Item implements ICurioItem {
	public Bionicheart2Item() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
