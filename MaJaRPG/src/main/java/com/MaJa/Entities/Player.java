public final class Player implements Actor {

    public Player(String name, String description, int maxHitPoints, int hitPoints, int minDamage,
        int maxDamage, int defense, double critChance, Location location) {
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
