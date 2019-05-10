package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SecurePaymentPage extends BasePage{

	public SecurePaymentPage(AndroidDriver<AndroidElement> driver) {
		
		super(driver);
	}
	
	//element - field of Card Number
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/edtCreditCartNumber")
	public AndroidElement fieldCardNum;
	//element - field of Expiration Date
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Spinner/android.widget.EditText")
	public AndroidElement fieldDate;
	//element - button of Submit Order
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/btnCreditCardPaytv")
	public AndroidElement btnSubmit;
	
	
	public void inputCardNum(String cardNum) {
		//fieldCardNum.click();
		//fieldCardNum.clear();
		
		fieldCardNum.sendKeys(cardNum);
	}
	
	public void inputDate(String date) {
		//fieldDate.click();
		//fieldDate.clear();
		
		fieldDate.sendKeys(date);
		
	}
	
	public void clickSubmit() {
		
		btnSubmit.click();
	}
	
	public void SubmitOrder(String cardNum, String date) {
		
		inputCardNum(cardNum);
		inputDate(date);
		clickSubmit();
		
		
	}
	

}
