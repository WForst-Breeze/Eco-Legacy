
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.ecolegacy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.ecolegacy.item.NaturiteIngotItem;
import net.ecolegacy.item.NaturiteInceptionPickaxeItem;
import net.ecolegacy.item.InceptionPickaxeItem;
import net.ecolegacy.item.EnergyDustItem;
import net.ecolegacy.item.DevItem;
import net.ecolegacy.item.CompressedIronPlateItem;
import net.ecolegacy.item.AncientRawOreItem;
import net.ecolegacy.item.AncientIngotItem;
import net.ecolegacy.item.AncientDustItem;
import net.ecolegacy.EcoLegacyMod;

public class EcoLegacyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, EcoLegacyMod.MODID);
	public static final RegistryObject<Item> INCEPTION_PICKAXE = REGISTRY.register("inception_pickaxe", () -> new InceptionPickaxeItem());
	public static final RegistryObject<Item> DEV = REGISTRY.register("dev", () -> new DevItem());
	public static final RegistryObject<Item> ENERGY_DUST = REGISTRY.register("energy_dust", () -> new EnergyDustItem());
	public static final RegistryObject<Item> DEEPSLATE_ANCIENT_ORE = block(EcoLegacyModBlocks.DEEPSLATE_ANCIENT_ORE);
	public static final RegistryObject<Item> ANCIENT_RAW_ORE = REGISTRY.register("ancient_raw_ore", () -> new AncientRawOreItem());
	public static final RegistryObject<Item> ANCIENT_DUST = REGISTRY.register("ancient_dust", () -> new AncientDustItem());
	public static final RegistryObject<Item> ANCIENT_INGOT = REGISTRY.register("ancient_ingot", () -> new AncientIngotItem());
	public static final RegistryObject<Item> HIGH_ENERGY_REFINER = block(EcoLegacyModBlocks.HIGH_ENERGY_REFINER);
	public static final RegistryObject<Item> COMPRESSED_IRON_PLATE = REGISTRY.register("compressed_iron_plate", () -> new CompressedIronPlateItem());
	public static final RegistryObject<Item> NATURITE_INGOT = REGISTRY.register("naturite_ingot", () -> new NaturiteIngotItem());
	public static final RegistryObject<Item> NATURITE_INCEPTION_PICKAXE = REGISTRY.register("naturite_inception_pickaxe", () -> new NaturiteInceptionPickaxeItem());
	public static final RegistryObject<Item> NATURAL_BLOCK = block(EcoLegacyModBlocks.NATURAL_BLOCK);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
