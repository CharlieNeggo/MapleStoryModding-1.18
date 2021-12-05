package com.charlieNgo.maplestorymod.events.absolab;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleAbsolabSetItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class AbsolabThiefClientEvents {

    @SubscribeEvent
    public static void onDamageEntityDagger(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleAbsolabSetItems.ABSOLAB_DAGGER.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));

                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.DARK_PURPLE + "Poisoned and Slowed...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public static void onDamageEntityKatara(AttackEntityEvent event) {
        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleAbsolabSetItems.ABSOLAB_KATARA.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    PlayerEntity player = event.getPlayer();
                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));

                    if (event.getPlayer().getEntityWorld().isRemote) {
                        String msg = TextFormatting.DARK_PURPLE + "Poisoned and Slowed...";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

//    @SubscribeEvent
//    public static void WearChaserHat( event) {
//        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleAbsolabSetItems.ABSOLAB_KATARA.get()) {
//            if (event.getTarget().isAlive()) {
//                LivingEntity target = (LivingEntity) event.getTarget();
//                if (target instanceof Entity) {
//
//                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));
//
//                    if (event.getPlayer().getEntityWorld().isRemote) {
//                        String msg = TextFormatting.DARK_PURPLE + "Poisoned and Slowed...";
//                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
//                    }
//                }
//            }
//        }
//    }
}
