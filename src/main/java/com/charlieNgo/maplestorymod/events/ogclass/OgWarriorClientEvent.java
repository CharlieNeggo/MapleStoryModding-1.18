package com.charlieNgo.maplestorymod.events.ogclass;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleSetItems.MapleModItems;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)

public class OgWarriorClientEvent {

    @SubscribeEvent
    public static void onDamageEntityAxe(AttackEntityEvent event) {
        if (event.getEntityLiving().getMainHandItem().getItem() == MapleModItems.ARAN_AXE_ONE.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    Player player = event.getPlayer();
                    target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10*20));
                    target.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10*30));
                    target.addEffect(new MobEffectInstance(MobEffects.WITHER, 10*30));



                }
            }
        }
    }


    @SubscribeEvent
    public static void onDamageEntityKaiserKaisereum(AttackEntityEvent event) {
        if (event.getEntityLiving().getMainHandItem().getItem() == MapleModItems.KAISER_KAISREUM.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    Player player = event.getPlayer();
                    target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10*20));


                }
            }
        }
    }
}
