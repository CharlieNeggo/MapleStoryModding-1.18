package com.charlieNgo.maplestorymod.entities.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class SmirkyGhostStumpModel<T extends Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "smirky_ghost_stump"), "main");
    private final ModelPart top_left;
    private final ModelPart bottom_left;
    private final ModelPart bottom_right;
    private final ModelPart top_riight;
    private final ModelPart body;
    private final ModelPart branch;

    public SmirkyGhostStumpModel(ModelPart root) {
        this.top_left = root.getChild("top_left");
        this.bottom_left = root.getChild("bottom_left");
        this.bottom_right = root.getChild("bottom_right");
        this.top_riight = root.getChild("top_riight");
        this.body = root.getChild("body");
        this.branch = root.getChild("branch");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition top_left = partdefinition.addOrReplaceChild("top_left", CubeListBuilder.create().texOffs(75, 14).addBox(4.0F, -2.0F, -9.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 74).addBox(8.0F, -2.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 66).addBox(8.0F, -3.0F, -6.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(20, 66).addBox(5.0F, -3.0F, -9.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 0).addBox(7.0F, -4.0F, -7.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 0).addBox(6.0F, -4.0F, -8.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(73, 55).addBox(6.0F, 0.0F, -9.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 73).addBox(8.0F, 0.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 73).addBox(7.0F, -1.0F, -8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 42).addBox(7.0F, 3.0F, -9.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

        PartDefinition bottom_left = partdefinition.addOrReplaceChild("bottom_left", CubeListBuilder.create().texOffs(4, 74).addBox(4.0F, -2.0F, 8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(73, 60).addBox(8.0F, -2.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 66).addBox(5.0F, -3.0F, 8.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 66).addBox(8.0F, -3.0F, 5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 39).addBox(6.0F, -4.0F, 7.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 39).addBox(7.0F, -4.0F, 6.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(19, 73).addBox(8.0F, 0.0F, 6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(15, 73).addBox(6.0F, 0.0F, 8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(11, 73).addBox(7.0F, -1.0F, 7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(22, 39).addBox(7.0F, 3.0F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

        PartDefinition bottom_right = partdefinition.addOrReplaceChild("bottom_right", CubeListBuilder.create().texOffs(46, 75).addBox(-9.0F, -2.0F, 4.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 75).addBox(-5.0F, -2.0F, 8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 55).addBox(-9.0F, -3.0F, 5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 68).addBox(-6.0F, -3.0F, 8.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(65, 60).addBox(-7.0F, -4.0F, 7.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 65).addBox(-8.0F, -4.0F, 6.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(72, 71).addBox(-9.0F, 0.0F, 6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(72, 66).addBox(-7.0F, 0.0F, 8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(31, 72).addBox(-8.0F, -1.0F, 7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 35).addBox(-9.0F, 3.0F, 7.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

        PartDefinition top_riight = partdefinition.addOrReplaceChild("top_riight", CubeListBuilder.create().texOffs(75, 24).addBox(-9.0F, -2.0F, -5.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(75, 19).addBox(-5.0F, -2.0F, -9.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 10).addBox(-6.0F, -3.0F, -9.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 66).addBox(-9.0F, -3.0F, -6.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 65).addBox(-8.0F, -4.0F, -7.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 48).addBox(-7.0F, -4.0F, -8.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(72, 10).addBox(-8.0F, -1.0F, -8.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(71, 23).addBox(-9.0F, 0.0F, -7.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(71, 18).addBox(-7.0F, 0.0F, -9.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 24).addBox(-9.0F, 3.0F, -9.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0357F, -3.0536F, -6.4821F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(43, 15).addBox(5.9643F, -5.0536F, -5.4821F, 1.0F, 2.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(54, 50).addBox(-6.0357F, -5.0536F, 6.5179F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 41).addBox(-7.0357F, -5.0536F, -6.4821F, 1.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(54, 47).addBox(-6.0357F, -5.0536F, -6.4821F, 13.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 65).addBox(-6.0357F, -4.0536F, -7.4821F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(61, 60).addBox(4.9643F, -4.0536F, -7.4821F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 39).addBox(-8.0357F, -5.0536F, -4.4821F, 1.0F, 16.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(39, 61).addBox(-8.0357F, -4.0536F, -5.4821F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(35, 61).addBox(-8.0357F, -4.0536F, 5.5179F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 29).addBox(6.9643F, -5.0536F, -4.4821F, 1.0F, 16.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(57, 60).addBox(6.9643F, -4.0536F, 5.5179F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(53, 60).addBox(6.9643F, -4.0536F, -5.4821F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 30).addBox(-5.0357F, -5.0536F, 7.5179F, 10.0F, 16.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(49, 60).addBox(4.9643F, -4.0536F, 7.5179F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(45, 60).addBox(-6.0357F, -4.0536F, 7.5179F, 1.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(11, 54).addBox(-6.0357F, -4.0536F, -4.4821F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(42, 12).addBox(-5.0357F, -4.0536F, 5.5179F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 0).addBox(4.9643F, -4.0536F, -5.4821F, 1.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(54, 53).addBox(-6.0357F, -4.0536F, -5.4821F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 9).addBox(-6.0357F, -5.0536F, 5.5179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 30).addBox(-6.0357F, -5.0536F, -5.4821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 28).addBox(4.9643F, -5.0536F, 5.5179F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 30).addBox(4.9643F, -5.0536F, -5.4821F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 28).addBox(-5.0357F, -4.0536F, -4.4821F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(24, 57).addBox(-5.0357F, 7.9464F, -7.4821F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(55, 0).addBox(-5.0357F, -5.0536F, -7.4821F, 10.0F, 9.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 57).addBox(-5.0357F, 5.9464F, -7.4821F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0357F, 9.0536F, -0.5179F));

        PartDefinition branch = partdefinition.addOrReplaceChild("branch", CubeListBuilder.create().texOffs(12, 39).addBox(-3.025F, 3.725F, -3.175F, 2.0F, 3.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(42, 30).addBox(-3.025F, 2.725F, -2.175F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-1.025F, 0.725F, -2.175F, 2.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 8).addBox(-1.025F, 1.725F, 1.825F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-1.025F, 1.725F, -3.175F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(69, 62).addBox(-0.025F, -0.275F, -3.175F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 33).addBox(-0.025F, -0.275F, 1.825F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 28).addBox(-1.025F, 4.725F, -2.175F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(30, 33).addBox(0.975F, -1.275F, -1.175F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 28).addBox(-0.025F, -3.275F, -2.175F, 1.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(12, 39).addBox(-1.025F, -1.275F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 0).addBox(-2.025F, 0.725F, -1.175F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 28).addBox(-0.025F, -5.275F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 28).addBox(-0.025F, -4.275F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(6, 30).addBox(-1.025F, -2.275F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 8).addBox(0.975F, -3.275F, -0.175F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 19).addBox(-1.025F, -6.275F, -1.175F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(58, 14).addBox(-2.025F, -7.275F, -3.175F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 8).addBox(-0.025F, -5.275F, 0.825F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(6, 28).addBox(0.975F, 1.725F, -1.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(11.025F, 2.275F, 0.175F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        top_left.render(poseStack, buffer, packedLight, packedOverlay);
        bottom_left.render(poseStack, buffer, packedLight, packedOverlay);
        bottom_right.render(poseStack, buffer, packedLight, packedOverlay);
        top_riight.render(poseStack, buffer, packedLight, packedOverlay);
        body.render(poseStack, buffer, packedLight, packedOverlay);
        branch.render(poseStack, buffer, packedLight, packedOverlay);
    }
}