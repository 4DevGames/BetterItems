
package net.mcreator.vanilla_expansion_m.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.vanilla_expansion_m.MsVanillaExpansionElements;

@MsVanillaExpansionElements.ModElement.Tag
public class AquamarineShovelItem extends MsVanillaExpansionElements.ModElement {
	@ObjectHolder("vannila_expansion_m:aquamarineshovel")
	public static final Item block = null;
	public AquamarineShovelItem(MsVanillaExpansionElements instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 852;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 5;
			}

			public int getEnchantability() {
				return 34;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("aquamarineshovel"));
	}
}
