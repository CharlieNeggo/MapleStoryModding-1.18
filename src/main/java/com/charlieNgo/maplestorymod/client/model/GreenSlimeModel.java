package com.charlieNgo.maplestorymod.client.model;

import com.charlieNgo.maplestorymod.entities.GreenSlime;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class GreenSlimeModel<T extends GreenSlime> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "green_slime"), "main");
    private final ModelPart body;
    private final ModelPart string;

    public GreenSlimeModel(ModelPart root) {
        this.body = root.getChild("body");
        this.string = root.getChild("string");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(23, 22).addBox(-3.0F, -2.0F, -3.0F, 5.0F, -1.0F, 5.0F, new CubeDeformation(1.0F))
                .texOffs(0, 0).addBox(-5.0F, -6.0F, -5.0F, 9.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(9, 30).addBox(-4.0F, -3.0F, 2.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(23, 12).addBox(2.0F, -3.0F, -4.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(28, 26).addBox(-4.0F, -3.0F, -5.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(17, 22).addBox(-5.0F, -3.0F, -4.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 12).addBox(-4.0F, -7.0F, -5.0F, 7.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
                .texOffs(0, 28).addBox(3.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(27, 0).addBox(-5.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(-4.0F, -8.0F, -3.0F, 7.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(9, 33).addBox(-3.0F, -8.0F, 2.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 20).addBox(-3.0F, -8.0F, -4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 30).addBox(-3.0F, -9.0F, -2.0F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 6).addBox(-2.0F, -9.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 4).addBox(-2.0F, -9.0F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition string = partdefinition.addOrReplaceChild("string", CubeListBuilder.create().texOffs(23, 12).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 18).addBox(-3.0F, -8.0F, 0.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 16).addBox(-5.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(19, 22).addBox(-6.0F, -7.0F, 2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 22).addBox(-7.0F, -5.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(5, 15).addBox(-7.0F, -3.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(5, 13).addBox(-6.0F, -2.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 14).addBox(-5.0F, -1.0F, 6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-1.0F, -2.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 12).addBox(-3.0F, 0.0F, 6.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 21.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        body.render(poseStack, buffer, packedLight, packedOverlay);
        string.render(poseStack, buffer, packedLight, packedOverlay);
    }
}
