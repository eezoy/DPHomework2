package com.narxoz.rpg.combat.Fire;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class FireShield implements Ability{
    private final String name;
    private final int damage;
    private final String description;
    private final AbilityType type;

    public FireShield() {
        this.name = "Fire Shield";
        this.damage = 0;
        this.description = "Envelops the dragon in a fiery shield that absorbs incoming damage and burns attackers.";
        this.type = AbilityType.DEFENSIVE;
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
        return new FireShield();
    }
}
