
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wfb.ecolegacy.init;

import wfb.ecolegacy.block.HighEnergyRefinerBlock;
import wfb.ecolegacy.block.DeepslateAncientOreBlock;
import wfb.ecolegacy.EcoLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class EcoLegacyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EcoLegacyMod.MODID);
	public static final RegistryObject<Block> DEEPSLATE_ANCIENT_ORE = REGISTRY.register("deepslate_ancient_ore", () -> new DeepslateAncientOreBlock());
	public static final RegistryObject<Block> HIGH_ENERGY_REFINER = REGISTRY.register("high_energy_refiner", () -> new HighEnergyRefinerBlock());
}
