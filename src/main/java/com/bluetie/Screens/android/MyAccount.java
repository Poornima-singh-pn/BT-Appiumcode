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

public class MyAccount extends Utilities{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(MyAccount.class);
	//MyAccount Title
	@AndroidFindBy(id = "headerValue")
	public WebElement myAccountTitle;
	
	// Menu
	@AndroidFindBy(id = "imgMenu")
	public WebElement menu;

	// Profile Edit
	@AndroidFindBy(id = "img_edit_profile")
	public WebElement profileEdit;

	// Profile Preview (Eye Icon)
	@AndroidFindBy(id = "profile_preview")
	public WebElement profileView;

	// Get BlueTie Prime Button Validation
		@AndroidFindBy(id = "btnGetBTPlus")
		public WebElement getBlueTiePrimeButton;

		//BlueTie pin validation
		@AndroidFindBy(id = "btPin")
		public WebElement blueTiePinValidation;
		
		//Username
				@AndroidFindBy(id = "txt_name")
				public WebElement userName;
				
				//Profile Progress Percentage
				@AndroidFindBy(id = "txt_progress")
				public WebElement profileProgressBar;
				
				//Profile Image
				@AndroidFindBy(id = "iv_default_avatar")
				public WebElement profileImage;
				
				//Profile Image Close icon
				@AndroidFindBy(id = "cancel")
				public WebElement profileImageCloseIcon;
				
				//Reachout sent count
				@AndroidFindBy(id = "txt_remain_count")
				public WebElement reachOutSentCount;
				
				//Total Number of Reachouts
				@AndroidFindBy(id = "txt_total_requ")
				public WebElement totalNumberofDe;
				
				//Count of Fortes selected
				@AndroidFindBy(id = "txt_remain_forte")
				public WebElement fortesSelected;
				
				//Total Number of Fortes Available
				@AndroidFindBy(id = "txt_total_requ")
				public WebElement reachOutTotal;
				
				//Referal Area -- Invite Now
				@AndroidFindBy(id = "lin_refer")
				public WebElement inviteNow;
				

				//Redeem Promocode
				@AndroidFindBy(xpath="//android.widget.TextView[@text='Redeem a promo code']")
				public WebElement redeemPromoCode;
				
				public MyAccount(WebDriver driver) throws InterruptedException {
			        this.driver = driver;
			       
			        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			        Utilities.waitTime(1);
			    }
				
				
				//clicking on Menu
				public Settings menuClick() throws InterruptedException {
					
					try
					 
					 {
							
						if(menu.isDisplayed()) {

							menu.click();	
							
							log.info("clicked on top right menu icon" );
					 }
						 
						 }catch(Exception e){			 
							 log.info("Not able to click menu");
						 Assert.fail("Not able to click menu");
						 
						 }
					return new Settings(driver);
				}
}
