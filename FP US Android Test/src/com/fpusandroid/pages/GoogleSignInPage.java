package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GoogleSignInPage extends BasePage {

	public GoogleSignInPage(AndroidDriver<AndroidElement> driver) {
		
		super(driver);
		
		
	}
	
	
	//element - email
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View[2]/android.view.View")
	public AndroidElement fieldEmail;
	
	//element - Next button
	@AndroidFindBy(id = "identifierNext")
	public AndroidElement btnNext;
	
	
	
	public void inputGoogleEmail()
	{
		
		fieldEmail.sendKeys("fpqa@gmail.com");
	}
	public GooglePWPage clickNext() {
		
		btnNext.click();
		return new GooglePWPage(driver);
		
		
		
	}
	

}
