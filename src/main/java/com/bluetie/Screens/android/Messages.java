package com.bluetie.Screens.android;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Messages extends Utilities {

	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(MyAccountSettings.class);
	//Help Centre
			@AndroidFindBy(id = "headerValue")
			public WebElement headerTitle;
	
			
}
