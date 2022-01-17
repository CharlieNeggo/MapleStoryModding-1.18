package com.charlieNgo.maplestorymod.entities.model;

import com.charlieNgo.maplestorymod.entities.mobs.BlueSnail;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class BlueSnailModel <T extends BlueSnail> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "blue_snail"), "main");
    private final ModelPart body;
    private final ModelPart shell;

    public BlueSnailModel(ModelPart root) {
        this.body = root.getChild("body");
        this.shell = root.getChild("shell");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 13).addBox(-10.0F, -8.0F, 5.0F, 5.0F, 7.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(18, 18).addBox(-10.0F, -6.0F, 4.0F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 4).addBox(-6.0F, -5.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 0).addBox(-10.0F, -5.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 7).addBox(-5.0F, -7.0F, 6.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(20, 22).addBox(-11.0F, -7.0F, 6.0F, 1.0F, 5.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 13).addBox(-9.0F, -7.0F, 13.0F, 3.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 0).addBox(-9.0F, -9.0F, 6.0F, 3.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 24.0F, -7.0F));

        PartDefinition shell = partdefinition.addOrReplaceChild("shell", CubeListBuilder.create().texOffs(0, 28).addBox(-9.0F, -5.0F, 1.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-9.0F, -1.0F, 2.0F, 3.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(28, 18).addBox(-9.0F, -2.0F, 1.0F, 3.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(18, 0).addBox(-7.0F, -6.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(7, 8).addBox(-9.0F, -6.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(18, 7).addBox(-7.0F, -7.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 8).addBox(-10.0F, -7.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 4).addBox(-7.0F, -8.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-10.0F, -8.0F, 0.0F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 24.0F, -7.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        body.render(poseStack, buffer, packedLight, packedOverlay);
        shell.render(poseStack, buffer, packedLight, packedOverlay);
    }
}