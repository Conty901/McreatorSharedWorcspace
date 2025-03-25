package net.mcreator.futureweapons.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.futureweapons.world.inventory.Choicegui2Menu;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class Choicegui2Screen extends AbstractContainerScreen<Choicegui2Menu> {
	private final static HashMap<String, Object> guistate = Choicegui2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_simple_tile;
	ImageButton imagebutton_simple_tile1;

	public Choicegui2Screen(Choicegui2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 512;
		this.imageHeight = 331;
	}

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

		guiGraphics.blit(new ResourceLocation("future_weapons:textures/screens/gradient43.png"), this.leftPos + 3, this.topPos + 17, 0, 0, 500, 300, 500, 300);

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
		imagebutton_simple_tile = new ImageButton(this.leftPos + 48, this.topPos + 51, 132, 40, 0, 0, 40, new ResourceLocation("future_weapons:textures/screens/atlas/imagebutton_simple_tile.png"), 132, 80, e -> {
		});
		guistate.put("button:imagebutton_simple_tile", imagebutton_simple_tile);
		this.addRenderableWidget(imagebutton_simple_tile);
		imagebutton_simple_tile1 = new ImageButton(this.leftPos + 48, this.topPos + 100, 132, 40, 0, 0, 40, new ResourceLocation("future_weapons:textures/screens/atlas/imagebutton_simple_tile1.png"), 132, 80, e -> {
		});
		guistate.put("button:imagebutton_simple_tile1", imagebutton_simple_tile1);
		this.addRenderableWidget(imagebutton_simple_tile1);
	}
}
