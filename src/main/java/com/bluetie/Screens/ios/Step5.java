package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Step5 extends Utilities{
	
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(Step5.class);
	
	//Step5 Title
		@AndroidFindBy(id="txt_bt_title")
		public MobileElement step5HeaderTitle;
	//TaptoStartNetworkin
		//@iOSFindBy(accessibility="Tap to start Networking")
		@iOSFindBy(accessibility="checkMark")
		public MobileElement START_NETWORKING;
		
	public Step5(AppiumDriver<MobileElement> driver) throws InterruptedException {
        this.driver = driver;
       
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        
    }

	
	//clicking on networking
			public void TaptoStartNetworking() throws InterruptedException {
				
				
				

				
				try
				 
				 {
					Actions actions = new Actions(driver);
					 actions.moveToElement(START_NETWORKING).doubleClick().perform();
					log.info("Clicked on Start Networking link");
					 }catch(Exception e){			 
						 
					Assert.fail("Not able to click TaptoStartNetworking");
					 }
								}
}
