package com.MaJa.Item;

public class Weapon extends Item {

		private int<> modifiers;
	
	public Weapon(String name, String type, String description, int<> modifiers) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.modifiers = modifiers;
    }
}
