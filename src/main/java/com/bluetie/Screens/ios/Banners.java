package com.bluetie.Screens.ios;


import org.apache.log4j.Logger;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Banners extends Utilities {
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(Banners.class);
	//Make networking
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Make Networking\"])[2]")
	public MobileElement BANNER1_TITLE_TEXT;
	
	
	@iOSFindBy(accessibility="ic next")
	public MobileElement BANNER1_NXT_BTN;
	
	//banner2 daily habit
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"a Daily Habit\"]")
	public MobileElement BANNER2_TITLE_TEXT;
	
	@iOSFindBy(accessibility="ic next")
	public MobileElement BANNER2_NXT_BTN;
	
	//banner3 soar Higher
	@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Soar Higher\"]")
	public MobileElement BANNER3_TITLE_TEXT;
	
	@iOSFindBy(accessibility="ic next")
	public MobileElement BANNER3_NXT_BTN;
	
	//banner4 work for you
	
		
		@iOSFindBy(accessibility="LET'S GET STARTED")
		public MobileElement BANNER4_GETSTARTED_BTN;
		
		
		public Banners(AppiumDriver<MobileElement> driver) throws InterruptedException {
	        this.driver = driver;
	      
	       // logMessage("Initializing the "+this.getClass().getSimpleName()+" elements");
	       PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	      
	    }

		
		public void clickOnBanner1Button(){
			try
		 
		 {
				
				tap(BANNER1_NXT_BTN);
//			if(BANNER1_TITLE_TEXT.getText().equals("Make Networking")) {
//
//				//banner1ArrowButton.click();	
//				tap(BANNER1_NXT_BTN);
				log.info("clicked on clickOnBanner1Button...");
//		 }
			 
			 }catch(Exception e){			 
			 System.out.println("Not in First Banner");
			 Assert.fail("Banner 1 is not available");
			 
			 }
			
		}

		public void clickOnBanner2Button(){
			try
		 
		 {
				
			if(BANNER2_TITLE_TEXT.getText().equals("a Daily Habit")) {

				//banner2ArrowButton.click();	
				tap(BANNER2_NXT_BTN);
				log.info("clicked on clickOnBanner2Button...");
		 }
			 
			 }catch(Exception e){			 
			 System.out.println("Not in Second Banner");
			 log.info("Not clicked on clickOnBanner2Button...");
			 Assert.fail("Banner 2 is not available");
			 
			 }
			
		}
		
		
		public void clickOnBanner3Button(){
			try
		 
		 {
				
			if(BANNER3_TITLE_TEXT.getText().equals("Soar Higher")) {

				//banner3TickButton.click();	
				tap(BANNER3_NXT_BTN);
				log.info("clicked on clickOnBanner3Button...");
		 }
			 
			 }catch(Exception e){			 
			 System.out.println("Not in Third Banner");
			 Assert.fail("Banner 3 is not available");
			 
			 }
			
		}
		
		public void clickOnBanner4Button(){
			try
		 
		 {
				
			if(BANNER4_GETSTARTED_BTN.isDisplayed()) {

				//banner3TickButton.click();	
				tap(BANNER4_GETSTARTED_BTN);
				log.info("clicked on clickOnBanner4Button...");
		 }
			 
			 }catch(Exception e){			 
			 System.out.println("Not in fourth banner");
			 Assert.fail("Banner 4 is not available");
			 
			 }
			
		}
}
