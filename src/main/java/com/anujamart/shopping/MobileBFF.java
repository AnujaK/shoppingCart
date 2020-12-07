package com.anujamart.shopping;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

public class MobileBFF {
	//@Autowired
	private ShoppingCartService shoppingCartService;
	
	/*
	 * public MobileBFF( ShoppingCartService shoppingCartService) {
	 * this.shoppingCartService = shoppingCartService; }
	 */
	

	@RequestMapping("/api/mobile/v1/add")
	public boolean addItem(String mySKUEntryRecord, Cart aCart){
		return aCart.add(mySKUEntryRecord);
		//Item anItem = backendCompatibleItemFrom(mySKUEntryRecord);
		//shoppingCartService.addItemToCart(anItem, aCart);
	//	return null;
	}

	private Item backendCompatibleItemFrom(String mySKUEntryRecord) {
		// Connect to db and get the corresponding item
		return null;
	}

	@RequestMapping("/api/mobile/v1/remove")
	public void removeItem(String mySKUEntryRecord, Cart aCart){
		Item anItem = backendCompatibleItemFrom(mySKUEntryRecord);
		shoppingCartService.removeItemFromCart(anItem, aCart);
	}
	
	@RequestMapping("/api/mobile/v1/showConfirmation")
	public ResponseEntity<String> orderConfirmed(Cart aCart){
			return shoppingCartService.orderConfirmed(aCart);
	}

	public boolean addItems(List<String> mySKUEntryRecords, Cart aCart) {
		for (String record : mySKUEntryRecords) {
			aCart.add(record);
		}
		return true;
	}


}
