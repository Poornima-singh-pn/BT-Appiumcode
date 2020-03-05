package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;
import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.bluetie.common.Base;
import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class SocialNetwork extends Utilities {
	
	private final Logger log = LoggerHelper.getLogger(SocialNetwork.class);
	//Already registered using email?
	@AndroidFindBy(id="tv_loginSignUp_alreadyHaveAcc")
	public MobileElement signInButton;
	
	//LinkedIn Button
	@AndroidFindBy(id="btn_linkedInLogin")
	public MobileElement linkedInButton;
	
	//FaceBookButton
	@AndroidFindBy(id="btn_facebook_login")
	public MobileElement faceBookInButton;
	
	
	@iOSFindBy(accessibility="google")
	public MobileElement GOOGLE_BTN;
	
	public SocialNetwork(AppiumDriver<MobileElement> driver) throws InterruptedException {
        //this.driver = driver;
     
       
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
       
    }
	
	
	
	public void googleClick() {
		
		try
		 
		 {
				
			if(GOOGLE_BTN.isDisplayed()) {

				//GoogleButton.click();	
				tap(GOOGLE_BTN);
				
			
		 }
			 
			 }catch(Exception e){			 
			 System.out.println("Not able to found Google button");
			 Assert.fail("Not able to found Google button");
			 
			 }
			
	}
	
public void gmailLogin(String Gmail) {
		
		try
		 
		 {
				
			if(driver.findElement(By.name(Gmail)).isDisplayed()) {
				
				driver.findElement(By.name(Gmail)).click();	
				
				
		 }else {
			
			 scrollToElementByname(Gmail);
				
			 driver.findElement(By.name(Gmail)).click();
		 }
			 
			 }catch(Exception e){	
				 
				 driver.findElement(By.name(Gmail)).click();
			// Assert.fail(Gmail + "account is not present");
			 
			 }
			
	}
	
	
}
