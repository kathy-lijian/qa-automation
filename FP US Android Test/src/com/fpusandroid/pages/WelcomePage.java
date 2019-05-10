package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomePage extends BasePage {
	
	
	public WelcomePage(AndroidDriver<AndroidElement> driver) {
		
		super(driver);
		
		
	}
	
	
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/welcome_contineu_button")
	public AndroidElement btnStart;
	
	public HomePage clickStart() {
		
		btnStart.click();
		return new HomePage(driver);
		
		
	
		
	}
	
	

}
