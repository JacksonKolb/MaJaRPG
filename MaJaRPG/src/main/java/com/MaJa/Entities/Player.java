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
