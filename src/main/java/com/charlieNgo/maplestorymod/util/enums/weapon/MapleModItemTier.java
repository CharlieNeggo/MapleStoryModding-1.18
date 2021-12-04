package com.charlieNgo.maplestorymod.util.enums.weapon;

import com.charlieNgo.maplestorymod.init.MapleModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum MapleModItemTier implements IItemTier, Tier {
    MAPLE(2, 1700, 10.5F, 2.0F, 12, () -> {
        return Ingredient.fromItems(MapleModItems.MAPLE.get());
    });

    private final int harvestLevel;
    private final int maxUses ;
    private final float Efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    MapleModItemTier(int harvestLevel, int maxUses, float Efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.Efficiency = Efficiency;
        this.enchantability = enchantability;
        this.attackDamage = attackDamage;
        this.repairMaterial = repairMaterial;

    }
    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return Efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }

    @Override
    public int getUses() {
        return 0;
    }

    @Override
    public float getSpeed() {
        return 0;
    }

    @Override
    public float getAttackDamageBonus() {
        return 0;
    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}
