package com.charlieNgo.maplestorymod.client.model;

import com.charlieNgo.maplestorymod.entities.GreenSlime;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class GreenSlimeModel<T extends GreenSlime> extends EntityModel<T> {

    private final ModelRenderer body;
    private final ModelRenderer string;

    public GreenSlimeModel() {
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(23, 22).addBox(-2.0F, -2.0F, -3.0F, 5.0F, -1.0F, 5.0F, 1.0F, false);
        body.setTextureOffset(0, 0).addBox(-4.0F, -6.0F, -5.0F, 9.0F, 3.0F, 9.0F, 0.0F, false);
        body.setTextureOffset(9, 30).addBox(-3.0F, -3.0F, 2.0F, 7.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(23, 12).addBox(3.0F, -3.0F, -4.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(28, 26).addBox(-3.0F, -3.0F, -5.0F, 7.0F, 1.0F, 2.0F, 0.0F, false);
        body.setTextureOffset(17, 22).addBox(-4.0F, -3.0F, -4.0F, 2.0F, 1.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(0, 12).addBox(-3.0F, -7.0F, -5.0F, 7.0F, 1.0F, 9.0F, 0.0F, false);
        body.setTextureOffset(0, 28).addBox(4.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(27, 0).addBox(-4.0F, -7.0F, -4.0F, 1.0F, 1.0F, 7.0F, 0.0F, false);
        body.setTextureOffset(0, 22).addBox(-3.0F, -8.0F, -3.0F, 7.0F, 1.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(9, 33).addBox(-2.0F, -8.0F, 2.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(32, 20).addBox(-2.0F, -8.0F, -4.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(24, 30).addBox(-2.0F, -9.0F, -2.0F, 5.0F, 1.0F, 3.0F, 0.0F, false);
        body.setTextureOffset(0, 6).addBox(-1.0F, -9.0F, 1.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(0, 4).addBox(-1.0F, -9.0F, -3.0F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(0.0F, -5.0F, 5.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        string = new ModelRenderer(this);
        string.setRotationPoint(0.0F, 21.0F, 0.0F);
        string.setTextureOffset(23, 12).addBox(0.0F, -7.0F, -1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        string.setTextureOffset(0, 18).addBox(-2.0F, -8.0F, 0.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        string.setTextureOffset(0, 16).addBox(-4.0F, -8.0F, 1.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        string.setTextureOffset(19, 22).addBox(-5.0F, -7.0F, 2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        string.setTextureOffset(0, 22).addBox(-6.0F, -5.0F, 3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        string.setTextureOffset(5, 15).addBox(-6.0F, -3.0F, 4.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        string.setTextureOffset(5, 13).addBox(-5.0F, -2.0F, 5.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        string.setTextureOffset(0, 14).addBox(-4.0F, -1.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        string.setTextureOffset(0, 12).addBox(-2.0F, 0.0F, 6.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
    }

    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        string.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
