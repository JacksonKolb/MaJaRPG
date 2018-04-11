public final class Monster {

    private String name;
    private String description;
    private int maxHitPoints;
    private int hitPoints;
    private int minDamage;
    private int maxDamage;
    private int defense;
    private double critChance;
    private boolean aggression;
    private Location location;
    private Inventory inventory;

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
}
