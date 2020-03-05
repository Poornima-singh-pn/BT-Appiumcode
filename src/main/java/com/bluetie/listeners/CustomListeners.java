package com.bluetie.listeners;

import java.io.IOException;



import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.bluetie.common.Base;
import com.bluetie.utility.Utilities;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListeners extends Base implements ITestListener,ISuiteListener {
	//public String	messageBody;
	public void onFinish(ITestContext arg0) {
		
	}

	public void onStart(ITestContext arg0) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		String methodName=arg0.getName().toString().trim();
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		
//		try {
//		Utilities.captureScreenshot(methodName);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	//	test.log(LogStatus.FAIL, arg0.getName().toUpperCase()+" Failed with Exception :"+arg0.getThrowable());

	//	test.log(LogStatus.INFO, test.addScreenCapture(Utilities.mailscreenshotpath));
		
		Reporter.log("Click to see ScreenShot");
		Reporter.log("<a target =\"_blank\" href="+ Utilities.mailscreenshotpath+">screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target=\"_blank\" href="+ Utilities.mailscreenshotpath+"><img src="+ Utilities.mailscreenshotpath+"  height=200 width=200> </img></a>");
		
		rep.endTest(test);
		rep.flush();
		
		
	}

	public void onTestSkipped(ITestResult arg0) {
		test.log(LogStatus.SKIP, arg0.getName().toUpperCase() +"  Skipped the test as the Run mode is NO");		
		rep.endTest(test);
		rep.flush();
	}
 
	public void onTestStart(ITestResult arg0) {
		test=rep.startTest(arg0.getName().toUpperCase());
		
			
		 
	}

	public void onTestSuccess(ITestResult arg0) {
		test.log(LogStatus.PASS, arg0.getName().toUpperCase()+"PASS");
		rep.endTest(test);
		rep.flush();
	}

	public void onStart(ISuite suite) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ISuite suite) {
		/*MonitoringMail mail = new MonitoringMail();
	
		try {
			messageBody = "http://" + InetAddress.getLocalHost().getHostAddress()
					+ ":8080/job/DataDrivenLiveProject/Extent_Report/";
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		try {
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, messageBody);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 */	
		
		
/*Utilities.zip(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\screenshots");
		
		MonitoringMail mail = new MonitoringMail();
		try {
			
			mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to, TestConfig.subject, TestConfig.messageBody, TestConfig.attachmentPath, TestConfig.attachmentName);
		} catch (AddressException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}*/
	}
	}
