
package net.mcreator.vanilla_expansion_m.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.Entity;

import net.mcreator.vanilla_expansion_m.MsVanillaExpansionElements;

@MsVanillaExpansionElements.ModElement.Tag
public class AmethystArmorItem extends MsVanillaExpansionElements.ModElement {
	@ObjectHolder("vannila_expansion_m:amethystarmorhelmet")
	public static final Item helmet = null;
	@ObjectHolder("vannila_expansion_m:amethystarmorbody")
	public static final Item body = null;
	@ObjectHolder("vannila_expansion_m:amethystarmorlegs")
	public static final Item legs = null;
	@ObjectHolder("vannila_expansion_m:amethystarmorboots")
	public static final Item boots = null;
	public AmethystArmorItem(MsVanillaExpansionElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 27;
			}

			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{4, 11, 9, 4}[slot.getIndex()];
			}

			public int getEnchantability() {
				return 16;
			}

			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(AmethystGemItem.block, (int) (1)));
			}

			@OnlyIn(Dist.CLIENT)
			public String getName() {
				return "amethystarmor";
			}

			public float getToughness() {
				return 2.5f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "vannila_expansion_m:textures/models/armor/amethyst_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("amethystarmorhelmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "vannila_expansion_m:textures/models/armor/amethyst_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("amethystarmorbody"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "vannila_expansion_m:textures/models/armor/amethyst_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("amethystarmorlegs"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "vannila_expansion_m:textures/models/armor/amethyst_layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}
		}.setRegistryName("amethystarmorboots"));
	}
}
