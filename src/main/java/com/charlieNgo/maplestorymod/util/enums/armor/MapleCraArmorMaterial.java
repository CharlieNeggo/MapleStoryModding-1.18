package com.charlieNgo.maplestorymod.util.enums.armor;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public class MapleCraArmorMaterial implements ArmorMaterial {

//    CRA(MapleStoryMod.MOD_ID + ":cra", 150, new int [] { 14, 17, 19, 14 }, 20,
//            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 5.0F, () -> { return Ingredient.fromItems(MapleModItems.CRA.get()); }, 1);
;
    private static final int [] MAX_DAMAGE_ARRAY = new int [] { 11, 16, 15, 13 };
    private final int enchantability;
    private final int[] durability, damageReduction;
    private final float knockbackResistance, toughness;
    private final String name;
    private final SoundEvent equipSound;
    private final Supplier<Ingredient> repairMaterial;

    public MapleCraArmorMaterial(int enchantability, int[] durability, int[] damageReduction,
                             float knockbackResistance, float toughness, String name, SoundEvent equipSound,
                             Supplier<Ingredient> repairMaterial) {
        this.enchantability = enchantability;
        this.durability = durability;
        this.damageReduction = damageReduction;
        this.knockbackResistance = knockbackResistance;
        this.toughness = toughness;
        this.name = name;
        this.equipSound = equipSound;
        this.repairMaterial = repairMaterial;
    }
    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return this.damageReduction[slot.getIndex()];
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return this.durability[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairMaterial.get();
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }
}
