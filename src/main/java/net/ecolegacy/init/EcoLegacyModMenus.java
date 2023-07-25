
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ecolegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.ecolegacy.world.inventory.GUIHighEnergyRefinerMenu;
import net.ecolegacy.EcoLegacyMod;

public class EcoLegacyModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, EcoLegacyMod.MODID);
	public static final RegistryObject<MenuType<GUIHighEnergyRefinerMenu>> GUI_HIGH_ENERGY_REFINER = REGISTRY.register("gui_high_energy_refiner", () -> IForgeMenuType.create(GUIHighEnergyRefinerMenu::new));
}
