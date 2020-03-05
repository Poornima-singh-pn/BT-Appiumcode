package tests.ios;

import java.util.Hashtable;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;



import com.bluetie.Screens.ios.Step1;
import com.bluetie.Screens.ios.Step2;
import com.bluetie.Screens.ios.Step3;
import com.bluetie.Screens.ios.Step4;
import com.bluetie.Screens.ios.Step5;
import com.bluetie.common.Base;
import com.bluetie.utility.Utilities;

import io.appium.java_client.ios.IOSDriver;

public class StepsTest extends Base  {
		
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	
    public void registrationStepsTest(Hashtable<String ,String> data) throws Exception {
		if(data.get("runmode").equalsIgnoreCase("N")) {
			throw new SkipException("Skipping the testcase as the Runmode is NO");
		}
		//Utilities.waitTime(5);
		Step1 s1= new Step1(driver);
//		Utilities.waitTime(5);
		s1.UpdatingProfileImageByTakingPhoto();
		//Utilities.waitTime(5);
		
		
	//	s1.LocationAllow();
		//Utilities.waitTime(5);
		s1.enteringDesignation(data.get("designation"));
		//Utilities.waitTime(5);
		s1.enteringcompanyName(data.get("companyName"));
		//Utilities.waitTime(5);
		s1.industrydropdown();
		//Utilities.waitTime(5);
	s1.selectingIndustry(data.get("IndustryKey"), data.get("IndustryValue"));
		//Utilities.waitTime(5);
		s1.baseLocationEditButton();
	//	Utilities.waitTime(5);
		s1.selectinglocaiton(data.get("locationKey"), data.get("LocationValue"));
//		//Utilities.waitTime(5);
		Step2 s2 =s1.step1next();
		
		//Utilities.waitTime(5);
		s2.selectingfortes(data.get("forteKey"),data.get("forteValue"));
		((IOSDriver) driver).hideKeyboard();
	//	Utilities.waitTime(5);
		Step3 s3 =s2.step2next();
		//Utilities.waitTime(5);
	
	
		s3.selectingnetworkingObjective(data.get("networkObjective"));
		//Utilities.waitTime(5);
		Step4 s4=s3.step3next();
		
		Step5 s5=s4.donthavePromocodeText();
		//Utilities.waitTime(5);
			s5.TaptoStartNetworking();
        
    }

	
	
}
