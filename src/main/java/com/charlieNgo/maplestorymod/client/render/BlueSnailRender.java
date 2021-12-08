package com.charlieNgo.maplestorymod.client.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.BlueSnailModel;
import com.charlieNgo.maplestorymod.client.model.GreenSlimeModel;
import com.charlieNgo.maplestorymod.client.model.MushRoomModel;
import com.charlieNgo.maplestorymod.entities.BlueSnail;
import com.charlieNgo.maplestorymod.entities.GreenSlime;
import com.charlieNgo.maplestorymod.entities.MushRoom;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BlueSnailRender<Type extends BlueSnail> extends MobRenderer<Type, BlueSnailModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MODID, "textures/entity/blue_snail.png");

    public BlueSnailRender(EntityRendererProvider.Context context) {
        super(context, new BlueSnailModel<>(context.bakeLayer(GreenSlimeModel.LAYER_LOCATION)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
