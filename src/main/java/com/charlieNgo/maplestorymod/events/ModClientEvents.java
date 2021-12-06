package com.charlieNgo.maplestorymod.events;

import com.charlieNgo.maplestorymod.MapleStoryMod;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.LivingEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.potion.EffectInstance;
//import net.minecraft.potion.Effects;
//import net.minecraft.util.text.StringTextComponent;
//import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ModClientEvents {

//    @SubscribeEvent // Living Entity func_233580 is an unmapped thingy
//    public static void onJumpWithStick(LivingEvent.LivingJumpEvent event) {
//        LivingEntity player = event.getEntityLiving();
//        if (player.getHeldItemMainhand().getItem() == Items.STICK) {
//            RubyOreMod.LOGGER.info("Player Tried to Jump with balls in your jaws");
//            World world = player.getEntityWorld();
//            world.setBlockState(player.func_233580_cy_().add(0, -1, 0), RegistryHandler.RUBY_BLOCK.get().getDefaultState());
//        }
//    }

//    @SubscribeEvent
//    public static void onDamageEntityDualDagger(AttackEntityEvent event) {
//        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleModItems.DUAL_BLADE_DAGGER.get()) {
//            if (event.getTarget().isAlive()) {
//                LivingEntity target = (LivingEntity) event.getTarget();
//                if (target instanceof Entity) {
//
//                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));
//
//                    if (event.getPlayer().getEntityWorld().isRemote) {
//                        String msg = TextFormatting.RED + "Poisoned and Slowed...";
//                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
//                    }
//                }
//            }
//        }
//    }
//
//    @SubscribeEvent
//    public static void onDamageEntityDualKatara(AttackEntityEvent event) {
//        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleModItems.DUAL_BLADE_KATARA.get()) {
//            if (event.getTarget().isAlive()) {
//                LivingEntity target = (LivingEntity) event.getTarget();
//                if (target instanceof Entity) {
//
//                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.POISON, 10*20));
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));
//
//                    if (event.getPlayer().getEntityWorld().isRemote) {
//                        String msg = TextFormatting.RED + "Poisoned and Slowed...";
//                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
//                    }
//                }
//            }
//        }
//    }
//
//    @SubscribeEvent
//    public static void onDamageEntityAxe(AttackEntityEvent event) {
//        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleModItems.ARAN_AXE_ONE.get()) {
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
//
//    @SubscribeEvent
//    public static void onDamageEntityKaiserKaisereum(AttackEntityEvent event) {
//        if (event.getEntityLiving().getHeldItemMainhand().getItem() == MapleModItems.KAISER_KAISREUM.get()) {
//            if (event.getTarget().isAlive()) {
//                LivingEntity target = (LivingEntity) event.getTarget();
//                if (target instanceof Entity) {
//
//                    PlayerEntity player = event.getPlayer();
//                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 10*20));
//
//
//                    if (event.getPlayer().getEntityWorld().isRemote) {
//                        String msg = TextFormatting.RED + "Slowed...";
//                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
//                    }
//                }
//            }
//        }
//    }
//    @SubscribeEvent
//    public static void onCraftingTableOpen(GuiOpenEvent event) {
//        if(event.isCancelable()) {
//            if (event.getGui() instanceof CraftingScreen) {
//                event.setCanceled(true);
//                RubyOreMod.LOGGER.info("You're an buffoon of a player");
//            }
//        }
//    }
}
