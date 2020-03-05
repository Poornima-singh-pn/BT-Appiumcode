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

public class Step2 extends Utilities{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Step2.class);
			//Step2 Title
			@AndroidFindBy(id="tv_skills_title")
			public WebElement step2Title;
			
			//Skills TextBox
			
			@AndroidFindBy(id="enter_skills_et")
			public WebElement SkillTextBox;
			
			//Step2NextButton
			@AndroidFindBy(id="fab_next")
			public WebElement step2NextButton;
			
			public Step2(WebDriver driver) throws InterruptedException {
		        this.driver = driver;
		       	       
		        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		        waitTime(1);
		    }
			
			//selecting fortes
			public void selectingfortes(String fortetext,String forteexpectedtext) {
				
				String[] fortete=fortetext.split(",");
				String[] forteexpected=forteexpectedtext.split(",");
				
				try
				 
				 {
						
					if(step2Title.isDisplayed()) {

						//SkillTextBox.sendKeys(fortete[i]);
						for(int i=0;i<fortete.length;i++) {
							SkillTextBox.sendKeys(fortete[i]);
							log.info("entered forte text as " +fortetext);
							driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+forteexpected[i]+"']")).click();
						}
						
						waitTime(1);
						
						//driver.findElement(By.xpath("//android.widget.TextView[@text='Information Technology (IT)']")).click();
						
						//driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+forteexpectedtext+"']")).click();
				 
						
					}
					 
					 }catch(Exception e){			 
					
					Assert.fail("Not able to select expected forte");
					 }

				}
			
			
			//clicking on  step2 next
			public Step3 step2next() throws InterruptedException {
				
				
				try
				 
				 {
						
					if(step2NextButton.isDisplayed()) {

						step2NextButton.click();
						
						log.info("clicked on step2 next icon" );
				 }
					 
					 }catch(Exception e){			 
					
					Assert.fail("Not able to click step2 next icon");
					 }
					return new Step3(driver);
				}
}
