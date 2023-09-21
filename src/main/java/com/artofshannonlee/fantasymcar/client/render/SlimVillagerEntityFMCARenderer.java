package com.artofshannonlee.fantasymcar.client.render;

import forge.net.mca.client.model.VillagerEntityModelMCA;
import forge.net.mca.client.render.VillagerLikeEntityMCARenderer;
import forge.net.mca.client.render.layer.ClothingLayer;
import forge.net.mca.client.render.layer.FaceLayer;
import forge.net.mca.client.render.layer.HairLayer;
import forge.net.mca.client.render.layer.SkinLayer;
import forge.net.mca.entity.VillagerEntityMCA;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SlimVillagerEntityFMCARenderer extends VillagerLikeEntityMCARenderer {
    public SlimVillagerEntityFMCARenderer(EntityRendererProvider.Context ctx, VillagerEntityModelMCA model) {
        super (ctx, createModel(VillagerEntityModelMCA.bodyData( CubeDeformation.NONE)).hideWears());
        this.addLayer(new SkinLayer (this, (VillagerEntityModelMCA)this.model));
        this.addLayer(new FaceLayer (this, createModel(VillagerEntityModelMCA.bodyData(new CubeDeformation(0.01F))).hideWears(), "normal"));
        this.addLayer(new ClothingLayer (this, createModel(VillagerEntityModelMCA.bodyData(new CubeDeformation(0.0625F))), "normal"));
        this.addLayer(new HairLayer (this, createModel(VillagerEntityModelMCA.hairData(new CubeDeformation(0.125F)))));
    }
    private static VillagerEntityModelMCA<VillagerEntityMCA> createModel(MeshDefinition data) {
        return new VillagerEntityModelMCA( LayerDefinition.create(data, 64, 64).bakeRoot());
    }
}
