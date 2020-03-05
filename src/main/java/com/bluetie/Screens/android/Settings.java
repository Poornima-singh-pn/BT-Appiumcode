package com.bluetie.Screens.android;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.common.Base;
import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Settings extends Utilities {
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Settings.class);
	//Manage Account
	@AndroidFindBy(id = "tv_myAcc_accountSettings")
	public WebElement manageAccount;
	
	//subscription
	@AndroidFindBy(id = "tv_myAcc_subscriptionSettings")
	public WebElement subscription;
	
	//invite professionals
	@AndroidFindBy(id = "tv_myAcc_referFriend")
	public WebElement inviteProfessionals;
	
	//Redeem promocode
	@AndroidFindBy(id = "tv_myAcc_redeem_promo")
	public WebElement reddemPromocode;

	//Help Centre
	@AndroidFindBy(id = "tv_myAcc_supportFAQ")
	public WebElement helpCentre;
	
	//FeedBack
	@AndroidFindBy(id = "tv_myAcc_feedback")
	public WebElement feedBack;
	
	public Settings(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        
       
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        Utilities.waitTime(1);
    }
	
	//clicking on Menu
	public MyAccountSettings manageAccountClick() throws InterruptedException {
		
		try
		 
		 {
				
			if(manageAccount.isDisplayed()) {

				manageAccount.click();	
				log.info("clicked on manageAccount" );
			
		 }
			 
			 }catch(Exception e){			 
				 log.info("Not able to click manageAccount");
			 Assert.fail("Not able to click manageAccount");
			 
			 }
			return new MyAccountSettings(driver);
	}
	
	
}
