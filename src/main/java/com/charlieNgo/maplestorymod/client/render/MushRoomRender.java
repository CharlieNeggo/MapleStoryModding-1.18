package com.charlieNgo.maplestorymod.client.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.MushRoomModel;
import com.charlieNgo.maplestorymod.entities.MushRoom;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MushRoomRender extends MobRenderer<MushRoom, MushRoomModel<MushRoom>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MOD_ID, "textures/entity/mushroom.png");

    public MushRoomRender(EntityRendererProvider.Context p_174304_, MushRoomModel<MushRoom> p_174305_, float p_174306_) {
        super(p_174304_, p_174305_, p_174306_);
    }

    @Override
    public ResourceLocation getTextureLocation(MushRoom entity) {
        return TEXTURE;
    }
}
