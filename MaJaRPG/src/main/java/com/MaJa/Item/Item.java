package com.maja.item;

public class Item {

    private String name;
    private String type;
    private String description;

    public Item(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.description = description;
    }

    //TODO - add actual random item calls to potion.java, weapon.java, etc.
    public static Item newRandomItem() {
        Item randomItem = null;
        int random = ProjectMoria.RAND.nextInt(3) + 1;
        return randomItem;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
