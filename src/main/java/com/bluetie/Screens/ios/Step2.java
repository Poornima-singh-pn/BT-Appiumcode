package com.bluetie.Screens.ios;


import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class Step2 extends Utilities{
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(Step2.class);
			//Step2 Title
//			@AndroidFindBy(id="tv_skills_title")
//			public MobileElement step2Title;
			@iOSFindBy(accessibility="Now, let's add some of your fortes")
			public MobileElement STEP2_TITLE;
			//Skills TextBox
			

			//Desingation
			@iOSFindBy(xpath="//XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
			public MobileElement FORTES;
			
			//Step2NextButton
			@iOSFindBy(accessibility="nextBlue")
			public MobileElement STEP2_NEXT;
			
			//click on done in keyboard
			@iOSFindBy(accessibility="Done")
			public MobileElement KEYBOARD_DONE;
			
			public Step2(AppiumDriver<MobileElement> driver) throws InterruptedException {
		        this.driver = driver;
		      	       
		        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		      
		    }
			
			//selecting fortes
			public void selectingfortes(String fortetext,String forteexpectedtext) {
				
				String[] fortete=fortetext.split(",");
				String[] forteexpected=forteexpectedtext.split(",");
				
				try
				 
				 {
						
					if(STEP2_TITLE.getText().equals("Now, let's add some of your fortes")) {

						//SkillTextBox.sendKeys(fortete[i]);
						for(int i=0;i<fortete.length;i++) {
							FORTES.sendKeys(fortete[i]);
							//setTextAs(FORTES,fortete[i]);
							
							log.info("entered forte text as " +fortete[i]);
							//driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='"+forteexpected[i]+"']")).click();
						driver.findElement(By.name(forteexpected[i])).click();
						
						clearText(FORTES);
						//KEYBOARD_DONE.click();
						//tap(KEYBOARD_DONE);
						
						}
						
						
						
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
						
					if(STEP2_NEXT.isDisplayed()) {

						//step2NextButton.click();
						tap(STEP2_NEXT);
						
						log.info("clicked on step2 next icon" );
				 }
					 
					 }catch(Exception e){			 
					
					Assert.fail("Not able to click step2 next icon");
					 }
					return new Step3(driver);
				}
}
