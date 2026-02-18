package com.narxoz.rpg.loot;

import java.util.*;

public class FireLootTable implements LootTable {
    private final int gold;
    private final int xp;
    private final List<String> items;

    public FireLootTable() {
        this.gold = 100;
        this.xp = 67;
        this.items = new ArrayList<>();
        items.add("Fire gem");
        items.add("Dragon scale");
    }
    
    @Override
    public int getGoldDrop() {
        return gold;
    }

    @Override
    public int getXpDrop() {
        return xp;
    }

    @Override
    public List<String> getItems() {
        return items;
    }

    @Override
    public String getLootInfo() {
        return "Fire loot: " + items.toString();
    }

    @Override
    public LootTable clone() {
        return new FireLootTable();
    }
}
