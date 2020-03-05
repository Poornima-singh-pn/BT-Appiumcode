package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.bluetie.common.Base;
import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class MyAccountSettings extends Utilities{
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(MyAccountSettings.class);

	
	//Help Centre
		@AndroidFindBy(id = "toolbar_title")
		public MobileElement myAccountSettingTitle;
		
		//signout
//		@AndroidFindBy(id = "btn_accountSettings_signOut")
//		public MobileElement signout;
		@iOSFindBy(accessibility="SIGN OUT")
		public MobileElement SIGNOUT;
		//Clicking on yes in Popup
		@AndroidFindBy(id = "android:id/button1")
		public MobileElement yes;
		
		public MyAccountSettings(AppiumDriver<MobileElement> driver) throws InterruptedException {
	        this.driver = driver;
	       
	       
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	       
	    }
		
		//clicking on  step3 next
		public void accountsignout() throws InterruptedException {
			
			
			try
			 
			 {
					
				
				scrollToElementByid("SIGN OUT");
				// signout.click();
			 tap(SIGNOUT);
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
