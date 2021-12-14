package com.charlieNgo.maplestorymod.client.model;

import com.charlieNgo.maplestorymod.entities.MuddySwampMonster;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class MuddySwampMonsterModel<Type extends MuddySwampMonster> extends EntityModel<Type> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "muddy_swamp_monster"), "main");
    private final ModelPart leftarm;
    private final ModelPart rightarm;
    private final ModelPart leftleg;
    private final ModelPart rightleg;
    private final ModelPart body;

    public MuddySwampMonsterModel(ModelPart root) {
        this.leftarm = root.getChild("leftarm");
        this.rightarm = root.getChild("rightarm");
        this.leftleg = root.getChild("leftleg");
        this.rightleg = root.getChild("rightleg");
        this.body = root.getChild("body");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(0, 0).addBox(7.0F, -13.0F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -13.0F, -1.0F, 5.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create().texOffs(0, 0).addBox(4.0F, -1.0F, 1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, -2.0F));

        PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -1.0F, 1.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, -2.0F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 17).addBox(-7.0F, -16.0F, -5.0F, 14.0F, 15.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-8.0F, -17.0F, -8.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(0, 23).addBox(7.0F, -16.0F, -8.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(26, 44).addBox(7.0F, -16.0F, -2.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 17).addBox(-8.0F, -16.0F, 3.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(42, 34).addBox(-8.0F, -16.0F, -8.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(40, 24).addBox(-2.0F, -16.0F, -8.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 39).addBox(-7.0F, -16.0F, -8.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(40, 22).addBox(-7.0F, -16.0F, 7.0F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(53, 12).addBox(3.0F, -16.0F, 7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 17).addBox(7.0F, -15.0F, 8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(54, 45).addBox(3.0F, -15.0F, 7.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 44).addBox(3.0F, -14.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 44).addBox(1.0F, -15.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 51).addBox(-4.0F, -15.0F, 7.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 53).addBox(-7.0F, -15.0F, 7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 25).addBox(-1.0F, -14.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 25).addBox(-3.0F, -14.0F, 7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(3, 16).addBox(8.0F, -15.0F, -8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 50).addBox(7.0F, -15.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(7, 23).addBox(7.0F, -14.0F, -4.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 23).addBox(7.0F, -15.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 45).addBox(7.0F, -15.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(54, 50).addBox(7.0F, -15.0F, 5.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(7, 19).addBox(7.0F, -14.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 19).addBox(7.0F, -14.0F, 2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-8.0F, -15.0F, -8.0F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F))
                .texOffs(54, 41).addBox(-6.0F, -15.0F, -8.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 17).addBox(-4.0F, -14.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 17).addBox(-2.0F, -15.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 49).addBox(0.0F, -15.0F, -8.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 14).addBox(0.0F, -14.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 12).addBox(2.0F, -14.0F, -8.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(10, 0).addBox(5.0F, -15.0F, -8.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-8.0F, -15.0F, 7.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 12).addBox(-8.0F, -15.0F, 3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(26, 44).addBox(-8.0F, -15.0F, -4.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(12, 10).addBox(-8.0F, -14.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 8).addBox(-8.0F, -15.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 6).addBox(-8.0F, -14.0F, 3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 4).addBox(-8.0F, -14.0F, -3.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 47).addBox(-8.0F, -15.0F, -7.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(40, 17).addBox(-7.0F, -2.0F, -7.0F, 14.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(6, 0).addBox(-7.0F, -16.0F, -7.0F, 1.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(6.0F, -16.0F, -7.0F, 1.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(40, 26).addBox(-4.0F, -5.0F, -7.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 0).addBox(-4.0F, -16.0F, -7.0F, 8.0F, 11.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(54, 28).addBox(-6.0F, -16.0F, -7.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 45).addBox(4.0F, -16.0F, -7.0F, 2.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(40, 20).addBox(-6.0F, -3.0F, -7.0F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 2).addBox(-4.0F, -4.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 0).addBox(3.0F, -4.0F, -7.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 44).addBox(-6.0F, -16.0F, -6.0F, 12.0F, 14.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(Type Entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        leftarm.render(poseStack, buffer, packedLight, packedOverlay);
        rightarm.render(poseStack, buffer, packedLight, packedOverlay);
        leftleg.render(poseStack, buffer, packedLight, packedOverlay);
        rightleg.render(poseStack, buffer, packedLight, packedOverlay);
        body.render(poseStack, buffer, packedLight, packedOverlay);
    }
}