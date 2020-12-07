package com.anujamart.shopping;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

public class ShoppingCartStub {
	
		@RequestMapping("/api/v1/add")
		public void addItemToCart(Item anItem, Cart aCart){
		}
		
		@RequestMapping("/api/v1/remove")
		public void removeItemFromCart(Item anItem, Cart aCart){
		}
		
		@RequestMapping("/api/vi/display")
		public List<Item> showCartItems(Cart aCart){
			// return items from memory/json file
			return null;
		}

		@RequestMapping("/api/v1/showConfirmation")
		public ResponseEntity<String> orderConfirmed(Cart aCart){
			/*
			 * if(aCart.getId() == 1)
			 	return new ResponseEntity<String> (HttpStatus.OK);*/
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}