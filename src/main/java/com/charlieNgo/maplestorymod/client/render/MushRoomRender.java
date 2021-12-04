package com.charlieNgo.maplestorymod.client.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.MushRoomModel;
import com.charlieNgo.maplestorymod.entities.MushRoom;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MushRoomRender extends MobRenderer<MushRoom, MushRoomModel<MushRoom>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MOD_ID, "textures/entity/mushroom.png");

    public MushRoomRender(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new MushRoomModel<>(), 0.6F);
    }

    @Override
    public ResourceLocation getEntityTexture(MushRoom entity) {
        return TEXTURE;
    }
}
