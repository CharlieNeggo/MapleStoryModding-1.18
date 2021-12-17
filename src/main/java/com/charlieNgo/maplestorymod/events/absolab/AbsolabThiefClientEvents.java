package com.charlieNgo.maplestorymod.events.absolab;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.AbsolabSetItems.MapleAbsolabSetItems;
import net.minecraft.network.chat.TextColor;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class AbsolabThiefClientEvents {

    @SubscribeEvent
    public static void onDamageEntityDagger(AttackEntityEvent event) {
        if (event.getEntityLiving().getMainHandItem().getItem() == MapleAbsolabSetItems.ABSOLAB_DAGGER.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof Entity) {

                    Player player = event.getPlayer();
                    target.addEffect(new MobEffectInstance(MobEffects.POISON, 10*20));
                    target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10*20));
                }
            }
        }
    }

    @SubscribeEvent
    public static void onDamageEntityKatara(AttackEntityEvent event1) {
        if (event1.getEntityLiving().getMainHandItem().getItem() == MapleAbsolabSetItems.ABSOLAB_KATARA.get()) {
            if (event1.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event1.getTarget();
                if (target instanceof Entity) {

                    Player player = event1.getPlayer();
                    target.addEffect(new MobEffectInstance(MobEffects.POISON, 10*20));
                    target.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10*20));

                }
            }
        }
    }
}
