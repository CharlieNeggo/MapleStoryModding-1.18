package com.charlieNgo.maplestorymod.client.model;

import com.charlieNgo.maplestorymod.entities.MushRoom;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;

public class MushRoomModel<T extends MushRoom> extends EntityModel<T> {
    private final ModelRenderer head;
    private final ModelRenderer body;

    public MushRoomModel() {
        textureWidth = 128;
        textureHeight = 128;

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 24.0F, 0.0F);
        head.setTextureOffset( 78, 54).addBox( -8.0F, -15.0F, 8.0F, 15, 4, 2, 0.0F, false);
        head.setTextureOffset( 51, 0).addBox( -6.0F, -19.0F, -5.0F, 11, 5, 11, 0.0F, false);
        head.setTextureOffset( 84, 0).addBox(-6.0F, -18.0F, 6.0F, 11, 5, 2, 0.0F, false);
        head.setTextureOffset( 57, 33).addBox(5.0F, -18.0F, -5.0F, 2, 5, 11, 0.0F, false);
        head.setTextureOffset( 78, 38).addBox( -8.0F, -18.0F, -5.0F, 2, 5, 11, 0.0F, false);
        head.setTextureOffset( 39, 51).addBox( -7.0F, -18.0F, -6.0F, 13, 5, 13, 0.0F, false);
        head.setTextureOffset( 0, 0).addBox( -9.0F, -16.0F, -8.0F, 17, 4, 17, 0.0F, false);
        head.setTextureOffset( 0, 21).addBox( -9.0F, -15.0F, -8.0F, 17, 4, 17, 0.0F, false);
        head.setTextureOffset( 68, 69).addBox( -8.0F, -15.0F, -9.0F, 15, 4, 2, 0.0F, false);
        head.setTextureOffset( 0, 64).addBox( -10.0F, -15.0F, -7.0F, 2, 4, 15, 0.0F, false);
        head.setTextureOffset(19, 68).addBox( 7.0F, -15.0F, -7.0F, 2, 4, 15, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        head.setTextureOffset( 51, 21).addBox( -6.0F, -2.0F, -5.0F, 11, 1, 11, 0.0F, false);
        head.setTextureOffset( 83, 75).addBox( -6.0F, -11.0F, 6.0F, 11, 8, 2, 0.0F, false);
        head.setTextureOffset( 68, 77).addBox( -8.0F, -11.0F, -5.0F, 2, 8, 11, 0.0F, false);
        head.setTextureOffset( 38, 69).addBox( -6.0F, -11.0F, -7.0F, 11, 8, 2, 0.0F, false);
        head.setTextureOffset(0, 42).addBox( -7.0F, -11.0F, -6.0F, 13, 9, 13, 0.0F, false);
        head.setTextureOffset(53, 69).addBox( 5.0F, -11.0F, -5.0F, 2, 8, 11, 0.0F, false);
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
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}
