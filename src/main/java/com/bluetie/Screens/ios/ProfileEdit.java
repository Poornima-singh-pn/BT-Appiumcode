package com.bluetie.Screens.ios;



import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ProfileEdit extends Utilities {
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(ProfileEdit.class);
	// FirstName
	@iOSFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[5]")
	public MobileElement FIRST_NAME;

	// LASTNAME
	@iOSFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[1]")
	public MobileElement LAST_NAME;

	// DESIGNATION
	@iOSFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[2]")
	public MobileElement DESIGNATION;

	// COMPANYNAME
	@iOSFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[3]")
	public MobileElement COMPANYNAME;

	// LOCATION
	@iOSFindBy(xpath = "//XCUIElementTypeCell[1]/XCUIElementTypeStaticText[4]")
	public MobileElement LOCATION;

	// BLUETIEPIN
	@iOSFindBy(xpath = "//XCUIElementTypeCell[2]/XCUIElementTypeStaticText[1]")
	public MobileElement BLUETIEPIN;

	// INDUSTRYEXPERIENCE
	@iOSFindBy(xpath = "//XCUIElementTypeCell[4]/XCUIElementTypeStaticText[1]//following-sibling::XCUIElementTypeStaticText")
	public MobileElement INDUSTRYEXPERIENCE;

	// INDUSTRYEXPERIENCE
	@iOSFindBy(xpath = "//XCUIElementTypeCell[5]/XCUIElementTypeStaticText[1]//following-sibling::XCUIElementTypeStaticText")
	public MobileElement NETWORKINGOBJECTIVE;

	// FORTE1
	@iOSFindBy(xpath = "//XCUIElementTypeCell[7]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	public MobileElement FORTE1;

	// FORTE2
	@iOSFindBy(xpath = "//XCUIElementTypeCell[7]/XCUIElementTypeOther/XCUIElementTypeStaticText[1]")
	public MobileElement FORTE2;

	// WORKEXPERIENCE
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Work Experience\"]//following-sibling::XCUIElementTypeStaticText")
	public MobileElement WORKEXPERIENCE;

	// LINKSADD
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Links\"]//following-sibling::XCUIElementTypeButton")
	public MobileElement LINKSADD;

	// PROFESSIONALCATALOGUEADD
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Professional Catalogue\"]//following-sibling::XCUIElementTypeButton")
	public MobileElement PROFESSIONALCATALOGUEADD;
	

	// EDUCATIONAL DETAILS ADD
	@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Professional Catalogue\"]//following-sibling::XCUIElementTypeButton")
	public MobileElement EDUCATIONAL_DETAILS_ADD;
	
	//ACHIEVEMENTS
	
	public static String ACHIEVEMENTS="ACHIEVEMENTS";
	
	// ACHIEVEMENTS ADD
		@iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Achievements\"]//following-sibling::XCUIElementTypeButton")
		public MobileElement ACHIEVEMENTS_ADD;
		
		public ProfileEdit(AppiumDriver<MobileElement> driver) throws InterruptedException {
	        this.driver = driver;
	       
	       
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	       
	    }	
	
		
		//Click on Add Achievements
				public void AddAchievements() throws InterruptedException {
					
					
					try
					 
					 {
							
						
						scrollToElementByid(ACHIEVEMENTS);
						
					 tap(EDUCATIONAL_DETAILS_ADD);
						 log.info("clicked on achievements add buttion" );
						 }catch(Exception e){			 
						
						Assert.fail("Not able to click achievements add icon");
						 }
					
					}
		
	
}
