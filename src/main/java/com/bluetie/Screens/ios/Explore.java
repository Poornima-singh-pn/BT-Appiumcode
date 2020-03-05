package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.bluetie.common.Base;
import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Explore extends Utilities{
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(Explore.class);
	//clicking on Pass
		@AndroidFindBy(id="fabPass")
		public MobileElement clickingonPass;
		

		//Fetching Username
		@AndroidFindBy(id="tvUserName")
		public MobileElement fetchingUserName;
		
		//Clicking on Reachout	
				@AndroidFindBy(id="fabReachOut")
				public MobileElement clickingonReachout;
		
		//Fetching Designation
				@AndroidFindBy(id="tvDesignation")
				public MobileElement fetchingDesignation;
		
				//Fetching CompanyName
				@AndroidFindBy(id="tvCompanyName")
				public MobileElement fetchingCompanyName;
				
				//Fetching BaseLocation
				@AndroidFindBy(id="tvBaseLocation")
				public MobileElement fetchingBaseLocation;
				
				//Fetching BluetiePin
				@AndroidFindBy(id="tvBlueTiePin")
				public MobileElement fetchingBlueTiePin;
				
				
				public Explore(AppiumDriver<MobileElement> driver) throws InterruptedException {
			        this.driver = driver;
			       
			       
			        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			        
			    }
				
				
				
		
}
