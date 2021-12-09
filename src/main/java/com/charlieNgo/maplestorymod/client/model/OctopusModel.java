package com.charlieNgo.maplestorymod.client.model;

import com.charlieNgo.maplestorymod.entities.Octopus;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

import javax.swing.text.html.parser.Entity;

public class OctopusModel<Type extends Octopus> extends EntityModel<Type> {
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "octopus"), "main");
    private final ModelPart leg;
    private final ModelPart body;

    public OctopusModel(ModelPart root) {
        this.leg = root.getChild("leg");
        this.body = root.getChild("body");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition leg = partdefinition.addOrReplaceChild("leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
        PartDefinition cube_r1 = leg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(80, 29).addBox(-1.0F, -21.0F, -5.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(42, 7).addBox(-1.0F, -18.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 44).addBox(0.0F, -18.0F, -6.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 43).addBox(0.0F, -14.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 48).addBox(0.0F, -14.0F, -5.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 28).addBox(-1.0F, -18.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(38, 32).addBox(2.0F, -16.0F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 82).addBox(1.0F, -13.0F, -1.0F, 1.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(46, 31).addBox(2.0F, -13.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(80, 34).addBox(1.0F, -16.0F, -2.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(46, 35).addBox(3.0F, -16.0F, -2.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(42, 0).addBox(2.0F, -21.0F, -3.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 28).addBox(3.0F, -17.0F, 3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(8, 31).addBox(-6.0F, -17.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(38, 37).addBox(-3.0F, -18.0F, 5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-4.0F, -13.0F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 53).addBox(-4.0F, -13.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 66).addBox(-5.0F, -17.0F, 1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(54, 53).addBox(-5.0F, -17.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 44).addBox(-6.0F, -21.0F, -4.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(54, 53).addBox(-5.0F, -17.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(60, 66).addBox(-5.0F, -17.0F, -3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(50, 53).addBox(-4.0F, -13.0F, -3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-4.0F, -13.0F, -2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 31).addBox(-6.0F, -17.0F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 44).addBox(-6.0F, -21.0F, 0.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(42, 76).addBox(-1.0F, -14.0F, 3.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(26, 67).addBox(-2.0F, -14.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 70).addBox(-2.0F, -18.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 50).addBox(-3.0F, -18.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(80, 57).addBox(-3.0F, -21.0F, 4.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(60, 72).addBox(1.0F, -13.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition cube_r2 = leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 0).addBox(1.0F, -4.0F, 2.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(64, 72).addBox(2.0F, -8.0F, 4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(74, 0).addBox(1.0F, -8.0F, 2.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(28, 76).addBox(2.0F, -12.0F, 3.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -7.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(76, 29).addBox(-3.0F, -36.0F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(12, 83).addBox(-2.0F, -37.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition cube_r3 = body.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(74, 0).addBox(-7.0F, -22.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 11).addBox(-1.0F, -13.0F, 9.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 70).addBox(-2.0F, -14.0F, 9.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(38, 28).addBox(11.0F, -13.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(46, 44).addBox(11.0F, -14.0F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(0, 40).addBox(0.0F, -19.0F, 10.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 36).addBox(-1.0F, -19.0F, 9.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 38).addBox(-1.0F, -18.0F, 10.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 65).addBox(-2.0F, -18.0F, 9.0F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(28, 73).addBox(-2.0F, -17.0F, 9.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(0, 43).addBox(12.0F, -19.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(62, 88).addBox(11.0F, -19.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(28, 89).addBox(12.0F, -18.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(86, 0).addBox(11.0F, -17.0F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(84, 86).addBox(11.0F, -18.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(0, 28).addBox(11.0F, -16.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 8).addBox(-1.0F, -16.0F, 9.0F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(36, 44).addBox(-4.0F, -22.0F, 8.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -12.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 35).addBox(-8.0F, -14.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(80, 57).addBox(-9.0F, -15.0F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(42, 7).addBox(-9.0F, -20.0F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(84, 20).addBox(-8.0F, -20.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(48, 88).addBox(-9.0F, -19.0F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(14, 56).addBox(-8.0F, -19.0F, -4.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(84, 11).addBox(-9.0F, -18.0F, -4.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-8.0F, -17.0F, -3.0F, 1.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(0, 82).addBox(7.0F, -9.0F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(42, 0).addBox(-3.0F, -9.0F, -6.0F, 10.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 43).addBox(-3.0F, -26.0F, -6.0F, 10.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(32, 43).addBox(7.0F, -22.0F, 8.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(80, 44).addBox(-3.0F, -23.0F, 8.0F, 10.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(40, 44).addBox(-7.0F, -22.0F, -6.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(50, 0).addBox(-7.0F, -22.0F, 5.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(58, 44).addBox(-7.0F, -23.0F, -5.0F, 1.0F, 12.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(0, 56).addBox(10.0F, -22.0F, 5.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(4, 56).addBox(10.0F, -22.0F, -6.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(48, 66).addBox(10.0F, -23.0F, -5.0F, 1.0F, 12.0F, 10.0F, new CubeDeformation(0.0F))
                .texOffs(8, 56).addBox(7.0F, -22.0F, -9.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(76, 29).addBox(-4.0F, -22.0F, -9.0F, 1.0F, 10.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 81).addBox(-3.0F, -23.0F, -9.0F, 10.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(14, 70).addBox(8.0F, -10.0F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(70, 16).addBox(-5.0F, -10.0F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 28).addBox(-4.0F, -10.0F, -7.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(28, 76).addBox(8.0F, -25.0F, -6.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(38, 29).addBox(-4.0F, -25.0F, -7.0F, 12.0F, 1.0F, 14.0F, new CubeDeformation(0.0F))
                .texOffs(42, 89).addBox(-6.0F, -23.0F, 6.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 93).addBox(-6.0F, -23.0F, -7.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(32, 44).addBox(-6.0F, -24.0F, -6.0F, 1.0F, 14.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(4, 93).addBox(9.0F, -23.0F, 7.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(8, 93).addBox(-5.0F, -23.0F, 7.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(56, 13).addBox(-3.0F, -24.0F, 7.0F, 12.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(12, 94).addBox(9.0F, -23.0F, -7.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(16, 94).addBox(10.0F, -23.0F, 6.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 56).addBox(9.0F, -24.0F, -6.0F, 1.0F, 14.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(20, 94).addBox(8.0F, -23.0F, -8.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(24, 94).addBox(-5.0F, -23.0F, -8.0F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(70, 66).addBox(-4.0F, -24.0F, -8.0F, 12.0F, 14.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-5.0F, -24.0F, -7.0F, 14.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -11.0F, 0.0F, -3.1416F, 0.0F, 3.1416F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(Type entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        leg.render(poseStack, buffer, packedLight, packedOverlay);
        body.render(poseStack, buffer, packedLight, packedOverlay);
    }
}
