package com.charlieNgo.maplestorymod.entities.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.model.GreenSlimeModel;
import com.charlieNgo.maplestorymod.entities.mobs.GreenSlime;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class GreenSlimeRender<Type extends GreenSlime> extends MobRenderer<Type, GreenSlimeModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MODID, "textures/entity/green_slime.png");

    public GreenSlimeRender(EntityRendererProvider.Context context) {
        super(context, new GreenSlimeModel<>(context.bakeLayer(GreenSlimeModel.LAYER_LOCATION)), 0.3f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
