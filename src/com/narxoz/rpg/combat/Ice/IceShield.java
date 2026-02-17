package com.narxoz.rpg.combat.Ice;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class IceShield implements Ability{
    private final String name;
    private final int damage;
    private final String description;
    private final AbilityType type;

    public IceShield() {
        this.name = "Ice Shield";
        this.damage = 10;
        this.description = "A protective shield of ice that reduces incoming damage.";
        this.type = AbilityType.BUFF;
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
        return new IceShield();
    }
}
