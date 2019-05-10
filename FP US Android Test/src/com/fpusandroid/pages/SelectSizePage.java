package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectSizePage extends BasePage {

	public SelectSizePage(AndroidDriver<AndroidElement> driver) {
		
		super(driver);
		
	}
	
	//element - Next button
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/shopping_cart_actionbar_continue")
	public AndroidElement btnNext;
	
	public ShippingAddressPage clickNext() {
		
		btnNext.click();
		return new ShippingAddressPage(driver);
	}

}
