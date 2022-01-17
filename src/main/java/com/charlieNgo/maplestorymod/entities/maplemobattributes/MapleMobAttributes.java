package com.charlieNgo.maplestorymod.entities.maplemobattributes;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.mobs.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class  MapleMobAttributes {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(MapleModEntityTypes.MUSHROOM.get(), MushRoom.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 5.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.23F).add(Attributes.ATTACK_DAMAGE, 1.0D).add(Attributes.ARMOR).build());
        event.put(MapleModEntityTypes.GREENSLIME.get(), GreenSlime.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 5.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.22F).add(Attributes.ATTACK_DAMAGE, 1.0D).add(Attributes.ARMOR).build());
        event.put(MapleModEntityTypes.BLUESNAIL.get(), BlueSnail.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 5.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.16F).add(Attributes.ATTACK_DAMAGE, 1.0D).add(Attributes.ARMOR).build());
        event.put(MapleModEntityTypes.OCTOPUS.get(), Octopus.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 10.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.18F).add(Attributes.ATTACK_DAMAGE, 1.5D).add(Attributes.ARMOR).build());
        event.put(MapleModEntityTypes.MUDDYSWAMPMONSTER.get(), MuddySwampMonster.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 25.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.19F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        event.put(MapleModEntityTypes.SMIRKYGHOSTSTUMP.get(), SmirkyGhostStump.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 12.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.16F).add(Attributes.ATTACK_DAMAGE, 2.5D).add(Attributes.ARMOR).build());
        event.put(MapleModEntityTypes.COPPERDRAKE.get(), CopperDrake.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 35.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.20F).add(Attributes.ATTACK_DAMAGE, 5.0D).add(Attributes.ARMOR).build());
        event.put(MapleModEntityTypes.WOODENMASK.get(), WoodenMask.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 30.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.18F).add(Attributes.ATTACK_DAMAGE, 4.0D).add(Attributes.ARMOR).build());
    }
}
