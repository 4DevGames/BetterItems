package net.mcreator.vanilla_expansion_m.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.vanilla_expansion_m.MsVanillaExpansionElements;

@MsVanillaExpansionElements.ModElement.Tag
public class SlimeslingBulletHitsLivingEntityProcedure extends MsVanillaExpansionElements.ModElement {
	public SlimeslingBulletHitsLivingEntityProcedure(MsVanillaExpansionElements instance) {
		super(instance, 73);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SlimeslingBulletHitsLivingEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 100, (int) 2));
	}
}
