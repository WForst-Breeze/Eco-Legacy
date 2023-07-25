
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ecolegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.ecolegacy.enchantment.EnergyExtractionEnchantment;
import net.ecolegacy.EcoLegacyMod;

public class EcoLegacyModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, EcoLegacyMod.MODID);
	public static final RegistryObject<Enchantment> ENERGY_EXTRACTION = REGISTRY.register("energy_extraction", () -> new EnergyExtractionEnchantment());
}
