package com.charlieNgo.maplestorymod.entities.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.model.SmirkyGhostStumpModel;
import com.charlieNgo.maplestorymod.entities.mobs.SmirkyGhostStump;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SmirkyGhostStumpRender<T extends SmirkyGhostStump> extends MobRenderer<T, SmirkyGhostStumpModel<T>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MODID, "textures/entity/smirky_ghost_stump.png");

    public SmirkyGhostStumpRender(EntityRendererProvider.Context context) {
        super(context, new SmirkyGhostStumpModel<>(context.bakeLayer(SmirkyGhostStumpModel.LAYER_LOCATION)), 0.2f);
    }

    @Override
    public ResourceLocation getTextureLocation(T entity) {
        return TEXTURE;
    }
}
