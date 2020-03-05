package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;


import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Messages extends Utilities {

	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(MyAccountSettings.class);
	//Help Centre
			@AndroidFindBy(id = "headerValue")
			public MobileElement headerTitle;
	
			
}
