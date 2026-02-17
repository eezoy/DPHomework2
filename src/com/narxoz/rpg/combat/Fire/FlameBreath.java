package com.narxoz.rpg.combat.Fire;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class FlameBreath implements Ability{
    private final String name;
    private final int damage;
    private final String description;
    private final AbilityType type;

    public FlameBreath() {
        this.name = "Flame Breath";
        this.damage = 30;
        this.description = "Unleashes a fiery breath that scorches all enemies in front of the dragon.";
        this.type = AbilityType.DAMAGE;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public AbilityType getType() {
        return type;
    }

    @Override
    public Ability clone() {
        return new FlameBreath();
    }
}
