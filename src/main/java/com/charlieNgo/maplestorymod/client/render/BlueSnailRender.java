package com.charlieNgo.maplestorymod.client.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.BlueSnailModel;
import com.charlieNgo.maplestorymod.entities.BlueSnail;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BlueSnailRender<Type extends BlueSnail> extends MobRenderer<Type, BlueSnailModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MODID, "textures/entity/blue_snail.png");

    public BlueSnailRender(EntityRendererProvider.Context context) {
        super(context, new BlueSnailModel<>(context.bakeLayer(BlueSnailModel.LAYER_LOCATION)), 0.2f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
