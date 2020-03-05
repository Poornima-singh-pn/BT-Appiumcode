package com.bluetie.Screens.android;


import org.apache.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Banners extends Utilities {
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Banners.class);
	//objective-driven
	@AndroidFindBy(xpath="//android.widget.TextView[@index='2']")
	public WebElement banner1HeaderText;
	
	@AndroidFindBy(id="btn_next")
	public WebElement banner1ArrowButton;
	
	//count
	@AndroidFindBy(xpath="//android.widget.TextView[@index='2']")
	public WebElement banner2HeaderText;
	
	@AndroidFindBy(id="btn_next")
	public WebElement banner2ArrowButton;
	
	//limitless
		@AndroidFindBy(xpath="//android.widget.TextView[@index='2']")
		public WebElement banner3HeaderText;
		
		@AndroidFindBy(id="actbtn_finish")
		public WebElement banner3TickButton;
		
		public Banners(WebDriver driver) throws InterruptedException {
	        this.driver = driver;
	      //  PageFactory.initElements(driver, this);
	       // logMessage("Initializing the "+this.getClass().getSimpleName()+" elements");
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        waitTime(1);
	    }

		
		public void clickOnBanner1Button(){
			try
		 
		 {
				
			if(banner1HeaderText.getText().equals("objective-driven")) {

				banner1ArrowButton.click();	
				log.info("clicked on clickOnBanner1Button...");
		 }
			 
			 }catch(Exception e){			 
			 System.out.println("Not in First Banner");
			 Assert.fail("Banner 1 is not available");
			 
			 }
			
		}

		public void clickOnBanner2Button(){
			try
		 
		 {
				
			if(banner2HeaderText.getText().equals("count")) {

				banner2ArrowButton.click();	
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
				
			if(banner3HeaderText.getText().equals("limitless")) {

				banner3TickButton.click();	
		 }
			 
			 }catch(Exception e){			 
			 System.out.println("Not in Third Banner");
			 Assert.fail("Banner 3 is not available");
			 
			 }
			
		}
}
