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
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Step4 extends Utilities{
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(Step4.class);
	//Step4 Title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='invite or promo code?']")
	public MobileElement step4HeaderTitle;
	
	//Dont have promocode
	@iOSFindBy(accessibility="I don't have a code")
	public MobileElement DONT_HAVE_PROMOCODE;
		
	// promocode/Invitecode Textbox
	@AndroidFindBy(id="edtCode")
	public MobileElement codeTextBox;
		
	// Apply promocode Button
		@AndroidFindBy(id="btnApplyCode")
		public MobileElement applyPromoCodeButton;
		
		
		public Step4(AppiumDriver<MobileElement> driver) throws InterruptedException {
	        this.driver = driver;
	        
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	       
	    }
		
		//clicking on  step3 next
		public Step5 donthavePromocodeText() throws InterruptedException {
			
			
			try
			 
			 {
					
				//scrollToElementByid("txtDontHaveCode");
				scrollToElementByname("I don't have a code");
				// dontHavePromocode.click();
				tap(DONT_HAVE_PROMOCODE);
				
				 log.info("clicked on dont have promocodelink" );
				 
			
				 }catch(Exception e){			 
				
				Assert.fail("Not able to click dontHavePromocode link");
				 }
			return new Step5(driver);
			}
}
