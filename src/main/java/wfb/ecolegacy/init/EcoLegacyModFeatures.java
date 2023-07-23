
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package wfb.ecolegacy.init;

import wfb.ecolegacy.world.features.ores.DeepslateAncientOreFeature;
import wfb.ecolegacy.EcoLegacyMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class EcoLegacyModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, EcoLegacyMod.MODID);
	public static final RegistryObject<Feature<?>> DEEPSLATE_ANCIENT_ORE = REGISTRY.register("deepslate_ancient_ore", DeepslateAncientOreFeature::new);
}
