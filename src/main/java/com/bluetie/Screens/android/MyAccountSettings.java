package com.bluetie.Screens.android;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.common.Base;
import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyAccountSettings extends Utilities{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(MyAccountSettings.class);

	
	//Help Centre
		@AndroidFindBy(id = "toolbar_title")
		public WebElement myAccountSettingTitle;
		
		//signout
		@AndroidFindBy(id = "btn_accountSettings_signOut")
		public WebElement signout;
		
		//Clicking on yes in Popup
		@AndroidFindBy(id = "android:id/button1")
		public WebElement yes;
		
		public MyAccountSettings(WebDriver driver) throws InterruptedException {
	        this.driver = driver;
	       
	       
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        Utilities.waitTime(1);
	    }
		
		//clicking on  step3 next
		public void accountsignout() throws InterruptedException {
			
			
			try
			 
			 {
					
				
				 scrollToElementByid("btn_accountSettings_signOut");
				 signout.click();
			 
				 log.info("clicked on signout option" );
				 }catch(Exception e){			 
				
				Assert.fail("Not able to click step3 next icon");
				 }
			
			}
		
		//clicking on  yes in signout popup
				public void clickingOnYes() throws InterruptedException {
					
					
					try
					 
					 {
							
						
						yes.click();
						log.info("clicked on yes in signout popup" );
						 
						 }catch(Exception e){	
							 
							// yes.click();
						Assert.fail("clicked on Yes in popup");
						 }
					
					}
}
