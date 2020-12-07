package com.anujamart.shopping;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class ShoppingCartService {
	
	@RequestMapping("/api/v1/add")
	public boolean addItemToCart(Item anItem, Cart aCart){
		return false;
	}
	
	@RequestMapping("/api/v1/remove")
	public void removeItemFromCart(Item anItem, Cart aCart){
	}
	
	@RequestMapping("/api/vi/display")
	public List<Item> showCartItems(Cart aCart){
		// connect to DB and return a collection
		return null;
	}

	@RequestMapping("/api/v1/showConfirmation")
	public ResponseEntity<String> orderConfirmed(Cart aCart){
		return null;
		//Payment service confirms 
	}
}

