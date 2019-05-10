package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ShoppingCartPage extends BasePage{

	public ShoppingCartPage(AndroidDriver<AndroidElement> driver) {
		
		super(driver);

		
	}
	
	//element - Continue button
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/tvContinue")
	public AndroidElement btnContinue;
	
	//element - button of Next
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/navigate_next")
	public AndroidElement btnNext;
	
	public SecurePaymentPage clickNext() {
		
		btnNext.click();
		return new SecurePaymentPage(driver);
	}

}
