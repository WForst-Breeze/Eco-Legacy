
package wfb.ecolegacy.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class NaturiteIngotItem extends Item {
	public NaturiteIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
