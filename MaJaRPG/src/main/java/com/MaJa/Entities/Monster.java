package com.MaJa.Entities;


public final class Monster extends Actor {
	
    private boolean aggression;

    public Monster(String name, String description, int maxHitPoints,
            int minDamage, int maxDamage, int defense, double critChance,
            boolean aggression, Location location, Inventory inventory) {
        this.name = name;
        this.description = description;
        this.maxHitPoints = maxHitPoints;
        this.hitPoints = maxHitPoints;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.defense = defense;
        this.critChance = critChance;
        this.aggression = aggression;
        this.location  = location;
        this.inventory = inventory;
    }

    public boolean isAggressive() {
        return aggression;
    }

}
