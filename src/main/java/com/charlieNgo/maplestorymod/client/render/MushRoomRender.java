package com.charlieNgo.maplestorymod.client.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.MushRoomModel;
import com.charlieNgo.maplestorymod.entities.MushRoom;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MushRoomRender<Type extends MushRoom> extends MobRenderer<Type, MushRoomModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MODID, "textures/entity/mushroom.png");

    public MushRoomRender(EntityRendererProvider.Context context) {
        super(context, new MushRoomModel<>(context.bakeLayer(MushRoomModel.LAYER_LOCATION)), 0.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
