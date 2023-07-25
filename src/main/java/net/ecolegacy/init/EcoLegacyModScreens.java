
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ecolegacy.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.ecolegacy.client.gui.GUIHighEnergyRefinerScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class EcoLegacyModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(EcoLegacyModMenus.GUI_HIGH_ENERGY_REFINER.get(), GUIHighEnergyRefinerScreen::new);
		});
	}
}
