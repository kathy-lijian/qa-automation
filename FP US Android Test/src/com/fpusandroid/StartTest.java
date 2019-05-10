package com.fpusandroid;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.excel.DDT.ExcelLib;
import com.fpusandroid.pages.HomePage;
import com.fpusandroid.pages.LogInPage;
import com.fpusandroid.pages.SecurePaymentPage;
import com.fpusandroid.pages.SelectPhotoPage;
import com.fpusandroid.pages.SelectSizePage;
import com.fpusandroid.pages.ShippingAddressPage;
import com.fpusandroid.pages.ShoppingCartPage;
import com.fpusandroid.pages.WelcomePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class StartTest {
		
		public static AndroidDriver<AndroidElement> driver;
		
		

		
		
		@BeforeClass
		public void setup() throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "Planetart Automation Phone");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("app", "/Users/kathy/Documents/Work/Builds/app-us_fla-normal-release.apk");
		caps.setCapability("appPackage", "com.photoaffections.freeprints");
		caps.setCapability("appActivity", ".workflow.pages.home.StartActivity");
		//if not set automationName as uiautomator2, defualt will be uiautomator, and the action of sendkeys will not easy to pass;
		caps.setCapability("automationName", "uiautomator2");
		caps.setCapability("autoGrantPermission", true);
		
		driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
		
		
		
		
		
		}
		
		@AfterClass
		public void teardown() {
			
			driver.quit();
			
		}
		
		
		
		@Test
		public void testLogin() throws InterruptedException, IOException {
			

		
		
		//object for WelcomePage
		WelcomePage wPage = new WelcomePage(driver);
		
		Thread.sleep(2000);
		System.out.println("Welcome to FreePrints");
		
	
		Thread.sleep(2000);
		
		//click Get Start, object for HomePage
		HomePage hPage = wPage.clickStart();
		Thread.sleep(5000);
		System.out.println("Welcome to Home Screen!");
		
		//close First Launch PO
		hPage.closePO();
		System.out.println("Close First Launch PO!");
		
	
		
		//open Drawer Menu
		//Thread.sleep(2000);
		hPage.clickDrawer();
		System.out.println("Open Drawer Menu");
		
		//click Log In in the drawer, object for LogIn Page
		//Thread.sleep(2000);
		LogInPage loginPage = hPage.clickLogin();
		System.out.println("Open LogIn Page");
		
		
		//read email and ps from AccountInfo excel file and login
		ExcelLib excel = new ExcelLib("/Users/kathy/Documents/Work/AccountInfo.xlsx");
		String emailaddress = excel.getTestData(0, 1);
		String ps = excel.getTestData(1, 1);
		System.out.println("Get Account Name: "+emailaddress);
		System.out.println("Get Account Password: "+ps);
		Thread.sleep(2000);
		//after login, back to Home Page
		hPage = loginPage.login(emailaddress, ps);
		System.out.println("Finish Login!");
		
		//close returning PO, click Begin button in Home page, go to select photos
		Thread.sleep(5000);
		hPage.closePO();
		System.out.println("Close Returning PO!");
		//Thread.sleep(2000);
		SelectPhotoPage spPage = hPage.clickBegin();
		System.out.println("Click Begin button in Home Page!");
		
		//after select local photo, go to select size page
		Thread.sleep(2000);
		SelectSizePage szPage = spPage.selectLocalPhoto();
		System.out.println("Open Select Size page!");
		
		//do nothing in select size page, keep default selection, click Next to go to Address page
		Thread.sleep(2000);
		ShippingAddressPage addPage = szPage.clickNext();
		System.out.println("Open Shipping Address Page!");	
		
		//select the default address, then go to shopping cart
		//Thread.sleep(2000);
		ShoppingCartPage cartPage = addPage.clickAddress();
		System.out.println("Open Shopping Cart!");
		
		//do nothing in shopping cart, click Next button to go to Secure Payment page
		//Thread.sleep(3000);
		SecurePaymentPage payPage = cartPage.clickNext();
		System.out.println("Open Secure Payment page!");
		
		//get card number and expired date from excel file
		String cardNum = excel.getTestData(2, 1);
		String date = excel.getTestData(3, 1);
		System.out.println("Get Credit Card Number: "+cardNum);
		System.out.println("Get Expired Date: "+date);
		Thread.sleep(2000);
		payPage.SubmitOrder(cardNum, date);
		System.out.println("Submit Order Finished!");

		}
		
		
		
		
	

}
