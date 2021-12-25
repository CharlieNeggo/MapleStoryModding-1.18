package com.charlieNgo.maplestorymod.client.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class CopperDrakeModel<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("maplestorymod", "copper_drake"), "main");
    private final ModelPart left_leg;
    private final ModelPart right_leg;
    private final ModelPart right_arm;
    private final ModelPart left_arm;
    private final ModelPart tail;
    private final ModelPart head;
    private final ModelPart body;

    public CopperDrakeModel(ModelPart root) {
        this.left_leg = root.getChild("left_leg");
        this.right_leg = root.getChild("right_leg");
        this.right_arm = root.getChild("right_arm");
        this.left_arm = root.getChild("left_arm");
        this.tail = root.getChild("tail");
        this.head = root.getChild("head");
        this.body = root.getChild("body");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(20, 39).addBox(0.0F, -1.3333F, -2.1667F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(35, 47).addBox(0.0F, 4.6667F, -2.1667F, 2.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 48).addBox(0.0F, 10.6667F, -4.1667F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(25, 30).addBox(2.0F, 10.6667F, -5.1667F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(21, 20).addBox(1.0F, 10.6667F, -5.1667F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 20).addBox(0.0F, 10.6667F, -5.1667F, 0.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 12.3333F, 2.1667F));

        PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(46, 26).addBox(-2.0F, -1.3333F, -2.1667F, 2.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-2.0F, 4.6667F, -2.1667F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(50, 12).addBox(-2.0F, 10.6667F, -4.1667F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(47, 48).addBox(-2.0F, 10.6667F, -5.1667F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 48).addBox(-1.0F, 10.6667F, -5.1667F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(35, 47).addBox(0.0F, 10.6667F, -5.1667F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 12.3333F, 2.1667F));

        PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(51, 37).addBox(-2.0F, -0.8333F, -0.5833F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(13, 49).addBox(-2.0F, 1.1667F, -0.5833F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(14, 40).addBox(-2.0F, 4.1667F, -1.5833F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(26, 22).addBox(-2.0F, 5.1667F, -1.5833F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(5, 22).addBox(0.0F, 5.1667F, -1.5833F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(27, 0).addBox(-1.0F, 4.1667F, -2.5833F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 11.8333F, -7.4167F));

        PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(53, 0).addBox(0.0F, -0.8333F, -0.5833F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(22, 51).addBox(0.0F, 1.1667F, -0.5833F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(44, 0).addBox(0.0F, 4.1667F, -1.5833F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(42, 20).addBox(2.0F, 5.1667F, -1.5833F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 28).addBox(1.0F, 4.1667F, -2.5833F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(35, 39).addBox(0.0F, 5.1667F, -1.5833F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 11.8333F, -7.4167F));

        PartDefinition tail = partdefinition.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(35, 39).addBox(-3.0F, -1.3462F, -0.0385F, 6.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(25, 30).addBox(-2.0F, -0.3462F, 2.9615F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(43, 4).addBox(-1.0F, -1.3462F, 7.9615F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(46, 47).addBox(-1.0F, -2.3462F, 11.9615F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(29, 51).addBox(-1.0F, -2.3462F, 0.9615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(9, 48).addBox(-1.0F, -2.3462F, 1.9615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(43, 47).addBox(-1.0F, -1.3462F, 3.9615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(44, 37).addBox(-1.0F, -1.3462F, 4.9615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 43).addBox(-1.0F, -2.3462F, 8.9615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(30, 42).addBox(-1.0F, -2.3462F, 10.9615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(42, 26).addBox(-1.0F, -1.3462F, 5.9615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(39, 33).addBox(-1.0F, -1.3462F, 6.9615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(21, 30).addBox(-1.0F, -3.3462F, 13.9615F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.3462F, 6.0385F));

        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 28).addBox(-4.0F, -4.0F, -3.875F, 8.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(33, 13).addBox(-3.0F, -1.0F, -7.875F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(42, 20).addBox(-3.0F, 1.0F, -7.875F, 6.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 17).addBox(-1.0F, -2.0F, -6.875F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(21, 17).addBox(-2.0F, -2.0F, -5.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(30, 39).addBox(2.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(37, 9).addBox(-3.0F, -5.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.0F, -12.125F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -0.875F, -1.7083F, 8.0F, 6.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 17).addBox(-3.0F, -2.875F, -0.7083F, 6.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(27, 0).addBox(-3.0F, 0.125F, -5.7083F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-2.0F, 1.125F, -10.7083F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(21, 20).addBox(-3.0F, 5.125F, -0.7083F, 6.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(0, 54).addBox(-1.0F, -0.875F, -4.7083F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(53, 7).addBox(-1.0F, -0.875F, -3.7083F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(53, 5).addBox(-1.0F, -0.875F, -2.7083F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(24, 20).addBox(-1.0F, -3.875F, 0.2917F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(-1.0F, -4.875F, 2.2917F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(39, 30).addBox(-1.0F, -4.875F, 4.2917F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(3, 20).addBox(-1.0F, -3.875F, 6.2917F, 2.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.875F, -2.2917F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        left_leg.render(poseStack, buffer, packedLight, packedOverlay);
        right_leg.render(poseStack, buffer, packedLight, packedOverlay);
        right_arm.render(poseStack, buffer, packedLight, packedOverlay);
        left_arm.render(poseStack, buffer, packedLight, packedOverlay);
        tail.render(poseStack, buffer, packedLight, packedOverlay);
        head.render(poseStack, buffer, packedLight, packedOverlay);
        body.render(poseStack, buffer, packedLight, packedOverlay);
    }
}
