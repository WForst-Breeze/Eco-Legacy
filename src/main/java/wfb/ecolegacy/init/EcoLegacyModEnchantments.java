
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package wfb.ecolegacy.init;

import wfb.ecolegacy.enchantment.EnergyExtractionEnchantment;
import wfb.ecolegacy.EcoLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

public class EcoLegacyModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, EcoLegacyMod.MODID);
	public static final RegistryObject<Enchantment> ENERGY_EXTRACTION = REGISTRY.register("energy_extraction", () -> new EnergyExtractionEnchantment());
}
