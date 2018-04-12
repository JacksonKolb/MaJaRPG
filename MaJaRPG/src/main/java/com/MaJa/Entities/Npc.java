/* Max Morrison & Jackson Kolb
    Npc class handles all of the npc actions
*/

public final class Npc implements Actor {

	 private boolean isQuestGiver;
	 private boolean isMerchant;
	 
	   public Npc(String name, String description, int maxHitPoints,
	            int minDamage, int maxDamage, int defense, double critChance, boolean isQuestGiver,
	            boolean isMerchant, Location location, Inventory inventory) {
	        this.name = name;
	        this.description = description;
	        this.maxHitPoints = maxHitPoints;
	        this.hitPoints = maxHitPoints;
	        this.minDamage = minDamage;
	        this.maxDamage = maxDamage;
	        this.defense = defense;
	        this.critChance = critChance;
	        this.isQuestGiver = isQuestGiver;
	        this.isMerchant = isMerchant;
	        this.location  = location;
	        this.inventory = inventory;
	    }
	
	   public boolean isQuestGiver() {
		   return isQuestGiver;
	   }
	   
	   public boolean isMerchant() {
		   return isMerchant;
	   }
}
