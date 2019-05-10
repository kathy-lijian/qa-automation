package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class GooglePWPage extends BasePage{

	public GooglePWPage(AndroidDriver<AndroidElement> driver) {

		super(driver);
		
	}
	
	
	
	//element - password
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View")
	public AndroidElement fieldPW;
	//element - Next button
	@AndroidFindBy(id = "passwordNext")
	public AndroidElement btnPWNext;
	
	
	
	
	public void inputGooglePW() {
		
		fieldPW.sendKeys("fpqa@avanquest");
	}
	public AgreePage clickPWNext() {
		
		btnPWNext.click();
		return new AgreePage(driver);
		
	}
	

}
