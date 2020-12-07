package com.anujamart.shopping;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CartTest {
	private Cart cart;
	
	private String mySKUEntryRecord = "Kurta";
	
	@BeforeEach
	public void setUp() {
		cart = new Cart();
	}
	@Test
	public void confirmContainsSKU() {
		cart.add(mySKUEntryRecord);
		assertTrue(cart.contains(mySKUEntryRecord));
	}
	
	@Test
	public void shouldAddItems() {
		assertTrue(cart.add(mySKUEntryRecord));
	}
	

}
