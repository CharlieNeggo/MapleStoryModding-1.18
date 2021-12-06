package com.charlieNgo.maplestorymod.events.absolab;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.MapleAbsolabSetItems;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.potion.EffectInstance;
//import net.minecraft.potion.Effects;
//import net.minecraft.util.text.StringTextComponent;
//import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class AbsolabWarriorClientEvents {

//    @SubscribeEvent
//    public static void onDamageEntityPoleArm(AttackEntityEvent event) {
//        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleAbsolabSetItems.ABSOLAB_POLEARM.get()) {
//            if (event.getTarget().isAlive()) {
//                LivingEntity target = (LivingEntity) event.getTarget();
//                if (target instanceof Entity) {
//
//                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));
//                    target.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 10*30));
//                    target.addPotionEffect(new EffectInstance(Effects.WITHER, 10*30));
//
//
//                    if (event.getPlayer().getEntityWorld().isRemote) {
//                        String msg = TextFormatting.RED + "Weakened and Slowed...";
//                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
//                    }
//                }
//            }
//        }
//    }
//
//    @SubscribeEvent
//    public static void onDamageEntityTwoHandedSword(AttackEntityEvent event) {
//        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleAbsolabSetItems.ABSOLAB_TWOHANDED_SWORD.get()) {
//            if (event.getTarget().isAlive()) {
//                LivingEntity target = (LivingEntity) event.getTarget();
//                if (target instanceof Entity) {
//
//                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));
//                    target.setFire(3);
//
//
//                    if (event.getPlayer().getEntityWorld().isRemote) {
//                        String msg = TextFormatting.RED + "Slowed and Burned...";
//                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
//                    }
//                }
//            }
//        }
//    }
}
