package com.bluetie.Screens.ios;

import org.apache.log4j.Logger;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Step3 extends Utilities {
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(Step3.class);
	
	
	//Step3 Title
//	@AndroidFindBy(id="tv_userObjectives_title")
//	public WebElement step3Title;
	@iOSFindBy(accessibility="Almost Done!")
	public WebElement STEP3_TITLE;
	//Network Objective
	@AndroidFindBy(id="text")
	public WebElement networkObjectives;
	
	//Step3NextButton
	@iOSFindBy(accessibility="nextWhite")
	public WebElement STEP3_NEXT;
	
	public Step3(AppiumDriver<MobileElement> driver) throws InterruptedException {
        this.driver = driver;
       
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        
    }
	
	//selecting NetworkObjective
	public void selectingnetworkingObjective(String networkobjective) throws InterruptedException {
		
		String[] networkobject=networkobjective.split(",");
		
		try
		 
		 {
				
			
			// scrollToTopElement("//android.widget.TextView[@text='Almost Done!']");
			scrollToElementByname("Almost Done!");
			 for(int i=0;i<networkobject.length;i++) {
				// driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+networkobject[i]+"']")).click(); 
				 driver.findElement(By.name(networkobject[i])).click();
			 }
			
			 
				log.info("selected network objective is : " +networkobjective);

		 
			 
			 }catch(Exception e){			 
				
			Assert.fail("Not able to select Network Objective");
			 }

		}
	
	
	//clicking on  step3 next
	public Step4 step3next() throws InterruptedException {
		
		
		try
		 
		 {
				
			
			// scrollToElementByid("fab_next");
			scrollToElementByname("nextWhite");
			//STEP3_NEXT.click();
			tap(STEP3_NEXT);
		 
			 
			 }catch(Exception e){			 
			
			Assert.fail("Not able to click step3 next icon");
			 }
		return new Step4(driver);
		}

}
