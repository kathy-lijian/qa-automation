package com.fpusandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SelectPhotoPage extends BasePage {
	
	public SelectPhotoPage(AndroidDriver<AndroidElement> driver) {
		
		super(driver);
	}
	
	
	
	//element - Allow button
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
	public AndroidElement btnAllow;
	//element - Deny button
	@AndroidFindBy(id = "com.android.packageinstaller:id/permission_deny_button")
	public AndroidElement btnDeny;
	//element - Allow dialog
	@AndroidFindBy(id = "com.android.packageinstaller:id/desc_container")
	public AndroidElement dialogAllow;
	//element - Local Photo tab
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"PhotoSource_0\"]/android.widget.LinearLayout/android.widget.ImageView")
	public AndroidElement iconLocal;
	//element - local album cover
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/albumCover")
	public AndroidElement coverAlbum;
	//element - the 1st photo in album;
	@AndroidFindBy(xpath = "(//android.widget.ImageView[@content-desc=\"desc\"])[1]")
	public AndroidElement photoFirst;
	//element - Next button in Select Photo
	@AndroidFindBy(id = "com.photoaffections.freeprints:id/navigate_next")
	public AndroidElement btnNext;
	
	
	
	//method to click Allow button; allow to select photo from local;
	public void clickAllow() {
		
		btnAllow.click();
	}
	
	//not allow to select photo from local;
	public void clickDeny() {
		
		btnDeny.click();
		
	}
	
	//see if Allow dialog is displayed or not
	public boolean isAllow() {
		
		return dialogAllow.isDisplayed();
		
	}
	
	//select local photo source
	public void clickLocal() {
		
		iconLocal.click();
	}
	
	//select the first local photo album
	public void clickAlbum() {
		
		coverAlbum.click();
	}
	
	//select the 1st photo in album;
	public void selectOnePhoto() {
		
		photoFirst.click();
	}
	
	//click Next button to go to Select Size page
	public SelectSizePage clickNext() {
		
		btnNext.click();
		return new SelectSizePage(driver);
	}
	
	//select one local photo then go to select size page
	public SelectSizePage selectLocalPhoto() {
		
		if(isAllow()) {
			clickAllow();
			System.out.println("Allow to get photos from local!");
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		clickLocal();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		clickAlbum();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		selectOnePhoto();
		System.out.println("Select Photo from Local!");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickNext();
		
		
		
		return new SelectSizePage(driver);
		
		
	}

}
