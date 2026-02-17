package com.narxoz.rpg.combat.Shadow;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class Vanish implements Ability{
    private final String name;
    private final int damage;
    private final String description;
    private final AbilityType type;

    public Vanish() {
        this.name = "Vanish";
        this.damage = 0;
        this.description = "A stealth ability that makes the user invisible to enemies.";
        this.type = AbilityType.PASSIVE;
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
        return new Vanish();
    }
    
}