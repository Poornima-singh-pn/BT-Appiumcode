package com.bluetie.Screens.android;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Step3 extends Utilities {
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Step3.class);
	
	
	//Step3 Title
	@AndroidFindBy(id="tv_userObjectives_title")
	public WebElement step3Title;
	
	//Network Objective
	@AndroidFindBy(id="text")
	public WebElement networkObjectives;
	
	//Step3NextButton
	@AndroidFindBy(id="fab_next")
	public WebElement step3NextButton;
	
	public Step3(WebDriver driver) throws InterruptedException {
        this.driver = driver;
       
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        waitTime(1);
    }
	
	//selecting NetworkObjective
	public void selectingnetworkingObjective(String networkobjective) throws InterruptedException {
		
		String[] networkobject=networkobjective.split(",");
		
		try
		 
		 {
				
			
			 scrollToTopElement("//android.widget.TextView[@text='Almost Done!']");
			 for(int i=0;i<networkobject.length;i++) {
				 driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+networkobject[i]+"']")).click(); 
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
				
			
			 scrollToElementByid("fab_next");
			 step3NextButton.click();
		 
			 
			 }catch(Exception e){			 
			
			Assert.fail("Not able to click step3 next icon");
			 }
		return new Step4(driver);
		}

}
