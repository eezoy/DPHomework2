package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class IceLootTable implements LootTable {
    private final int gold;
    private final int xp;
    private final List<String> items;

    public IceLootTable() {
        this.gold = 140;
        this.xp = 280;
        this.items = new ArrayList<>();
        items.add("Ice Gem");
        items.add("Frost Scale");
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
        return "Ice loot: " + items.toString();
    }

    @Override
    public LootTable clone() {
        return new IceLootTable();
    }

}

