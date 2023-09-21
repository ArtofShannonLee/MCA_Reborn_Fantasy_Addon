package com.artofshannonlee.fantasymcar.client.model;

import com.artofshannonlee.fantasymcar.FantasyMCAR;
import com.artofshannonlee.fantasymcar.entity.custom.SlimVillagerEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import forge.net.mca.client.model.CommonVillagerModel;
import forge.net.mca.entity.VillagerLike;
import forge.net.mca.entity.ai.relationship.VillagerDimensions;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SlimVillagerEntityModelFMCA extends AnimatedGeoModel<SlimVillagerEntity> implements CommonVillagerModel {


    @Override   //Model file
    public ResourceLocation getModelLocation(SlimVillagerEntity object) {
        return new ResourceLocation ( FantasyMCAR.MOD_ID, "geo/slimvillager.geo.json");
    }

    @Override  //Texture file
    public ResourceLocation getTextureLocation(SlimVillagerEntity object) {
        return null;

    }

    @Override
    public ModelPart getBreastPart() {
        return null;
    }

    @Override
    public ModelPart getBodyPart() {
        return null;
    }

    @Override
    public Iterable<ModelPart> getCommonHeadParts() {
        return null;
    }

    @Override
    public Iterable<ModelPart> getCommonBodyParts() {
        return null;
    }

    @Override
    public Iterable<ModelPart> getBreastParts() {
        return null;
    }

    @Override
    public VillagerDimensions.Mutable getDimensions() {
        return null;
    }

    @Override
    public float getBreastSize() {
        return 0;
    }

    @Override
    public void setBreastSize(float v) {

    }

    @Override
    public void renderCommon(PoseStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        CommonVillagerModel.super.renderCommon ( matrices, vertices, light, overlay, red, green, blue, alpha );
    }

    @Override
    public void copyCommonAttributes(CommonVillagerModel target) {
        CommonVillagerModel.super.copyCommonAttributes ( target );
    }

    @Override
    public void applyVillagerDimensions(VillagerLike villager, boolean isSneaking) {
        CommonVillagerModel.super.applyVillagerDimensions ( villager, isSneaking );
    }

    @Override
    public void setLivingAnimations(SlimVillagerEntity entity, Integer uniqueID) {
        super.setLivingAnimations ( entity, uniqueID );
    }

    @Override
    public IBone getBone(String boneName) {
        return super.getBone ( boneName );
    }

    @Override
    public ResourceLocation getAnimationFileLocation(SlimVillagerEntity animatable) {
        return null;
    }
}
