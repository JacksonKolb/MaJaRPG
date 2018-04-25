package com.maja.entities;

public final class Npc extends Actor {

	 private boolean isQuestGiver;
	 private boolean isMerchant;

	   public Npc(String name, String description, boolean isQuestGiver,
	            boolean isMerchant, Location location, Inventory inventory) {
	        this.name = name;
	        this.description = description;
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
