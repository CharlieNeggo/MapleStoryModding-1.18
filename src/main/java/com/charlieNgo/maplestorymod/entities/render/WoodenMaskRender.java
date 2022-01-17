package com.charlieNgo.maplestorymod.entities.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.model.WoodenMaskModel;
import com.charlieNgo.maplestorymod.entities.mobs.WoodenMask;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WoodenMaskRender<Type extends WoodenMask> extends MobRenderer<Type, WoodenMaskModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MODID, "textures/entity/wooden_mask.png");

    public WoodenMaskRender(EntityRendererProvider.Context context) {
        super(context, new WoodenMaskModel<>(context.bakeLayer(WoodenMaskModel.LAYER_LOCATION)), 0.3f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
