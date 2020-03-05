package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSFindBy;

public class AccountOverview extends Utilities {
	
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(MyAccount.class);

	// USERNAME
@iOSFindBy(xpath="//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	public MobileElement USERNAME;

// VIEW_DESIGNATION
	@iOSFindBy(xpath="//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
		public MobileElement DESIGNATION;
	
	// COMPANYNAME
			@iOSFindBy(xpath="//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[5]")
				public MobileElement COMPANYNAME;
			// LOCATION
			@iOSFindBy(xpath="//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
				public MobileElement LOCATION;	
			// LOCATION
			@iOSFindBy(xpath="//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
				public MobileElement BLUETIEPIN;	
			// Industry
						@iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Industry Experience\"]//following-sibling::XCUIElementTypeStaticText")
							public MobileElement INDUSTRYEXPERIENCE;	

}
