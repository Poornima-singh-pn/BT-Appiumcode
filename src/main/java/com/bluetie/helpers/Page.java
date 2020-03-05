package com.bluetie.helpers;

import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Page {
	
	AndroidDriver<AndroidElement> driver;

	    public void clickElement(WebElement eleSignInBtn) {
	        eleSignInBtn.click();
	    }

	    public String getText(WebElement elePageTitle) {
	        return elePageTitle.getText();
	    }

	    public void enterText(WebElement element, String value) {
	        element.sendKeys(value);
	    }

}
