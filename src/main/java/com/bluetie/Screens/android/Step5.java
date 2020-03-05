package com.bluetie.Screens.android;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Step5 extends Utilities{
	
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Step5.class);
	
	//Step5 Title
		@AndroidFindBy(id="txt_bt_title")
		public WebElement step5HeaderTitle;
	//TaptoStartNetworking
	@AndroidFindBy(id="txt_lets_start_networking")
	public WebElement TaptoStartNetworking;
	
	public Step5(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        waitTime(1);
    }

	
	//clicking on  step3 next
			public void TaptoStartNetworking() throws InterruptedException {
				
				
				try
				 
				 {
						
					
					
					TaptoStartNetworking.click();
					 log.info("clicked on TaptoStartNetworking" );
					 
					 }catch(Exception e){			 
					
					Assert.fail("Not able to click TaptoStartNetworking");
					 }
								}
}
