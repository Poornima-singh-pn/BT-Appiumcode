package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Achievements extends Utilities{
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(MyAccount.class);

	// Title
  @iOSFindBy(xpath="//XCUIElementTypeOther[@name=\"Achievements\"]")
	public MobileElement ACHIEVEMENTS_TITLE;

//Title
 @iOSFindBy(xpath="//XCUIElementTypeStaticText[@name=\"Share your Professional Milestones\"]//following-sibling::XCUIElementTypeTextField")
	public MobileElement ACHIEVEMENTS_TEXTBOX;
 //SAVE
 @iOSFindBy(accessibility="Save")
	public MobileElement SAVE;

//Add achievements
@iOSFindBy(accessibility="Add Achievement")
	public MobileElement ADD_ACHIEVEMENT;

//EDIT achievements
@iOSFindBy(accessibility="Pencil Blue")
	public MobileElement EDIT_ACHIEVEMENT;

//DELETE achievements
@iOSFindBy(accessibility="delete icon")
	public MobileElement DELETE_ACHIEVEMENT;
	
public Achievements(AppiumDriver<MobileElement> driver) throws InterruptedException {
    this.driver = driver;
   
   
    PageFactory.initElements(new AppiumFieldDecorator(driver), this);
   
}

public void clickOnExploreModuleIcon(String acheivements){
	try
 
 {
		
	if(ACHIEVEMENTS_TITLE.isDisplayed()) {

		setTextAs(ACHIEVEMENTS_TEXTBOX,acheivements);
		log.info("Entered the achievements...");
 }
	 
	 }catch(Exception e){			 
		 log.error("Not able to enter achievements");
	 Assert.fail("Not able to enter achievements");
	 }
	
}

//CLICK ON SAVE
public void clickOnSave(){
	try
 
 {
		
	if(SAVE.isDisplayed()) {

		tap(SAVE);
		log.info("Clicked on Save Button...");
 }
	 
	 }catch(Exception e){			 
		 log.error("Not able to Click Save Button");
	 Assert.fail("Not able to Click Save Button");
	 }
	
}

//CLICK ON ADD ACHIEVEMENTS
public void clickOnAddAchievements(){
	try
 
 {
		
	if(ADD_ACHIEVEMENT.isDisplayed()) {

		tap(ADD_ACHIEVEMENT);
		log.info("Clicked on ADD ACHIEVEMENTS...");
 }
	 
	 }catch(Exception e){			 
		 log.error("Not able to Click ADD ACHIEVEMENTS");
	 Assert.fail("Not able to Click SADD ACHIEVEMENTS");
	 }
	
}



}
