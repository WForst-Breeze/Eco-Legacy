
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ecolegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.ecolegacy.block.NaturalBlockBlock;
import net.ecolegacy.block.HighEnergyRefinerBlock;
import net.ecolegacy.block.DeepslateAncientOreBlock;
import net.ecolegacy.EcoLegacyMod;

public class EcoLegacyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, EcoLegacyMod.MODID);
	public static final RegistryObject<Block> DEEPSLATE_ANCIENT_ORE = REGISTRY.register("deepslate_ancient_ore", () -> new DeepslateAncientOreBlock());
	public static final RegistryObject<Block> HIGH_ENERGY_REFINER = REGISTRY.register("high_energy_refiner", () -> new HighEnergyRefinerBlock());
	public static final RegistryObject<Block> NATURAL_BLOCK = REGISTRY.register("natural_block", () -> new NaturalBlockBlock());
}
