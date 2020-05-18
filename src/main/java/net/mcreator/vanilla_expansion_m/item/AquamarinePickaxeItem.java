
package net.mcreator.vanilla_expansion_m.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.vanilla_expansion_m.MsVanillaExpansionElements;

@MsVanillaExpansionElements.ModElement.Tag
public class AquamarinePickaxeItem extends MsVanillaExpansionElements.ModElement {
	@ObjectHolder("vannila_expansion_m:aquamarinepickaxe")
	public static final Item block = null;
	public AquamarinePickaxeItem(MsVanillaExpansionElements instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
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
		}.setRegistryName("aquamarinepickaxe"));
	}
}
