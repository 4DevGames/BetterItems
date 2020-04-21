
package net.mcreator.better_items.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.better_items.BetterItemsElements;

@BetterItemsElements.ModElement.Tag
public class AmethystAxeItem extends BetterItemsElements.ModElement {
	@ObjectHolder("better_items:amethystaxe")
	public static final Item block = null;
	public AmethystAxeItem(BetterItemsElements instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 569;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 25;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3.2000000000000001f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("amethystaxe"));
	}
}
