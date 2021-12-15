package com.charlieNgo.maplestorymod.events.MapleMobsAttributes;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.entities.*;
import com.charlieNgo.maplestorymod.init.SpawnEggs.MapleModEntityTypes;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MapleStoryMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MapleMobAttributes {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        //Orange Mushroom
        event.put(MapleModEntityTypes.MUSHROOM.get(), MushRoom.createMobAttributes().add(Attributes.FOLLOW_RANGE, 35.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.23F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Green Slime
        event.put(MapleModEntityTypes.GREENSLIME.get(), GreenSlime.createMobAttributes().add(Attributes.FOLLOW_RANGE, 35.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.22F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Blue Snail
        event.put(MapleModEntityTypes.BLUESNAIL.get(), BlueSnail.createMobAttributes().add(Attributes.FOLLOW_RANGE, 35.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.16F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Octopus
        event.put(MapleModEntityTypes.OCTOPUS.get(), Octopus.createMobAttributes().add(Attributes.FOLLOW_RANGE, 35.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.22F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());
        //Muddy Swamp Monster
        event.put(MapleModEntityTypes.MUDDYSWAMPMONSTER.get(), MuddySwampMonster.createMobAttributes().add(Attributes.FOLLOW_RANGE, 35.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.20F).add(Attributes.ATTACK_DAMAGE, 3.0D).add(Attributes.ARMOR).build());

    }
}
