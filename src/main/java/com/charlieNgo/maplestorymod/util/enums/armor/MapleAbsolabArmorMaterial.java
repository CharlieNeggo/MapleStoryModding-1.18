package com.charlieNgo.maplestorymod.util.enums.armor;

import com.charlieNgo.maplestorymod.MapleStoryMod;
import com.charlieNgo.maplestorymod.init.MapleModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum MapleAbsolabArmorMaterial implements IArmorMaterial, ArmorMaterial {

    ABSOLAB(MapleStoryMod.MOD_ID + ":absolab", 150, new int [] { 14, 17, 19, 14 }, 20,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F, () -> { return Ingredient.fromItems(MapleModItems.ABSOLAB_ESSENCE.get()); }, 1);

    private static final int [] MAX_DAMAGE_ARRAY = new int [] { 11, 16, 15, 13 };
    private final String name;
    private final int maxDamageFactor;
    private final int [] damageReductionAmountArray;
    private final int enchantabiltiy;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    MapleAbsolabArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantabiltiy, SoundEvent soundEvent, float toughness, Supplier<Ingredient>
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

    @Override
    public int getDurabilityForSlot(EquipmentSlot p_40410_) {
        return 0;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot p_40411_) {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public SoundEvent getEquipSound() {
        return null;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
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
