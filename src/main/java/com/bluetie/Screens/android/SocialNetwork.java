package com.bluetie.Screens.android;

import org.apache.log4j.Logger;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.common.Base;
import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class SocialNetwork extends Utilities {
	
	private final Logger log = LoggerHelper.getLogger(SocialNetwork.class);
	//Already registered using email?
	@AndroidFindBy(id="tv_loginSignUp_alreadyHaveAcc")
	public WebElement signInButton;
	
	//LinkedIn Button
	@AndroidFindBy(id="btn_linkedInLogin")
	public WebElement linkedInButton;
	
	//FaceBookButton
	@AndroidFindBy(id="btn_facebook_login")
	public WebElement faceBookInButton;
	
	//GmailButton
	@AndroidFindBy(id="btn_gPlus")
	public WebElement GoogleButton;
	
	public SocialNetwork(WebDriver driver) throws InterruptedException {
        //this.driver = driver;
       
       
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        Utilities.waitTime(1);
    }
	
	
	
	public void googleClick() {
		
		try
		 
		 {
				
			if(GoogleButton.isDisplayed()) {

				GoogleButton.click();	
				
			
		 }
			 
			 }catch(Exception e){			 
			 System.out.println("Not able to found Google button");
			 Assert.fail("Not able to found Google button");
			 
			 }
			
	}
	
public void gmailLogin(String Gmail) {
		
		try
		 
		 {
				
			if(driver.findElement(By.xpath("//android.widget.TextView[@text='"+Gmail+"']")).isDisplayed()) {

				driver.findElement(By.xpath("//android.widget.TextView[@text='"+Gmail+"']")).click();	
				
				
		 }else {
			
			 Utilities.scrollToElementByXpath("//android.widget.TextView[@text='"+Gmail+"']");
				
				driver.findElement(By.xpath("//android.widget.TextView[@text='"+Gmail+"']")).click();
		 }
			 
			 }catch(Exception e){	
				 
				 driver.findElement(By.xpath("//android.widget.TextView[@text='"+Gmail+"']")).click();
			// Assert.fail(Gmail + "account is not present");
			 
			 }
			
	}
	
	
}
