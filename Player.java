public final class Player {

    private final String name;
    private final String description;
    private int maxHitPoints;
    private int hitPoints;
    private int minDamage;
    private int maxDamage;
    private int defense;
    private double critChance;
    private Location location;

    public Player(String name, String description, int maxHitPoints, int hitPoints, int minDamage,
        int maxDamage, int defense, double critChance, Location location) {
        this.name = name;
        this.description = description;
        this.maxHitPoints = maxHitPoints;
        this.hitPoints = maxHitPoints;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.defense = defense;
        this.critChance = critChance;
    }
}
