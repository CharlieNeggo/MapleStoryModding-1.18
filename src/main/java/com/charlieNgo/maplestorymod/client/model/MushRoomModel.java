package com.charlieNgo.maplestorymod.client.model;

import com.charlieNgo.maplestorymod.entities.MushRoom;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class MushRoomModel<T extends MushRoom> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "mushroom"), "main");
    private final ModelPart bb_main;

    public MushRoomModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(51, 21).addBox(-6.0F, -2.0F, -5.0F, 11.0F, 1.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(83, 75).addBox(-6.0F, -11.0F, 6.0F, 11.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(68, 77).addBox(-8.0F, -11.0F, -5.0F, 2.0F, 8.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(38, 69).addBox(-6.0F, -11.0F, -7.0F, 11.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 42).addBox(-7.0F, -11.0F, -6.0F, 13.0F, 9.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(53, 69).addBox(5.0F, -11.0F, -5.0F, 2.0F, 8.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(19, 68).addBox(7.0F, -15.0F, -7.0F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
                .texOffs(78, 54).addBox(-8.0F, -15.0F, 8.0F, 15.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 64).addBox(-10.0F, -15.0F, -7.0F, 2.0F, 4.0F, 15.0F, new CubeDeformation(0.0F))
                .texOffs(68, 69).addBox(-8.0F, -15.0F, -9.0F, 15.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 21).addBox(-9.0F, -15.0F, -8.0F, 17.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-9.0F, -16.0F, -8.0F, 17.0F, 4.0F, 17.0F, new CubeDeformation(0.0F))
                .texOffs(39, 51).addBox(-7.0F, -18.0F, -6.0F, 13.0F, 5.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(78, 38).addBox(-8.0F, -18.0F, -5.0F, 2.0F, 5.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(84, 16).addBox(-6.0F, -18.0F, -7.0F, 11.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(57, 33).addBox(5.0F, -18.0F, -5.0F, 2.0F, 5.0F, 11.0F, new CubeDeformation(0.0F))
                .texOffs(84, 0).addBox(-6.0F, -18.0F, 6.0F, 11.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(51, 0).addBox(-6.0F, -19.0F, -5.0F, 11.0F, 5.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bb_main.render(poseStack, buffer, packedLight, packedOverlay);
    }
}
