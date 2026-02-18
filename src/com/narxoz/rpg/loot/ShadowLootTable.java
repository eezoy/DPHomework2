package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class ShadowLootTable implements LootTable {
    private final int gold;
    private final int xp;
    private final List<String> items;

    public ShadowLootTable() {
        this.gold = 160;
        this.xp = 320;
        this.items = new ArrayList<>();
        items.add("Shadow Gem");
        items.add("Dark Essence");
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
        return "Shadow loot: " + items.toString();
    }

    @Override
    public LootTable clone() {
        return new ShadowLootTable();
    }

}