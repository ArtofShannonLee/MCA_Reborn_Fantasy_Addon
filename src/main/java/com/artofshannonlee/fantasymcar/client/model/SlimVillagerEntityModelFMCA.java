package com.artofshannonlee.fantasymcar.client.model;

import com.artofshannonlee.fantasymcar.FantasyMCAR;
import com.artofshannonlee.fantasymcar.entity.custom.SlimVillagerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SlimVillagerEntityModelFMCA extends AnimatedGeoModel<SlimVillagerEntity> {


    @Override   //Model file
    public ResourceLocation getModelLocation(SlimVillagerEntity object) {
        return new ResourceLocation ( FantasyMCAR.MOD_ID, "geo/slimvillager.geo.json");
    }

    @Override  //Texture file
    public ResourceLocation getTextureLocation(SlimVillagerEntity object) {
        return new ResourceLocation ( FantasyMCAR.MOD_ID, "textures/entity/slimvillager/slimvillager.geo.png");
    }

    @Override  //Animation file
    public ResourceLocation getAnimationFileLocation(SlimVillagerEntity animatable) {
        return new ResourceLocation ( FantasyMCAR.MOD_ID, "animations/slimvillager.animation.json");
    }
}
