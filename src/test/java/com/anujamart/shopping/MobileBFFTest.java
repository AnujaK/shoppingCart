package com.anujamart.shopping;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * Dropping ShoppingCartProxy for now
 */
public class MobileBFFTest {
	@Mock
	private ShoppingCartService shoppingCartService;
	
	//TODO : adfsdfg
	//FIXME 
	@Autowired
	private MobileBFF mbff;

	@Test
	public void addItemSucessfullyToCart(){
	//int itemCode=12;
	Cart cart = new Cart();
	String mySKUEntryRecord = "12earring";
	MobileBFF mbff = new MobileBFF();
	
	assertTrue(mbff.addItem(mySKUEntryRecord, cart));
	//1. Mbff should return the skuID of the item that it added successsfully
	//2. The cart should contain the added item
//	assertTrue(cart.contains(mySKUEntryRecord));
	//3. we should be able to add multiple items
	}
/*
	@Test
	RemoveItemSucessfullyFromCart(){
	itemCode=12;
	cart = mock(ShoppingCartProxy);
	cart.expect(removeItem).with(itemCode).shouldReturn(itemCode);

	MobileBFF mbff = new MobileBFF(cart);
	mbff.addItem(mySKYEntryRecord);
	cart.verify();
	}

	@Test
	testBFFOrderConfirmationFailure(){
	shoppingCartService.id =122;
	cart = mock(ShoppingCartProxy);
	cart.expect(removeItem).with(itemCode).shouldReturn(itemCode);

	MobileBFF mbff = new MobileBFF(cart);
	mbff.addItem(mySKYEntryRecord);
	cart.verify();
	}
*/
	
}
