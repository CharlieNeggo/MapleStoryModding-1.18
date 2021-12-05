package com.charlieNgo.maplestorymod.client.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.BlueSnailModel;
import com.charlieNgo.maplestorymod.entities.BlueSnail;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BlueSnailRender extends MobRenderer<BlueSnail, BlueSnailModel<BlueSnail>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MOD_ID, "textures/entity/blue_snail.png");

    public BlueSnailRender(EntityRendererProvider.Context p_174304_, BlueSnailModel<BlueSnail> p_174305_, float p_174306_) {
        super(p_174304_, p_174305_, p_174306_);
    }

    @Override
    public ResourceLocation getTextureLocation(BlueSnail entity) {
        return TEXTURE;
    }
}
