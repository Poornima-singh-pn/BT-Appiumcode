package com.bluetie.Screens.android;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ExploreAnimations extends Utilities {
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(ExploreAnimations.class);
	//Homescreen animation
		@AndroidFindBy(id="btnStart")
		public WebElement homeAnimation;
	
		//Networking Objectives animation
	
		@AndroidFindBy(id="btnNext")
		public WebElement networkingObjectivesAnimation;
	
		//Applauded Fortes animation
		@AndroidFindBy(id="btnNext")
		public WebElement applaudedFortesAnimation;
			
		//Reachout animation
		@AndroidFindBy(id="btnNext")
		public WebElement reachoutAnimation;
		
		//Pass profile animation
		@AndroidFindBy(id="btnNext")
		public WebElement passProfileAnimation;
			
		//Undo Profile animation
		@AndroidFindBy(id="btnNext")
		public WebElement undoProfileAnimation;
		
		public ExploreAnimations(WebDriver driver) throws InterruptedException {
	        this.driver = driver;
	       	       
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        waitTime(1);
	    }	

		
		public void handlingExploreAnimations() {
			
			homeAnimation.click();
			 log.info("clicked on homeAnimation");
			 
			networkingObjectivesAnimation.click();
			log.info("clicked on networkingObjectivesAnimation");
			
			applaudedFortesAnimation.click();
			log.info("clicked on applaudedFortesAnimation");
			
			reachoutAnimation.click();
			log.info("clicked on reachoutAnimation");
			
			passProfileAnimation.click();
			log.info("clicked on passProfileAnimation");
			
			undoProfileAnimation.click();
			log.info("clicked on undoProfileAnimation");
			
			
			
			
			
		}
}
