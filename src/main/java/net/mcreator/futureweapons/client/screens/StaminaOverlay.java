
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

import net.mcreator.futureweapons.procedures.S9Procedure;
import net.mcreator.futureweapons.procedures.S8Procedure;
import net.mcreator.futureweapons.procedures.S7Procedure;
import net.mcreator.futureweapons.procedures.S6Procedure;
import net.mcreator.futureweapons.procedures.S5Procedure;
import net.mcreator.futureweapons.procedures.S4Procedure;
import net.mcreator.futureweapons.procedures.S3Procedure;
import net.mcreator.futureweapons.procedures.S2Procedure;
import net.mcreator.futureweapons.procedures.S1Procedure;
import net.mcreator.futureweapons.procedures.S10Procedure;
import net.mcreator.futureweapons.procedures.D9Procedure;
import net.mcreator.futureweapons.procedures.D8Procedure;
import net.mcreator.futureweapons.procedures.D7Procedure;
import net.mcreator.futureweapons.procedures.D6Procedure;
import net.mcreator.futureweapons.procedures.D60Procedure;
import net.mcreator.futureweapons.procedures.D5Procedure;
import net.mcreator.futureweapons.procedures.D59Procedure;
import net.mcreator.futureweapons.procedures.D58Procedure;
import net.mcreator.futureweapons.procedures.D57Procedure;
import net.mcreator.futureweapons.procedures.D56Procedure;
import net.mcreator.futureweapons.procedures.D55Procedure;
import net.mcreator.futureweapons.procedures.D54Procedure;
import net.mcreator.futureweapons.procedures.D53Procedure;
import net.mcreator.futureweapons.procedures.D52Procedure;
import net.mcreator.futureweapons.procedures.D51Procedure;
import net.mcreator.futureweapons.procedures.D50Procedure;
import net.mcreator.futureweapons.procedures.D4Procedure;
import net.mcreator.futureweapons.procedures.D49Procedure;
import net.mcreator.futureweapons.procedures.D48Procedure;
import net.mcreator.futureweapons.procedures.D47Procedure;
import net.mcreator.futureweapons.procedures.D46Procedure;
import net.mcreator.futureweapons.procedures.D45Procedure;
import net.mcreator.futureweapons.procedures.D44Procedure;
import net.mcreator.futureweapons.procedures.D43Procedure;
import net.mcreator.futureweapons.procedures.D42Procedure;
import net.mcreator.futureweapons.procedures.D41Procedure;
import net.mcreator.futureweapons.procedures.D40Procedure;
import net.mcreator.futureweapons.procedures.D3Procedure;
import net.mcreator.futureweapons.procedures.D39Procedure;
import net.mcreator.futureweapons.procedures.D38Procedure;
import net.mcreator.futureweapons.procedures.D37Procedure;
import net.mcreator.futureweapons.procedures.D36Procedure;
import net.mcreator.futureweapons.procedures.D35Procedure;
import net.mcreator.futureweapons.procedures.D34Procedure;
import net.mcreator.futureweapons.procedures.D33Procedure;
import net.mcreator.futureweapons.procedures.D32Procedure;
import net.mcreator.futureweapons.procedures.D31Procedure;
import net.mcreator.futureweapons.procedures.D30Procedure;
import net.mcreator.futureweapons.procedures.D2Procedure;
import net.mcreator.futureweapons.procedures.D29Procedure;
import net.mcreator.futureweapons.procedures.D28Procedure;
import net.mcreator.futureweapons.procedures.D27Procedure;
import net.mcreator.futureweapons.procedures.D26Procedure;
import net.mcreator.futureweapons.procedures.D25Procedure;
import net.mcreator.futureweapons.procedures.D24Procedure;
import net.mcreator.futureweapons.procedures.D23Procedure;
import net.mcreator.futureweapons.procedures.D22Procedure;
import net.mcreator.futureweapons.procedures.D21Procedure;
import net.mcreator.futureweapons.procedures.D20Procedure;
import net.mcreator.futureweapons.procedures.D1Procedure;
import net.mcreator.futureweapons.procedures.D19Procedure;
import net.mcreator.futureweapons.procedures.D18Procedure;
import net.mcreator.futureweapons.procedures.D17Procedure;
import net.mcreator.futureweapons.procedures.D16Procedure;
import net.mcreator.futureweapons.procedures.D15Procedure;
import net.mcreator.futureweapons.procedures.D14Procedure;
import net.mcreator.futureweapons.procedures.D13Procedure;
import net.mcreator.futureweapons.procedures.D12Procedure;
import net.mcreator.futureweapons.procedures.D11Procedure;
import net.mcreator.futureweapons.procedures.D10Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class StaminaOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
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
			event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty.png"), w / 2 + -25, h / 2 + 65, 0, 0, 50, 6, 50, 6);

			if (D1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_en.png"), w / 2 + -3, h / 2 + 65, 0, 0, 6, 6, 6, 6);
			}
			if (D2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full3.png"), w / 2 + 3, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 4, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + 5, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + 7, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 8, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 9, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + 10, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + 11, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 12, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 13, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + 14, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + 16, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 17, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 18, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D16Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + 19, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D17Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + 20, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D18Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 21, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D19Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 22, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D20Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + 23, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full31.png"), w / 2 + -5, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -6, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + -7, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + -8, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -9, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -10, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + -11, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + -13, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -14, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D11Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -15, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D12Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + -16, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D13Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + -17, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D14Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -18, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D15Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -19, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D16Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + -20, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D17Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + -22, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D18Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -23, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D19Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -24, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D20Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + -25, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (S1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty1.png"), w / 2 + 24, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty11.png"), w / 2 + 28, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty1.png"), w / 2 + 33, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty11.png"), w / 2 + 37, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty1.png"), w / 2 + 42, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty11.png"), w / 2 + 46, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty1.png"), w / 2 + 51, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty11.png"), w / 2 + 55, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty1.png"), w / 2 + 60, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty11.png"), w / 2 + 64, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (D21Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + 25, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D22Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 26, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D23Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 27, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D24Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + 28, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D25Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + 29, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D26Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 30, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D27Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 31, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D28Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + 32, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D29Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + 34, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D30Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 35, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D31Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 36, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D32Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + 37, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D33Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + 38, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D34Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 39, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D35Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 40, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D36Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + 41, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D37Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + 43, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D38Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 44, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D39Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 45, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D40Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + 46, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D41Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + 47, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D42Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 48, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D43Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 49, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D44Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + 50, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D45Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + 52, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D46Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 53, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D47Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 54, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D48Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + 55, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D49Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + 56, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D50Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 57, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D51Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 58, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D52Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + 59, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D53Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + 61, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D54Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 62, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D55Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + 63, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D56Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + 64, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D57Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + 65, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D58Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 66, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D59Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + 67, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D60Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + 68, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (S1Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty1.png"), w / 2 + -30, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S2Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty11.png"), w / 2 + -35, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S3Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty1.png"), w / 2 + -39, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S4Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty11.png"), w / 2 + -44, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S5Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty1.png"), w / 2 + -48, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S6Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty11.png"), w / 2 + -53, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S7Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty1.png"), w / 2 + -57, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S8Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty11.png"), w / 2 + -62, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S9Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty1.png"), w / 2 + -66, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (S10Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just1_empty11.png"), w / 2 + -71, h / 2 + 66, 0, 0, 6, 5, 6, 5);
			}
			if (D21Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + -26, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D22Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -27, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D23Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -28, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D24Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + -29, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D25Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + -31, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D26Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -32, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D27Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -33, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D28Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + -34, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D29Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + -35, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D30Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -36, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D31Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -37, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D32Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + -38, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D33Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + -40, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D34Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -41, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D35Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -42, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D36Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + -43, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D37Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + -44, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D38Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -45, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D39Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -46, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D40Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + -47, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D41Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + -49, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D42Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -50, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D43Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -51, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D44Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + -52, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D45Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + -53, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D46Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -54, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D47Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -55, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D48Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + -56, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D49Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + -58, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D50Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -59, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D51Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -60, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D52Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + -61, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D53Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full21.png"), w / 2 + -62, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D54Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -63, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D55Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full41.png"), w / 2 + -64, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D56Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full11.png"), w / 2 + -65, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D57Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full2.png"), w / 2 + -67, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D58Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -68, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D59Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full4.png"), w / 2 + -69, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
			if (D60Procedure.execute(entity)) {
				event.getGuiGraphics().blit(new ResourceLocation("future_weapons:textures/screens/just_full1.png"), w / 2 + -70, h / 2 + 66, 0, 0, 2, 4, 2, 4);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
