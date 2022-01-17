package com.charlieNgo.maplestorymod.entities.model;// Made with Blockbench 4.0.5

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class WoodenMaskModel<T extends Entity> extends EntityModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
    private final ModelPart right_leg;
    private final ModelPart left_leg;
    private final ModelPart mask;
    private final ModelPart left_arm;
    private final ModelPart right_arm;
    private final ModelPart body;

    public WoodenMaskModel(
            ModelPart root) {
        this.right_leg = root.getChild("right_leg");
        this.left_leg = root.getChild("left_leg");
        this.mask = root.getChild("mask");
        this.left_arm = root.getChild("left_arm");
        this.right_arm = root.getChild("right_arm");
        this.body = root.getChild("body");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(46, 12).addBox(-4.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(45, 31).addBox(1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition mask = partdefinition.addOrReplaceChild("mask", CubeListBuilder.create().texOffs(0, 27).addBox(-6.0F, -17.0F, -4.0F, 12.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(37, 65).addBox(-3.0F, -19.0F, -4.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(23, 61).addBox(-6.0F, -19.0F, -4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(29, 29).addBox(-1.0F, -19.0F, -4.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(68, 0).addBox(-4.0F, -18.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(23, 37).addBox(3.0F, -20.0F, -3.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(29, 0).addBox(-6.0F, -20.0F, -2.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(29, 5).addBox(-6.0F, -18.0F, -6.0F, 1.0F, 0.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 22).addBox(-2.0F, -10.0F, -4.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(11, 53).addBox(5.0F, -10.0F, -4.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(20, 51).addBox(-6.0F, -10.0F, -4.0F, 1.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(31, 15).addBox(-6.0F, -3.0F, -4.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 11).addBox(-5.0F, -4.0F, -4.0F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(50, 36).addBox(-2.0F, -3.0F, -4.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 68).addBox(3.0F, -3.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(68, 18).addBox(5.0F, -3.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(64, 27).addBox(2.0F, -7.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(53, 40).addBox(-3.0F, -7.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(34, 5).addBox(-6.0F, -20.0F, -3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(55, 27).addBox(-5.0F, -7.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(49, 55).addBox(3.0F, -7.0F, -4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(31, 19).addBox(3.0F, -20.0F, -3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(5, 0).addBox(-6.0F, -19.0F, -6.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(53, 4).addBox(5.0F, -7.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(54, 44).addBox(6.0F, -7.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(68, 50).addBox(5.0F, -7.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 53).addBox(-7.0F, -7.0F, -2.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(55, 17).addBox(-7.0F, -7.0F, -5.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(68, 46).addBox(-6.0F, -7.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(37, 7).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(61, 15).addBox(-5.0F, -10.0F, -3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 42).addBox(2.0F, -10.0F, -3.0F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 65).addBox(5.0F, -12.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(5, 65).addBox(-6.0F, -12.0F, 2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(28, 50).addBox(5.0F, -12.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(47, 49).addBox(-6.0F, -12.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-5.0F, -13.0F, -2.0F, 10.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(57, 23).addBox(-2.0F, -15.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(-6.0F, -10.0F, 4.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(69, 39).addBox(-6.0F, -10.0F, 3.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(69, 22).addBox(5.0F, -10.0F, 4.0F, 1.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(20, 37).addBox(5.0F, -10.0F, 3.0F, 1.0F, 3.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(35, 50).addBox(-4.0F, -15.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 21).addBox(-1.0F, -14.0F, -1.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(19, 44).addBox(-3.0F, -14.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(43, 0).addBox(-5.0F, -14.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 11).addBox(-5.0F, -11.0F, -2.0F, 10.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(64, 7).addBox(1.0F, -16.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(63, 61).addBox(-4.0F, -16.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(-2.0F, -17.0F, 1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(33, 41).addBox(-4.0F, -17.0F, 1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(63, 55).addBox(-4.0F, -15.0F, 5.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(61, 0).addBox(-2.0F, -15.0F, 6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(60, 37).addBox(-5.0F, -15.0F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(40, 47).addBox(-4.0F, -12.0F, 3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(27, 44).addBox(-2.0F, -11.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 55).addBox(-2.0F, -14.0F, 8.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(68, 4).addBox(-2.0F, -16.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 61).addBox(-4.0F, -14.0F, 7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(33, 56).addBox(-4.0F, -16.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(63, 47).addBox(-4.0F, -11.0F, 6.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(33, 60).addBox(-4.0F, -11.0F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(65, 67).addBox(-4.0F, -10.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(54, 50).addBox(-4.0F, -9.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(5, 60).addBox(-5.0F, -11.0F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(60, 67).addBox(-5.0F, -12.0F, 6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 34).addBox(1.0F, -17.0F, 1.0F, 1.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(38, 22).addBox(1.0F, -15.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(62, 31).addBox(-2.0F, -16.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(1.0F, -15.0F, 6.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(27, 51).addBox(1.0F, -16.0F, 6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(39, 53).addBox(1.0F, -14.0F, 8.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 37).addBox(1.0F, -11.0F, 7.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 15).addBox(2.0F, -14.0F, -1.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(0, 11).addBox(3.0F, -15.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(62, 21).addBox(3.0F, -16.0F, -1.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(13, 37).addBox(3.0F, -17.0F, 1.0F, 1.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(49, 61).addBox(3.0F, -15.0F, 5.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(51, 17).addBox(3.0F, -16.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 59).addBox(3.0F, -14.0F, 7.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 57).addBox(3.0F, -12.0F, 6.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(56, 52).addBox(3.0F, -11.0F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(67, 35).addBox(3.0F, -10.0F, 4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(18, 46).addBox(3.0F, -9.0F, 5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 34).addBox(4.0F, -14.0F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(27, 56).addBox(4.0F, -15.0F, 1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(56, 10).addBox(4.0F, -11.0F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(49, 67).addBox(4.0F, -12.0F, 6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 41).addBox(-1.0F, -15.0F, 0.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(46, 17).addBox(5.0F, -11.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(45, 36).addBox(-6.0F, -11.0F, 4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 34).addBox(-1.0F, -12.0F, 6.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(55, 66).addBox(2.0F, -12.0F, 6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(23, 66).addBox(-3.0F, -12.0F, 6.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(29, 0).addBox(-3.0F, -11.0F, 3.0F, 6.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(51, 0).addBox(-3.0F, -10.0F, 4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 37).addBox(1.0F, -10.0F, 4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(7, 47).addBox(-1.0F, -10.0F, 7.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(44, 65).addBox(-2.0F, -12.0F, 9.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(13, 64).addBox(1.0F, -12.0F, 9.0F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(40, 41).addBox(-1.0F, -11.0F, 8.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(11, 47).addBox(-3.0F, -15.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 47).addBox(2.0F, -15.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        right_leg.render(poseStack, buffer, packedLight, packedOverlay);
        left_leg.render(poseStack, buffer, packedLight, packedOverlay);
        mask.render(poseStack, buffer, packedLight, packedOverlay);
        left_arm.render(poseStack, buffer, packedLight, packedOverlay);
        right_arm.render(poseStack, buffer, packedLight, packedOverlay);
        body.render(poseStack, buffer, packedLight, packedOverlay);
    }
}