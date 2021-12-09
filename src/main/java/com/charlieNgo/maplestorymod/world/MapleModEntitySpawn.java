//package com.charlieNgo.maplestorymod.world;
//
//import com.charlieNgo.maplestorymod.MapleStoryMod;
//import net.minecraft.world.entity.MobCategory;
//import net.minecraft.world.level.biome.Biome;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
//import net.minecraftforge.registries.ForgeRegistries;
//
//@Mod.EventBusSubscriber(modid = MapleStoryMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
//public class MapleModEntitySpawn {
//
//    @SubscribeEvent
//    public static void generateOres(FMLLoadCompleteEvent event) {
//        for (Biome biome : ForgeRegistries.BIOMES) {
//
//            // Nether Mobs
//            if (biome.getBiomeCategory() == Biome.BiomeCategory.NETHER) { }
//
//            // End Mobs
//            else if (biome.getBiomeCategory() == Biome.BiomeCategory.THEEND) { }
//
//            // Overworld Mobs
//            else {
//                if (biome.getBiomeCategory() != Biome.BiomeCategory.OCEAN) {
//                    biome.getMobSettings(MobCategory.CREATURE)
//                            .add(new Biome.BiomeCategory(ModEntityType.HOG.get(), 10, 3, 5));
//                }
//            }
//        }
////    }
//}