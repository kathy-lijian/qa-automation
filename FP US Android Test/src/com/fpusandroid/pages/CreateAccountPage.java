package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateAccountPage extends BasePage{

	public CreateAccountPage(AndroidDriver<AndroidElement> driver) {
		
		
		super(driver);
		
	}
	
	
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/edtFirstname")
	public AndroidElement fName;
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/edtLastname")
	public AndroidElement lName;
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/edtEmail")
	public AndroidElement email;
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/edtPassword")
	public AndroidElement pw;
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/btnCreateAccount")
	public AndroidElement btnSign;
	
	
	public void inputFName() {
		
		fName.sendKeys("QA");
	}
	public void inputLName() {
		
		lName.sendKeys("Test");
	}
	public void inputEmail() {
		
		email.sendKeys("");
	}
	public void inputPW() {
		
		pw.sendKeys("avaN2019$");
	}
	public HomePage clickSignUp() {
		
		btnSign.click();
		return new HomePage(driver);
	}
	
	
	public HomePage SignUp() {
		
		inputEmail();
		inputLName();
		inputEmail();
		inputPW();
		//back HomePage
		return clickSignUp();
		
		
		
	}
	

}
