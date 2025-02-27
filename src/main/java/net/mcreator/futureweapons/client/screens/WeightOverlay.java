
package net.mcreator.futureweapons.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.futureweapons.procedures.Textprocedureif3Procedure;
import net.mcreator.futureweapons.procedures.Textprocedureif2Procedure;
import net.mcreator.futureweapons.procedures.Textprocedureif1Procedure;
import net.mcreator.futureweapons.procedures.TextprocedureProcedure;
import net.mcreator.futureweapons.procedures.F9Procedure;
import net.mcreator.futureweapons.procedures.F8Procedure;
import net.mcreator.futureweapons.procedures.F7Procedure;
import net.mcreator.futureweapons.procedures.F6Procedure;
import net.mcreator.futureweapons.procedures.F5Procedure;
import net.mcreator.futureweapons.procedures.F4Procedure;
import net.mcreator.futureweapons.procedures.F41Procedure;
import net.mcreator.futureweapons.procedures.F40Procedure;
import net.mcreator.futureweapons.procedures.F3Procedure;
import net.mcreator.futureweapons.procedures.F39Procedure;
import net.mcreator.futureweapons.procedures.F38Procedure;
import net.mcreator.futureweapons.procedures.F37Procedure;
import net.mcreator.futureweapons.procedures.F36Procedure;
import net.mcreator.futureweapons.procedures.F35Procedure;
import net.mcreator.futureweapons.procedures.F34Procedure;
import net.mcreator.futureweapons.procedures.F33Procedure;
import net.mcreator.futureweapons.procedures.F32Procedure;
import net.mcreator.futureweapons.procedures.F31Procedure;
import net.mcreator.futureweapons.procedures.F30Procedure;
import net.mcreator.futureweapons.procedures.F2Procedure;
import net.mcreator.futureweapons.procedures.F29Procedure;
import net.mcreator.futureweapons.procedures.F28Procedure;
import net.mcreator.futureweapons.procedures.F27Procedure;
import net.mcreator.futureweapons.procedures.F26Procedure;
import net.mcreator.futureweapons.procedures.F25Procedure;
import net.mcreator.futureweapons.procedures.F24Procedure;
import net.mcreator.futureweapons.procedures.F23Procedure;
import net.mcreator.futureweapons.procedures.F22Procedure;
import net.mcreator.futureweapons.procedures.F21Procedure;
import net.mcreator.futureweapons.procedures.F20Procedure;
import net.mcreator.futureweapons.procedures.F1Procedure;
import net.mcreator.futureweapons.procedures.F19Procedure;
import net.mcreator.futureweapons.procedures.F18Procedure;
import net.mcreator.futureweapons.procedures.F17Procedure;
import net.mcreator.futureweapons.procedures.F16Procedure;
import net.mcreator.futureweapons.procedures.F15Procedure;
import net.mcreator.futureweapons.procedures.F14Procedure;
import net.mcreator.futureweapons.procedures.F13Procedure;
import net.mcreator.futureweapons.procedures.F12Procedure;
import net.mcreator.futureweapons.procedures.F11Procedure;
import net.mcreator.futureweapons.procedures.F10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class WeightOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/weight_empty.png"), w / 2 + 160, h / 2 + 67, 0, 0, 64, 64, 64, 64);

			if (F1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_1.png"), w / 2 + 188, h / 2 + 113, 0, 0, 10, 2, 10, 2);
			}
			if (F2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_12.png"), w / 2 + 184, h / 2 + 111, 0, 0, 16, 2, 16, 2);
			}
			if (F3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_13.png"), w / 2 + 182, h / 2 + 110, 0, 0, 20, 2, 20, 2);
			}
			if (F4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_14.png"), w / 2 + 180, h / 2 + 109, 0, 0, 22, 2, 22, 2);
			}
			if (F5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_15.png"), w / 2 + 179, h / 2 + 109, 0, 0, 24, 2, 24, 2);
			}
			if (F6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_21.png"), w / 2 + 179, h / 2 + 107, 0, 0, 26, 2, 26, 2);
			}
			if (F7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_22.png"), w / 2 + 178, h / 2 + 106, 0, 0, 28, 2, 28, 2);
			}
			if (F8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_23.png"), w / 2 + 178, h / 2 + 105, 0, 0, 28, 2, 28, 2);
			}
			if (F9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_24.png"), w / 2 + 177, h / 2 + 104, 0, 0, 30, 2, 30, 2);
			}
			if (F10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_25.png"), w / 2 + 177, h / 2 + 104, 0, 0, 30, 2, 30, 2);
			}
			if (F11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_31.png"), w / 2 + 177, h / 2 + 102, 0, 0, 30, 2, 30, 2);
			}
			if (F12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_32.png"), w / 2 + 176, h / 2 + 101, 0, 0, 32, 2, 32, 2);
			}
			if (F13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_33.png"), w / 2 + 176, h / 2 + 100, 0, 0, 32, 2, 32, 2);
			}
			if (F14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_34.png"), w / 2 + 176, h / 2 + 99, 0, 0, 32, 2, 32, 2);
			}
			if (F15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_35.png"), w / 2 + 176, h / 2 + 98, 0, 0, 32, 2, 32, 2);
			}
			if (F16Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_41.png"), w / 2 + 176, h / 2 + 97, 0, 0, 32, 2, 32, 2);
			}
			if (F18Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_43.png"), w / 2 + 176, h / 2 + 95, 0, 0, 32, 2, 32, 2);
			}
			if (F19Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_44.png"), w / 2 + 176, h / 2 + 94, 0, 0, 32, 2, 32, 2);
			}
			if (F20Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_45.png"), w / 2 + 177, h / 2 + 94, 0, 0, 30, 2, 30, 2);
			}
			if (F21Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_51.png"), w / 2 + 177, h / 2 + 92, 0, 0, 30, 2, 30, 2);
			}
			if (F22Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_52.png"), w / 2 + 177, h / 2 + 91, 0, 0, 30, 2, 30, 2);
			}
			if (F23Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_53.png"), w / 2 + 178, h / 2 + 90, 0, 0, 28, 2, 28, 2);
			}
			if (F24Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_54.png"), w / 2 + 178, h / 2 + 89, 0, 0, 28, 2, 28, 2);
			}
			if (F25Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_55.png"), w / 2 + 179, h / 2 + 88, 0, 0, 26, 2, 26, 2);
			}
			if (F17Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_41.png"), w / 2 + 176, h / 2 + 96, 0, 0, 32, 2, 32, 2);
			}
			if (F26Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_61.png"), w / 2 + 180, h / 2 + 87, 0, 0, 24, 2, 24, 2);
			}
			if (F27Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_62.png"), w / 2 + 181, h / 2 + 86, 0, 0, 22, 2, 22, 2);
			}
			if (F28Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_63.png"), w / 2 + 180, h / 2 + 85, 0, 0, 24, 2, 24, 2);
			}
			if (F29Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_64.png"), w / 2 + 179, h / 2 + 84, 0, 0, 26, 2, 26, 2);
			}
			if (F30Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_65.png"), w / 2 + 178, h / 2 + 83, 0, 0, 28, 2, 28, 2);
			}
			if (F31Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_71.png"), w / 2 + 178, h / 2 + 82, 0, 0, 28, 2, 28, 2);
			}
			if (F32Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_72.png"), w / 2 + 177, h / 2 + 81, 0, 0, 30, 2, 30, 2);
			}
			if (F33Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_73.png"), w / 2 + 177, h / 2 + 80, 0, 0, 30, 2, 30, 2);
			}
			if (F34Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_74.png"), w / 2 + 177, h / 2 + 79, 0, 0, 30, 2, 30, 2);
			}
			if (F35Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_75.png"), w / 2 + 177, h / 2 + 78, 0, 0, 30, 2, 30, 2);
			}
			if (F36Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_76.png"), w / 2 + 177, h / 2 + 77, 0, 0, 30, 2, 30, 2);
			}
			if (F37Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_81.png"), w / 2 + 177, h / 2 + 76, 0, 0, 30, 2, 30, 2);
			}
			if (F38Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_82.png"), w / 2 + 177, h / 2 + 75, 0, 0, 30, 2, 30, 2);
			}
			if (F39Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_83.png"), w / 2 + 178, h / 2 + 74, 0, 0, 28, 2, 28, 2);
			}
			if (F40Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_84.png"), w / 2 + 180, h / 2 + 73, 0, 0, 24, 2, 24, 2);
			}
			if (F41Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/full_weight_85.png"), w / 2 + 184, h / 2 + 72, 0, 0, 16, 2, 16, 2);
			}
			if (Textprocedureif1Procedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						TextprocedureProcedure.execute(entity), w / 2 + 187, h / 2 + 95, -3355444, false);
			if (Textprocedureif2Procedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						TextprocedureProcedure.execute(entity), w / 2 + 184, h / 2 + 95, -3355444, false);
			if (Textprocedureif3Procedure.execute(entity))
				event.getGuiGraphics().drawString(Minecraft.getInstance().font,

						TextprocedureProcedure.execute(entity), w / 2 + 181, h / 2 + 95, -3355444, false);
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
