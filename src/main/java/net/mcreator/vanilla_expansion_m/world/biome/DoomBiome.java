
package net.mcreator.vanilla_expansion_m.world.biome;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.feature.SphereReplaceConfig;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.BushConfig;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityClassification;
import net.minecraft.block.Blocks;

import net.mcreator.vanilla_expansion_m.entity.UndergroundzombieEntity;
import net.mcreator.vanilla_expansion_m.MsVanillaExpansionElements;

import com.google.common.collect.Lists;

@MsVanillaExpansionElements.ModElement.Tag
public class DoomBiome extends MsVanillaExpansionElements.ModElement {
	@ObjectHolder("vannila_expansion_m:doom")
	public static final CustomBiome biome = null;
	public DoomBiome(MsVanillaExpansionElements instance) {
		super(instance, 77);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new CustomBiome());
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
	static class CustomBiome extends Biome {
		public CustomBiome() {
			super(new Biome.Builder().downfall(0f).depth(0.1f).scale(0.2f).temperature(2f).precipitation(Biome.RainType.NONE)
					.category(Biome.Category.NETHER).waterColor(-13421773).waterFogColor(-13421773)
					.surfaceBuilder(SurfaceBuilder.DEFAULT, new SurfaceBuilderConfig(Blocks.NETHER_WART_BLOCK.getDefaultState(),
							Blocks.NETHERRACK.getDefaultState(), Blocks.NETHERRACK.getDefaultState())));
			setRegistryName("doom");
			DefaultBiomeFeatures.addCarvers(this);
			DefaultBiomeFeatures.addStructures(this);
			DefaultBiomeFeatures.addMonsterRooms(this);
			DefaultBiomeFeatures.addOres(this);
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.DEAD_BUSH,
					IFeatureConfig.NO_FEATURE_CONFIG, Placement.COUNT_HEIGHTMAP_DOUBLE, new FrequencyConfig(3)));
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH,
					new BushConfig(Blocks.BROWN_MUSHROOM.getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(2)));
			addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.BUSH,
					new BushConfig(Blocks.RED_MUSHROOM.getDefaultState()), Placement.CHANCE_HEIGHTMAP_DOUBLE, new ChanceConfig(2)));
			addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
					Biome.createDecoratedFeature(Feature.DISK,
							new SphereReplaceConfig(Blocks.GRAVEL.getDefaultState(), 6, 2,
									Lists.newArrayList(Blocks.DIRT.getDefaultState(), Blocks.GRASS_BLOCK.getDefaultState())),
							Placement.COUNT_TOP_SOLID, new FrequencyConfig(4)));
			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.BLAZE, 15, 1, 5));
			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.MAGMA_CUBE, 15, 1, 5));
			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.SKELETON, 15, 1, 5));
			this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(UndergroundzombieEntity.entity, 15, 1, 5));
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getGrassColor(BlockPos pos) {
			return -13421824;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getFoliageColor(BlockPos pos) {
			return -13421824;
		}

		@OnlyIn(Dist.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -13434880;
		}
	}
}
