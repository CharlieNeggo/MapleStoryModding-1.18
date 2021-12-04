package com.charlieNgo.maplestorymod.client.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.GreenSlimeModel;
import com.charlieNgo.maplestorymod.entities.GreenSlime;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class GreenSlimeRender extends MobRenderer<GreenSlime, GreenSlimeModel<GreenSlime>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MOD_ID, "textures/entity/green_slime.png");

    public GreenSlimeRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GreenSlimeModel<>(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(GreenSlime entity) {
        return TEXTURE;
    }
}
