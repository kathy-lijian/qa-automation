package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AgreePage extends BasePage {

	public AgreePage(AndroidDriver<AndroidElement> driver) {
		

		super(driver);
	}
	
	
	@AndroidFindBy(id = "signinconsentNext")
	public AndroidElement btnAgree;
	
	public SelectPhotoPage clickAgree() {
		
		btnAgree.click();
		return new SelectPhotoPage(driver);
		
	}
	

}
