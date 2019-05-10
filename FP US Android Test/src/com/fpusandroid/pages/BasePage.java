package com.fpusandroid.pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	
	
	AndroidDriver<AndroidElement> driver;
	
	public BasePage(AndroidDriver<AndroidElement> driver) {
		
		
		this.driver = driver;
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);


	}
	
	

}
