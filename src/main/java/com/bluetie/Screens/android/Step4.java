package com.bluetie.Screens.android;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.bluetie.helper.Logger.LoggerHelper;
import com.bluetie.utility.Utilities;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Step4 extends Utilities{
	WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Step4.class);
	//Step4 Title
	@AndroidFindBy(xpath="//android.widget.TextView[@text='invite or promo code?']")
	public WebElement step4HeaderTitle;
	
	//Dont have promocode
	@AndroidFindBy(id="txtDontHaveCode")
	public WebElement dontHavePromocode;
		
	// promocode/Invitecode Textbox
	@AndroidFindBy(id="edtCode")
	public WebElement codeTextBox;
		
	// Apply promocode Button
		@AndroidFindBy(id="btnApplyCode")
		public WebElement applyPromoCodeButton;
		
		
		public Step4(WebDriver driver) throws InterruptedException {
	        this.driver = driver;
	      
	        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        waitTime(1);
	    }
		
		//clicking on  step3 next
		public Step5 donthavePromocodeText() throws InterruptedException {
			
			
			try
			 
			 {
					
				scrollToElementByid("txtDontHaveCode");
				
				 dontHavePromocode.click();
				 log.info("clicked on dont have promocodelink" );
				 
				 }catch(Exception e){			 
				
				Assert.fail("Not able to click dontHavePromocode link");
				 }
			return new Step5(driver);
			}
}
