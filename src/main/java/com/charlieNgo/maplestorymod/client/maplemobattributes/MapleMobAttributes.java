package com.charlieNgo.maplestorymod.client.maplemobattributes;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class  MapleMobAttributes {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        //Orange Mushroom
        event.put(MapleModEntityTypes.MUSHROOM.get(), MushRoom.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 5.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.23F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Green Slime
        event.put(MapleModEntityTypes.GREENSLIME.get(), GreenSlime.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 5.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.22F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Blue Snail
        event.put(MapleModEntityTypes.BLUESNAIL.get(), BlueSnail.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 5.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.16F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Octopus
        event.put(MapleModEntityTypes.OCTOPUS.get(), Octopus.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 10.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.18F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Muddy Swamp Monster
        event.put(MapleModEntityTypes.MUDDYSWAMPMONSTER.get(), MuddySwampMonster.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 25.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.19F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Smirky Ghost Stump
        event.put(MapleModEntityTypes.SMIRKYGHOSTSTUMP.get(), SmirkyGhostStump.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 12.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.16F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Copper Drake
        event.put(MapleModEntityTypes.COPPERDRAKE.get(), CopperDrake.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 35.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.20F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Wooden Mask
        event.put(MapleModEntityTypes.WOODENMASK.get(), WoodenMask.createMobAttributes().add(Attributes.FOLLOW_RANGE, 25.0D).add(Attributes.MAX_HEALTH, 30.0F)
                .add(Attributes.MOVEMENT_SPEED, 0.18F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
    }
}
