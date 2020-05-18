
package net.mcreator.vanilla_expansion_m.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.vanilla_expansion_m.MsVanillaExpansionElements;

@MsVanillaExpansionElements.ModElement.Tag
public class JadeGemItem extends MsVanillaExpansionElements.ModElement {
	@ObjectHolder("vannila_expansion_m:jadegem")
	public static final Item block = null;
	public JadeGemItem(MsVanillaExpansionElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64));
			setRegistryName("jadegem");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
