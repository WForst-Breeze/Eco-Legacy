
package net.ecolegacy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AncientIngotItem extends Item {
	public AncientIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
