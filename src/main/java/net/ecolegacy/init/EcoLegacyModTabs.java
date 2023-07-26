
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ecolegacy.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class EcoLegacyModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			tabData.accept(EcoLegacyModBlocks.HIGH_ENERGY_REFINER.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(EcoLegacyModItems.ENERGY_DUST.get());
			tabData.accept(EcoLegacyModItems.ANCIENT_RAW_ORE.get());
			tabData.accept(EcoLegacyModItems.ANCIENT_DUST.get());
			tabData.accept(EcoLegacyModItems.ANCIENT_INGOT.get());
			tabData.accept(EcoLegacyModItems.COMPRESSED_IRON_PLATE.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EcoLegacyModItems.INCEPTION_PICKAXE.get());
			tabData.accept(EcoLegacyModItems.NATURITE_INCEPTION_PICKAXE.get());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(EcoLegacyModBlocks.DEEPSLATE_ANCIENT_ORE.get().asItem());
		}
	}
}
