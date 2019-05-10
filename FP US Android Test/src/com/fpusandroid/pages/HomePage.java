package com.fpusandroid.pages;

import java.util.NoSuchElementException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage{
	
	
	public HomePage(AndroidDriver<AndroidElement> driver) {
		
		super(driver);
		
	}
	
	//element to close PO
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/image_close")
	public AndroidElement iconPO;
	//element to open drawer
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/drawer_icon")
	public AndroidElement iconDrawer;
	//element - Log In
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/sliding_menu_sign_photaffection")
	public AndroidElement itemLogin;
	//element - Begin
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/begin_button")
	public AndroidElement btnBegin;
	
	//see if display any PO whatever first launch PO or returning PO;
	//public boolean isPO() {
		
		//return iconPO.isDisplayed();
	//}

	//close First Launch PO or returning PO
	public void closePO() {
		try {
			if (iconPO.isDisplayed()) {
				iconPO.click();
			}
			
		}catch (NoSuchElementException e) {
			
		}
		
	}
	//open Drawer menu
	public void clickDrawer() {
		
		iconDrawer.click();
	}
	
	//open Log In
	public LogInPage clickLogin() {
		
		itemLogin.click();
		return new LogInPage(driver);
	}
	
	//click Begin to select photo
	public SelectPhotoPage clickBegin() {
		
		btnBegin.click();
		return new SelectPhotoPage(driver);
		
	}
	

}
