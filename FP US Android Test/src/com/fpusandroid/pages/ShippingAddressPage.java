package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ShippingAddressPage extends BasePage {

	public ShippingAddressPage(AndroidDriver<AndroidElement> driver) {
		
		super(driver);
		
			
	}
	
	//element - button of Ship To This Address
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/shipping_address_newaddress_continue")
	public AndroidElement btnShipAddress;
	//element - button of Next
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/navigate_next")
	public AndroidElement btnNext; 
	
	//go shopping cart
	public ShoppingCartPage clickAddress() {
		btnNext.click();
		return new ShoppingCartPage(driver);
		
		
	}
	


}
