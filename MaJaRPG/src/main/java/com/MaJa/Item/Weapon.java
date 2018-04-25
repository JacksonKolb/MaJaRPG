package com.maja.item;

import java.util.ArrayList;

public class Weapon extends Item {

    private ArrayList<Integer> modifiers;

    public Weapon(String name, String type, String description, ArrayList<Integer> modifiers) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.modifiers = modifiers;
    }
}

