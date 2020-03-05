package com.bluetie.Screens.ios;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class ExploreAnimations extends Utilities {
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(ExploreAnimations.class);
	//Homescreen animation
	@iOSFindBy(accessibility="Start")
	public MobileElement HOMESCREEN_BTN;
	
		//Networking Objectives animation
	
	@iOSFindBy(accessibility="Next")
		public MobileElement NETWORKINGOBJECTIVES_BTN;
	
		//Applauded Fortes animation
	@iOSFindBy(accessibility="Next")
		public MobileElement APPLAUDEDFORTES_BTN;
			
		//Reachout animation
	@iOSFindBy(accessibility="Next")
		public MobileElement REACHOUT_BTN;
		
		//Pass profile animation
	@iOSFindBy(accessibility="Next")
		public MobileElement PASSPROFILE_BTN;
			
		//Undo Profile animation
	@iOSFindBy(accessibility="Done")
		public MobileElement UNDOPROFILE_BTN;
		
		public ExploreAnimations(AppiumDriver<MobileElement> driver) throws InterruptedException {
	        this.driver = driver;
	           
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	       
	    }	

		
		public void handlingExploreAnimations() throws IOException {
			
		//	HOMESCREEN_BTN.click();
			tap(HOMESCREEN_BTN);
			 log.info("clicked on homeAnimation");
			 
			// NETWORKINGOBJECTIVES_BTN.click();
			 tap(NETWORKINGOBJECTIVES_BTN);
			log.info("clicked on networkingObjectivesAnimation");
			
			//APPLAUDEDFORTES_BTN.click();
			tap(APPLAUDEDFORTES_BTN);
			log.info("clicked on applaudedFortesAnimation");
			
			//REACHOUT_BTN.click();
			tap(REACHOUT_BTN);
			log.info("clicked on reachoutAnimation");
			
			//PASSPROFILE_BTN.click();
			tap(PASSPROFILE_BTN);
			log.info("clicked on passProfileAnimation");
			
			//UNDOPROFILE_BTN.click();
			tap(UNDOPROFILE_BTN);
			log.info("clicked on undoProfileAnimation");
			
			
			
			
			
		}
}
