package com.charlieNgo.maplestorymod.client.render;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.client.model.MuddySwampMonsterModel;
import com.charlieNgo.maplestorymod.entities.MuddySwampMonster;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MuddySwampMonsterRender<Type extends MuddySwampMonster> extends MobRenderer<Type, MuddySwampMonsterModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(MapleStoryMod.MODID, "textures/entity/muddy_swamp_monster.png");

    public MuddySwampMonsterRender(EntityRendererProvider.Context context) {
        super(context, new MuddySwampMonsterModel<>(context.bakeLayer(MuddySwampMonsterModel.LAYER_LOCATION)), 0.3f);
    }

    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}
