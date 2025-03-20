package net.mcreator.futureweapons.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.futureweapons.world.inventory.FusGUIMenu;
import net.mcreator.futureweapons.procedures.TextfuelProcedure;
import net.mcreator.futureweapons.procedures.O9Procedure;
import net.mcreator.futureweapons.procedures.O8Procedure;
import net.mcreator.futureweapons.procedures.O7Procedure;
import net.mcreator.futureweapons.procedures.O6Procedure;
import net.mcreator.futureweapons.procedures.O5Procedure;
import net.mcreator.futureweapons.procedures.O4Procedure;
import net.mcreator.futureweapons.procedures.O3Procedure;
import net.mcreator.futureweapons.procedures.O2Procedure;
import net.mcreator.futureweapons.procedures.O21Procedure;
import net.mcreator.futureweapons.procedures.O20Procedure;
import net.mcreator.futureweapons.procedures.O1Procedure;
import net.mcreator.futureweapons.procedures.O19Procedure;
import net.mcreator.futureweapons.procedures.O18Procedure;
import net.mcreator.futureweapons.procedures.O17Procedure;
import net.mcreator.futureweapons.procedures.O16Procedure;
import net.mcreator.futureweapons.procedures.O15Procedure;
import net.mcreator.futureweapons.procedures.O14Procedure;
import net.mcreator.futureweapons.procedures.O13Procedure;
import net.mcreator.futureweapons.procedures.O12Procedure;
import net.mcreator.futureweapons.procedures.O11Procedure;
import net.mcreator.futureweapons.procedures.O10Procedure;
import net.mcreator.futureweapons.procedures.M9Procedure;
import net.mcreator.futureweapons.procedures.M8Procedure;
import net.mcreator.futureweapons.procedures.M7Procedure;
import net.mcreator.futureweapons.procedures.M6Procedure;
import net.mcreator.futureweapons.procedures.M5Procedure;
import net.mcreator.futureweapons.procedures.M4Procedure;
import net.mcreator.futureweapons.procedures.M3Procedure;
import net.mcreator.futureweapons.procedures.M2Procedure;
import net.mcreator.futureweapons.procedures.M1Procedure;
import net.mcreator.futureweapons.procedures.M11Procedure;
import net.mcreator.futureweapons.procedures.M10Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FusGUIScreen extends AbstractContainerScreen<FusGUIMenu> {
	private final static HashMap<String, Object> guistate = FusGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FusGUIScreen(FusGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("future_weapons:textures/screens/fus_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion.png"), this.leftPos + 97, this.topPos + 25, 0, 0, 24, 37, 24, 37);

		if (O1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion1.png"), this.leftPos + 99, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion2.png"), this.leftPos + 100, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion3.png"), this.leftPos + 101, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion4.png"), this.leftPos + 102, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion5.png"), this.leftPos + 103, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion6.png"), this.leftPos + 104, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion7.png"), this.leftPos + 105, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion8.png"), this.leftPos + 106, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion8.png"), this.leftPos + 107, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion8.png"), this.leftPos + 108, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O11Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion8.png"), this.leftPos + 109, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O12Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion8.png"), this.leftPos + 110, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O13Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion8.png"), this.leftPos + 111, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O14Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion8.png"), this.leftPos + 112, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O15Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion8.png"), this.leftPos + 113, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O16Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion8.png"), this.leftPos + 114, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O17Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion9.png"), this.leftPos + 115, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O18Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion7.png"), this.leftPos + 116, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O19Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion8.png"), this.leftPos + 117, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O20Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion10.png"), this.leftPos + 118, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}
		if (O21Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fusion11.png"), this.leftPos + 119, this.topPos + 25, 0, 0, 1, 37, 1, 37);
		}

		guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter.png"), this.leftPos + 33, this.topPos + 11, 0, 0, 10, 75, 10, 75);

		if (M1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 72, 0, 0, 6, 7, 6, 7);
		}
		if (M2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 66, 0, 0, 6, 7, 6, 7);
		}
		if (M3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 60, 0, 0, 6, 7, 6, 7);
		}
		if (M4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 54, 0, 0, 6, 7, 6, 7);
		}
		if (M5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 48, 0, 0, 6, 7, 6, 7);
		}
		if (M6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 42, 0, 0, 6, 7, 6, 7);
		}
		if (M7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 36, 0, 0, 6, 7, 6, 7);
		}
		if (M8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 30, 0, 0, 6, 7, 6, 7);
		}
		if (M9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 24, 0, 0, 6, 7, 6, 7);
		}
		if (M10Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 18, 0, 0, 6, 7, 6, 7);
		}
		if (M11Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/fuel_meter_full.png"), this.leftPos + 35, this.topPos + 12, 0, 0, 6, 7, 6, 7);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font,

				TextfuelProcedure.execute(world, x, y, z), 20, 3, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
