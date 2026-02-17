package com.narxoz.rpg.combat.Shadow;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.combat.AbilityType;

public class ShadowStrike implements Ability {
    private final String name;
    private final int damage;
    private final String description;
    private final AbilityType type;

    public ShadowStrike() {
        this.name = "Shadow Strike";
        this.damage = 25;
        this.description = "A swift and deadly strike from the shadows that deals high damage.";
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
        return new ShadowStrike();
    }
    
}
