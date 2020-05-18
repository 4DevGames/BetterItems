
package net.mcreator.vanilla_expansion_m.gui.overlay;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import net.mcreator.vanilla_expansion_m.MsVanillaExpansionElements;

@MsVanillaExpansionElements.ModElement.Tag
public class MVanillaOverlay extends MsVanillaExpansionElements.ModElement {
	public MVanillaOverlay(MsVanillaExpansionElements instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void eventHandler(RenderGameOverlayEvent event) {
		if (!event.isCancelable() && event.getType() == RenderGameOverlayEvent.ElementType.HELMET) {
			int posX = (event.getWindow().getScaledWidth()) / 2;
			int posY = (event.getWindow().getScaledHeight()) / 2;
			PlayerEntity entity = Minecraft.getInstance().player;
			World world = entity.world;
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			if ((true)) {
				Minecraft.getInstance().fontRenderer.drawString("M's Vanilla Expansion", posX + -203, posY + 80, -16777216);
				Minecraft.getInstance().fontRenderer.drawString("Beta 1.1.0", posX + -203, posY + 107, -16777216);
				Minecraft.getInstance().fontRenderer.drawString("By RedWitherYT", posX + -204, posY + 91, -16777216);
			}
		}
	}
}
