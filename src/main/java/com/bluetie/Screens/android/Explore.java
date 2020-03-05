package com.bluetie.Screens.android;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.common.Base;
import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Explore extends Utilities{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Explore.class);
	//clicking on Pass
		@AndroidFindBy(id="fabPass")
		public MobileElement clickingonPass;
		

		//Fetching Username
		@AndroidFindBy(id="tvUserName")
		public WebElement fetchingUserName;
		
		//Clicking on Reachout	
				@AndroidFindBy(id="fabReachOut")
				public WebElement clickingonReachout;
		
		//Fetching Designation
				@AndroidFindBy(id="tvDesignation")
				public WebElement fetchingDesignation;
		
				//Fetching CompanyName
				@AndroidFindBy(id="tvCompanyName")
				public WebElement fetchingCompanyName;
				
				//Fetching BaseLocation
				@AndroidFindBy(id="tvBaseLocation")
				public WebElement fetchingBaseLocation;
				
				//Fetching BluetiePin
				@AndroidFindBy(id="tvBlueTiePin")
				public WebElement fetchingBlueTiePin;
				
				
				public Explore(WebDriver driver) throws InterruptedException {
			        this.driver = driver;
			       
			       
			        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			        Utilities.waitTime(1);
			    }
				
				
				
		
}
