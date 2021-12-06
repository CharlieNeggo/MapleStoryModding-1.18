package com.charlieNgo.maplestorymod.client.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.GreenSlimeModel;
import com.charlieNgo.maplestorymod.entities.GreenSlime;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GreenSlimeRender extends MobRenderer<GreenSlime, GreenSlimeModel<GreenSlime>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MOD_ID, "textures/entity/green_slime.png");

    public GreenSlimeRender(EntityRendererProvider.Context p_174304_, GreenSlimeModel<GreenSlime> p_174305_, float p_174306_) {
        super(p_174304_, p_174305_, p_174306_);
    }

    @Override
    public ResourceLocation getTextureLocation(GreenSlime entity) {
        return TEXTURE;
    }
}
