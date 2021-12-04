package com.charlieNgo.maplestorymod.client.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.BlueSnailModel;
import com.charlieNgo.maplestorymod.entities.BlueSnail;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class BlueSnailRender extends MobRenderer<BlueSnail, BlueSnailModel<BlueSnail>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MOD_ID, "textures/entity/blue_snail.png");

    public BlueSnailRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new BlueSnailModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(BlueSnail entity) {
        return TEXTURE;
    }
}
