package com.charlieNgo.maplestorymod.entities.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.model.CopperDrakeModel;
import com.charlieNgo.maplestorymod.entities.mobs.CopperDrake;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class CopperDrakeRender<Type extends CopperDrake> extends MobRenderer<Type, CopperDrakeModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MODID, "textures/entity/copper_drake.png");

    public CopperDrakeRender(EntityRendererProvider.Context context) {
        super(context, new CopperDrakeModel<>(context.bakeLayer(CopperDrakeModel.LAYER_LOCATION)), 0.2f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}