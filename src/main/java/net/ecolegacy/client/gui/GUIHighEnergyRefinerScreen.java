package net.ecolegacy.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;

import net.ecolegacy.world.inventory.GUIHighEnergyRefinerMenu;
import net.ecolegacy.network.GUIHighEnergyRefinerButtonMessage;
import net.ecolegacy.EcoLegacyMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GUIHighEnergyRefinerScreen extends AbstractContainerScreen<GUIHighEnergyRefinerMenu> {
	private final static HashMap<String, Object> guistate = GUIHighEnergyRefinerMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_refine;

	public GUIHighEnergyRefinerScreen(GUIHighEnergyRefinerMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 203;
	}

	private static final ResourceLocation texture = new ResourceLocation("eco_legacy:textures/screens/gui_high_energy_refiner.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.eco_legacy.gui_high_energy_refiner.label_high_energy_refiner"), 6, 7, -12829636);
		this.font.draw(poseStack, Component.translatable("gui.eco_legacy.gui_high_energy_refiner.label_inventory"), 7, 92, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		button_refine = Button.builder(Component.translatable("gui.eco_legacy.gui_high_energy_refiner.button_refine"), e -> {
			if (true) {
				EcoLegacyMod.PACKET_HANDLER.sendToServer(new GUIHighEnergyRefinerButtonMessage(0, x, y, z));
				GUIHighEnergyRefinerButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 60, this.topPos + 178, 56, 20).build();
		guistate.put("button:button_refine", button_refine);
		this.addRenderableWidget(button_refine);
	}
}
