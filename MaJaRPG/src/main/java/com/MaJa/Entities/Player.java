package com.MaJa.Entities;

public final class Player extends Actor {

    private final String name;
    private final String description;
    private int maxHitPoints;
    private int hitPoints;
    private int minDamage;
    private int maxDamage;
    private int defense;
    private double critChance;
    private Location location;
    private Inventory inventory;


    public Player(String name, String description, int maxHitPoints, int hitPoints, int minDamage,
        int maxDamage, int defense, double critChance, Location location, Inventory inventory) {
        this.name = name;
        this.description = description;
        this.maxHitPoints = maxHitPoints;
        this.hitPoints = hitPoints;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.defense = defense;
        this.critChance = critChance;
        this.location = location;
        this.inventory = inventory;
    }

}
