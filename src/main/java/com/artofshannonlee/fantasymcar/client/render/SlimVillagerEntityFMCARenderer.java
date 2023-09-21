package com.artofshannonlee.fantasymcar.client.render;

import com.artofshannonlee.fantasymcar.FantasyMCAR;
import com.artofshannonlee.fantasymcar.client.model.SlimVillagerEntityModelFMCA;
import com.artofshannonlee.fantasymcar.entity.custom.SlimVillagerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SlimVillagerEntityFMCARenderer extends GeoEntityRenderer<SlimVillagerEntity> {
    public SlimVillagerEntityFMCARenderer(EntityRendererProvider.Context renderManager) {
        super ( renderManager, new SlimVillagerEntityModelFMCA ());
        this.shadowRadius = 0.5f;
    }

    @Override
    public ResourceLocation getTextureLocation(@NotNull SlimVillagerEntity instance) {
        return new ResourceLocation ( FantasyMCAR.MOD_ID, "textures/entity/slimvillager/slimvillager.png");
    }

    @Override
    public RenderType getRenderType(SlimVillagerEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        return super.getRenderType ( animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation );

    }


}
