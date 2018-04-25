package com.MaJa.Entities;

public class Actor{
	
	private String name;
    private String description;
    private int maxHitPoints;
    private int hitPoints;
    private int minDamage;
    private int maxDamage;
    private int defense;
    private double critChance;
    private Location location;
    private Inventory inventory;	
	
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getMaxHitPoints() {
        return maxHitPoints;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getDefense() {
        return defense;
    }

    public double getCritChance() {
        return critChance;
    }

    public Location getLocation() {
        return location;
    }

    public Inventory getInventory() {
        return inventory;
    }
}