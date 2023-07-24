
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wfb.ecolegacy.init;

import wfb.ecolegacy.item.InceptionPickaxeItem;
import wfb.ecolegacy.item.EnergyDustItem;
import wfb.ecolegacy.item.DevItem;
import wfb.ecolegacy.item.AncientRawOreItem;
import wfb.ecolegacy.item.AncientIngotItem;
import wfb.ecolegacy.item.AncientDustItem;
import wfb.ecolegacy.EcoLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

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

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
