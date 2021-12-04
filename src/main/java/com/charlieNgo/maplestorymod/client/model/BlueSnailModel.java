package com.charlieNgo.maplestorymod.client.model;

import com.charlieNgo.maplestorymod.entities.BlueSnail;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class BlueSnailModel <T extends BlueSnail> extends EntityModel<T> {

    private final ModelRenderer body;
    private final ModelRenderer lowerbody;

    public BlueSnailModel() {
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 13).addBox(-3.0F, -8.0F, -2.0F, 5.0F, 7.0F, 8.0F, 0.0F, false);
        body.setTextureOffset(18, 18).addBox(-3.0F, -6.0F, -3.0F, 5.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(7, 4).addBox(1.0F, -5.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(7, 0).addBox(-3.0F, -5.0F, -3.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(24, 7).addBox(2.0F, -7.0F, -1.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(20, 22).addBox(-4.0F, -7.0F, -1.0F, 1.0F, 5.0F, 6.0F, 0.0F, false);
        body.setTextureOffset(0, 13).addBox(-2.0F, -7.0F, 6.0F, 3.0F, 5.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(18, 0).addBox(-2.0F, -9.0F, -1.0F, 3.0F, 1.0F, 6.0F, 0.0F, false);

        lowerbody = new ModelRenderer(this);
        lowerbody.setRotationPoint(0.0F, 24.0F, 0.0F);
        lowerbody.setTextureOffset(0, 0).addBox(-2.0F, -1.0F, -5.0F, 3.0F, 1.0F, 12.0F, 0.0F, false);
        lowerbody.setTextureOffset(28, 18).addBox(-2.0F, -2.0F, -6.0F, 3.0F, 1.0F, 4.0F, 0.0F, false);
        lowerbody.setTextureOffset(0, 28).addBox(-2.0F, -5.0F, -6.0F, 3.0F, 3.0F, 4.0F, 0.0F, false);
        lowerbody.setTextureOffset(18, 0).addBox(0.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        lowerbody.setTextureOffset(7, 8).addBox(-2.0F, -6.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        lowerbody.setTextureOffset(18, 7).addBox(0.0F, -7.0F, -7.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
        lowerbody.setTextureOffset(0, 8).addBox(-3.0F, -7.0F, -7.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
        lowerbody.setTextureOffset(0, 4).addBox(0.0F, -8.0F, -7.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
        lowerbody.setTextureOffset(0, 0).addBox(-3.0F, -8.0F, -7.0F, 2.0F, 1.0F, 3.0F, 0.0F, false);
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
        lowerbody.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
