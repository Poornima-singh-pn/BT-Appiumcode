package tests.ios;

import java.util.Hashtable;


import org.testng.SkipException;

import org.testng.annotations.Test;

import com.bluetie.Screens.ios.SocialNetwork;
import com.bluetie.common.Base;
import com.bluetie.utility.Utilities;


public class signinTest extends Base{
	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	public void logintest(Hashtable<String ,String> data) throws InterruptedException {
		if(data.get("runmode").equalsIgnoreCase("N")) {
		throw new SkipException("Skipping the testcase as the Runmode is NO");
	}
		System.out.println("logintest is started executing");
		//Thread.sleep(3000);
		SocialNetwork login =new SocialNetwork(driver);
	//	Utilities.waitTime(5);
		login.googleClick();
		Utilities.waitTime(5);
		 login.gmailLogin(data.get("Username"));
		//loginpage.ignore();
	}
}


