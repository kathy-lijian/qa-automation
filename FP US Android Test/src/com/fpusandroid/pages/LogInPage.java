package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LogInPage extends BasePage {
	
	public LogInPage(AndroidDriver<AndroidElement> driver) {
		
		super(driver);
		
	}
	
	
	//element - the link of 'create account'
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/loginCreateAccountInfo")
	public AndroidElement lnkNewAccount;
	//element - the email field of login
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/edtEmail_login")
	public AndroidElement fieldEmail;
	//element - the password field of login
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/edtPassword_login")
	public AndroidElement fieldPS;
	//element - the login button
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/btnSignIn")
	public AndroidElement btnLogin;
	
	
	
	public CreateAccountPage clickCreate() {
		
		lnkNewAccount.click();
		return new CreateAccountPage(driver);
		
	}
	
	public void inputEmail(String emailAddress) {
		//fieldEmail.click();
		//fieldEmail.clear();
		fieldEmail.sendKeys(emailAddress);
		
	}
	
	public void inputPS(String password) {
		//fieldPS.click();
		//fieldPS.clear();
		
		fieldPS.sendKeys(password);
	}
	
	public void clickLogin() {
		
		btnLogin.click();
	}
	
	public HomePage login(String emailAddress, String password) {
		
		inputEmail(emailAddress);
		
		inputPS(password);
		
		clickLogin();
		
		return new HomePage(driver);
	}

}
