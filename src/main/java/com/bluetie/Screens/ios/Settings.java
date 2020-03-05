package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.bluetie.common.Base;
import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Settings extends Utilities {
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(Settings.class);
	//Manage Account
//	@AndroidFindBy(id = "tv_myAcc_accountSettings")
//	public MobileElement manageAccount;
	@iOSFindBy(accessibility="Manage Account")
	public MobileElement MANAGEACCOUNT;
	//subscription
	@AndroidFindBy(id = "tv_myAcc_subscriptionSettings")
	public MobileElement subscription;
	
	//invite professionals
	@AndroidFindBy(id = "tv_myAcc_referFriend")
	public MobileElement inviteProfessionals;
	
	//Redeem promocode
	@AndroidFindBy(id = "tv_myAcc_redeem_promo")
	public MobileElement reddemPromocode;

	//Help Centre
	@AndroidFindBy(id = "tv_myAcc_supportFAQ")
	public MobileElement helpCentre;
	
	//FeedBack
	@AndroidFindBy(id = "tv_myAcc_feedback")
	public MobileElement feedBack;
	
	public Settings(AppiumDriver<MobileElement> driver) throws InterruptedException {
        this.driver = driver;
      
       
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
       
    }
	
	//clicking on Menu
	public MyAccountSettings manageAccountClick() throws InterruptedException {
		
		try
		 
		 {
				
			if(MANAGEACCOUNT.isDisplayed()) {

				//manageAccount.click();
				tap(MANAGEACCOUNT);
				log.info("clicked on manageAccount" );
			
		 }
			 
			 }catch(Exception e){			 
				 log.info("Not able to click manageAccount");
			 Assert.fail("Not able to click manageAccount");
			 
			 }
			return new MyAccountSettings(driver);
	}
	
	
}
