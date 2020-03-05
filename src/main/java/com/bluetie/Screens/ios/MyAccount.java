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

public class MyAccount extends Utilities {
	AppiumDriver<MobileElement> driver;
	private final Logger log = LoggerHelper.getLogger(MyAccount.class);
	// MyAccount Title
	@AndroidFindBy(id = "headerValue")
	public MobileElement myAccountTitle;

	// MENU
	@iOSFindBy(accessibility = "side menu")
	public MobileElement MENU_ICON;

	// Profile Edit
	@iOSFindBy(accessibility = "edit profile")
	public MobileElement PROFILE_EDIT;

	// Profile Edit
	@iOSFindBy(accessibility = "eye white")
	public MobileElement EYE_ICON;




	public MyAccount(AppiumDriver<MobileElement> driver) throws InterruptedException {
		this.driver = driver;

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	// clicking on Menu
	public Settings menuClick() throws InterruptedException {

		try

		{

			if (MENU_ICON.isDisplayed()) {

				// menu.click();
				tap(MENU_ICON);

				log.info("clicked on top right menu icon");
			}

		} catch (Exception e) {
			log.info("Not able to click menu");
			Assert.fail("Not able to click menu");

		}
		return new Settings(driver);
	}
}
