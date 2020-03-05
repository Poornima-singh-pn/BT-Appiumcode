package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class EducationalDetails extends Utilities{
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(EducationalDetails.class);

	// Title
	  @iOSFindBy(xpath="//XCUIElementTypeOther[@name=\"Education\"]")
		public MobileElement EDUCATION_TITLE;

	
	public EducationalDetails(AppiumDriver<MobileElement> driver) throws InterruptedException {
	    this.driver = driver;
	   
	   
	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	   
	}
}
