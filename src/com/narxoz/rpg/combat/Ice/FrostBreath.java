package com.narxoz.rpg.combat.Ice;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class FrostBreath implements Ability{
    private final String name;
    private final int damage;
    private final String description;
    private final AbilityType type;

    public FrostBreath() {
        this.name = "Frost Breath";
        this.damage = 20;
        this.description = "A freezing breath that slows and damages enemies.";
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
        return new FrostBreath();
    }
}
