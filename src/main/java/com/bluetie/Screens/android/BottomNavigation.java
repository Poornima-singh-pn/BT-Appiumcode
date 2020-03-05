package com.bluetie.Screens.android;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BottomNavigation extends Utilities {
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(BottomNavigation.class);
	//Explore
	@AndroidFindBy(id="navigation_home")
	public WebElement exploreModule;
	
	//Search
	@AndroidFindBy(id="navigation_search")
	public WebElement searchModule;
		
	//Message
	@AndroidFindBy(id="navigation_messages")
	public WebElement messageModule;
				
	//Search
		@AndroidFindBy(id="navigation_myAccount")
		public WebElement myAccountModule;	
		
		public BottomNavigation(WebDriver driver) throws InterruptedException {
	        this.driver = driver;
	     
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        Thread.sleep(1000);
	    }


		
		public void clickOnExploreModuleIcon(){
			try
		 
		 {
				
			if(exploreModule.isDisplayed()) {

				exploreModule.click();	
				log.info("clicked on explore icon...");
		 }
			 
			 }catch(Exception e){			 
				 log.error("Not able to find Explore button");
			 Assert.fail("Not able to find Explore button");
			 }
			
		}
		public void clickOnSearchModuleIcon(){
			try
		 
		 {
				
			if(exploreModule.isDisplayed()) {

				exploreModule.click();	
				log.info("clicked on explore icon...");
		 }
			 
			 }catch(Exception e){			 
				 log.error("Not able to find Explore button");
			 Assert.fail("Not able to find Explore button");
			 }
			
		}
		public void clickOnMyAccount(){
//			try
//		 
//		 {
//				
//			if(myAccountModule.isDisplayed()) {
//
//				myAccountModule.click();	
//				log.info("clicked on myAccountModule icon...");
//		 }
//			 
//			 }catch(Exception e){			 
//				 log.error("Not able to find myAccount button");
//			 Assert.fail("Not able to find myAccount button");
//			 }
			
			
			driver.findElement(By.xpath("//android.widget.RelativeLayout[@index='3']/android.widget.LinearLayout[@index='4']/android.widget.RelativeLayout[@index='1']")).click();
			log.info("clicked on myAccount bottom menu" );
			
		}
}
