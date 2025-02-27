package net.mcreator.futureweapons.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.futureweapons.world.inventory.EngineertableMenu;
import net.mcreator.futureweapons.network.EngineertableButtonMessage;
import net.mcreator.futureweapons.FutureWeaponsMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class EngineertableScreen extends AbstractContainerScreen<EngineertableMenu> {
	private final static HashMap<String, Object> guistate = EngineertableMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_sozdat;

	public EngineertableScreen(EngineertableMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 170;
	}

	@Override
	public boolean isPauseScreen() {
		return true;
	}

	private static final ResourceLocation texture = new ResourceLocation("future_weapons:textures/screens/engineertable.png");

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

		guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/desk.png"), this.leftPos + 15, this.topPos + 6, 0, 0, 144, 72, 144, 72);

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
	}

	@Override
	public void init() {
		super.init();
		button_sozdat = Button.builder(Component.translatable("gui.future_weapons.engineertable.button_sozdat"), e -> {
			if (true) {
				FutureWeaponsMod.PACKET_HANDLER.sendToServer(new EngineertableButtonMessage(0, x, y, z));
				EngineertableButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 51, this.topPos + 64, 61, 20).build();
		guistate.put("button:button_sozdat", button_sozdat);
		this.addRenderableWidget(button_sozdat);
	}
}
