package com.charlieNgo.maplestorymod.entities.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.model.OctopusModel;
import com.charlieNgo.maplestorymod.entities.mobs.Octopus;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class OctopusRender<Type extends Octopus> extends MobRenderer<Type, OctopusModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MODID, "textures/entity/octopus.png");

    public OctopusRender(EntityRendererProvider.Context context) {
        super(context, new OctopusModel<>(context.bakeLayer(OctopusModel.LAYER_LOCATION)), 0.6f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
