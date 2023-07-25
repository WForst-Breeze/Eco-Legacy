
package net.ecolegacy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EnergyDustItem extends Item {
	public EnergyDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
