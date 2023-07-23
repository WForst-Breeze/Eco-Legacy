
package wfb.ecolegacy.enchantment;

import wfb.ecolegacy.init.EcoLegacyModItems;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.List;

public class EnergyExtractionEnchantment extends Enchantment {
	public EnergyExtractionEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		Item item = stack.getItem();
		return List.of(EcoLegacyModItems.INCEPTION_PICKAXE.get()).contains(item);
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
