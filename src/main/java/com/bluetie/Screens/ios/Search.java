package com.bluetie.Screens.ios;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Search {
	AppiumDriver<MobileElement> driver;
	//Animation1
			@AndroidFindBy(id="btn_searchTutorialNext")
			public MobileElement animation1;

			//Animation2
			@AndroidFindBy(id="btn_searchTutorialNext")
			public MobileElement animation2;
			
			//Animation3
			@AndroidFindBy(id="btn_searchTutorialNext")
			public MobileElement animation3;
			
			//Animation4 i.e smart filters
			@AndroidFindBy(id="btn_searchTutorialNext")
			public MobileElement animation4;
			
			
}
