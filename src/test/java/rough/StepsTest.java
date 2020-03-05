package rough;

import java.io.File;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;



import com.bluetie.Screens.android.Step2;
import com.bluetie.Screens.android.Step3;
import com.bluetie.Screens.android.Step4;
import com.bluetie.Screens.android.Step5;
import com.bluetie.Screens.ios.Banners;
import com.bluetie.Screens.ios.SocialNetwork;
import com.bluetie.Screens.ios.Step1;
import com.bluetie.common.Base;
import com.bluetie.utility.Utilities;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class StepsTest extends Base  {
	 public static String destDir;
	 public static DateFormat dateFormat;
	 public static String scrPath;	
	@Test(dataProviderClass=Utilities.class,dataProvider="dp")
	
    public void registrationStepsTest(Hashtable<String ,String> data) throws Exception {
		if(data.get("runmode").equalsIgnoreCase("N")) {
			throw new SkipException("Skipping the testcase as the Runmode is NO");
		}
		Utilities.waitTime(5);
//		Step1 s1= new Step1(driver);
//		Utilities.waitTime(5);
//		s1.UpdatingProfileImageByTakingPhoto();
//		Utilities.waitTime(5);
//		s1.enteringDesignation(data.get("designation"));
//		Utilities.waitTime(5);
//		s1.enteringcompanyName(data.get("companyName"));
//		Utilities.waitTime(5);
//		s1.industrydropdown();
//		Utilities.waitTime(5);
//	s1.selectingIndustry(data.get("IndustryKey"), data.get("IndustryValue"));
//		Utilities.waitTime(5);
//		s1.baseLocationEditButton();
//		Utilities.waitTime(5);
//		s1.selectinglocaiton(data.get("locationKey"), data.get("LocationValue"));
//		Utilities.waitTime(5);
//		Step2 s2 =s1.step1next();
//		
//		
//		Utilities.waitTime(5);
//		s2.selectingfortes(data.get("forteKey"),data.get("forteValue"));
//		Utilities.waitTime(5);
//		Step3 s3 =s2.step2next();
//		Utilities.waitTime(5);
		
		Banners banner = new Banners(driver);
		banner.clickOnBanner1Button();
		banner.clickOnBanner2Button();
		banner.clickOnBanner3Button();
		
		SocialNetwork login =new SocialNetwork(driver);
		Utilities.waitTime(5);
		login.googleClick();
		Utilities.waitTime(5);
		 login.gmailLogin("sreehari4a15@gmail.com");
		 Utilities.waitTime(5);
		 Step1 s1=new Step1(driver);
		 Utilities.waitTime(5);
		 s1.enteringDesignation(data.get("designation"));
			Utilities.waitTime(5);
			s1.enteringcompanyName(data.get("companyName"));
			Utilities.waitTime(5);
			s1.industrydropdown();
			Utilities.waitTime(5);
		Step3 s3= new Step3(driver);
		Utilities.waitTime(5);
		s3.selectingnetworkingObjective(data.get("networkObjective"));
		Utilities.captureScreenshot("step3");
		String TextInImage=Utilities.OCR(Utilities.mailscreenshotpath);
		System.out.println("The Text in image is :"+TextInImage);
		
//		Step4 s4=s3.step3next();
//		Step5 s5=s4.donthavePromocodeText();
//		
//			s5.TaptoStartNetworking();
//        
    }

	

	

	
}
