package net.mcreator.vanilla_expansion_m.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.vanilla_expansion_m.MsVanillaExpansionElements;

@MsVanillaExpansionElements.ModElement.Tag
public class JadeTotemNewRightClickedInAirProcedure extends MsVanillaExpansionElements.ModElement {
	public JadeTotemNewRightClickedInAirProcedure(MsVanillaExpansionElements instance) {
		super(instance, 33);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure JadeTotemNewRightClickedInAir!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure JadeTotemNewRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 320, (int) 4));
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 2400);
	}
}
