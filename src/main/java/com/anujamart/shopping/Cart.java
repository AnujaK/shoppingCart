package com.anujamart.shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	List<String> items = new ArrayList<String>();

	public boolean contains(String mySKUEntryRecord) {
		return (items.contains(mySKUEntryRecord));
	}

	public boolean add(String mySKUEntryRecord) {
		items.add(mySKUEntryRecord);
		return true;
	}

}
