package net.mcreator.futureweapons.client.renderer;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.futureweapons.entity.AcidgunprojectileEntity;
import net.mcreator.futureweapons.client.model.Modelpula;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class AcidgunprojectileRenderer extends EntityRenderer<AcidgunprojectileEntity> {
	private static final ResourceLocation texture = new ResourceLocation("future_weapons:textures/entities/pula.png");
	private final Modelpula model;

	public AcidgunprojectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelpula(context.bakeLayer(Modelpula.LAYER_LOCATION));
	}

	@Override
	public void render(AcidgunprojectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(AcidgunprojectileEntity entity) {
		return texture;
	}
}
