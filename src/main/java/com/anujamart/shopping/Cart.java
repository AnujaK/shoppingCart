package com.anujamart.shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class Cart {
	private int id;
	List<String> items = new ArrayList<String>();

	/*
	 * public int getId() { return id; }
	 * 
	 * public void setId(int id) { this.id = id; }
	 */

	public boolean contains(String mySKUEntryRecord) {
		return (items.contains(mySKUEntryRecord));
	}

	public boolean add(String mySKUEntryRecord) {
		items.add(mySKUEntryRecord);
		return true;
	}

}
