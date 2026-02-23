package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;

import java.util.*;

public interface Enemy {
    String getName();
    int getHealth();
    int getDamage();
    int getDefense();
    int getSpeed();
    List<Ability> getAbilities();
    void addAbility(Ability ability);
    LootTable getLootTable();
    void displayInfo();
    Enemy clone();
}
