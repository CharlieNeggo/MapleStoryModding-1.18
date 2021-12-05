package com.charlieNgo.maplestorymod.util.enums.armor;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum MapleModArmorMaterial implements IArmorMaterial {

    MAPLE(MapleStoryMod.MOD_ID + ":maple", 50, new int [] { 5, 8, 10, 5 }, 20,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3.0F, () -> { return Ingredient.fromItems(MapleModItems.MAPLE.get()); }, 1);

    private static final int [] MAX_DAMAGE_ARRAY = new int [] { 11, 16, 15, 13 };
    private final String name;
    private final int maxDamageFactor;
    private final int [] damageReductionAmountArray;
    private final int enchantabiltiy;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    MapleModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantabiltiy, SoundEvent soundEvent, float toughness, Supplier<Ingredient>
                     repairMaterial, float knockbackResistance) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantabiltiy = enchantabiltiy;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantabiltiy;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }


}
