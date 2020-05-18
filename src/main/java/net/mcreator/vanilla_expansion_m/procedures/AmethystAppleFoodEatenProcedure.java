package net.mcreator.vanilla_expansion_m.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.vanilla_expansion_m.MsVanillaExpansionElements;

@MsVanillaExpansionElements.ModElement.Tag
public class AmethystAppleFoodEatenProcedure extends MsVanillaExpansionElements.ModElement {
	public AmethystAppleFoodEatenProcedure(MsVanillaExpansionElements instance) {
		super(instance, 22);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure AmethystAppleFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 3000, (int) 2));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 300, (int) 4));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 2400, (int) 0));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) 1200, (int) 4));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.GLOWING, (int) 6000, (int) 0));
	}
}
