package com.MaJa.Inventory;

import java.util.HashMap;

public final class Inventory {

	Map<Object> inventory = new HashMap<Object>();

	public Inventory(HashMap<Object> inventory) {
		this.inventory = inventory;
	}

	public void clear() {
		this.inventory.clear();
	}
}
