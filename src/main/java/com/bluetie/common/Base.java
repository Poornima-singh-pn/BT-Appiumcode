package com.bluetie.common;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import org.testng.annotations.AfterSuite;

import org.testng.annotations.BeforeSuite;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.bluetie.drivers.AndroidDriverBuilder;
import com.bluetie.drivers.IOSDriverBuilder;

import com.bluetie.enums.PlatformName;
import com.bluetie.enums.PlatformType;
import com.bluetie.utility.AppiumServer;
import com.bluetie.utility.ExcelReader;
import com.bluetie.utility.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class Base {
	public static Properties prop;
	public static AppiumDriver<MobileElement> driver;
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"//src//test//resources//testdata//testdata.xlsx");
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	public static final Logger logger = Logger.getLogger(Base.class.getName());
	
	public Base() {
        try {
            prop = new Properties();
            FileInputStream inputStream = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/Properties/config.properties");
            prop.load(inputStream);

           

        } catch (FileNotFoundException Ex) {
            logger.info("File not found: " + Ex.getMessage());

        } catch (IOException Ex) {
            logger.info("Exception occurred: " + Ex.getMessage());
        }
    }
	
    @Parameters({"platformType", "platformName", "model"})
    @BeforeSuite
    public void startAppiumServer(String platformType, @Optional String platformName, @Optional String model) throws IOException {
        if (platformType.equalsIgnoreCase(PlatformType.MOBILE.toString())) {
          //  killExistingAppiumProcess();
            if (AppiumServer.appium == null || !AppiumServer.appium.isRunning()) {
                AppiumServer.start();
                if (platformType.equalsIgnoreCase(PlatformType.MOBILE.toString())) {
                    setupMobileDriver(platformName, model);
                }else {
                	System.out.println("It is not a mobile");
                }
                logger.info("Appium server has been started");
               // logger.debug("Appium server started");
            }
        }
    }

    @Parameters({"platformType", "platformName"})
    @AfterSuite
    public void stopAppiumServer(String platformType, @Optional String platformName) throws IOException {
        if (platformType.equalsIgnoreCase(PlatformType.MOBILE.toString())) {
            if (AppiumServer.appium != null || AppiumServer.appium.isRunning()) {
            	 driver.quit();
                AppiumServer.stop();
                logger.info("Appium server has been stopped");
                //logger.debug("Appium server stopped");
            }
        }
    }

    @Parameters({"platformType", "platformName", "model"})
    
    public void setupDriver(String platformType, String platformName, @Optional String model) throws IOException {
         if (platformType.equalsIgnoreCase(PlatformType.MOBILE.toString())) {
            setupMobileDriver(platformName, model);
        }else {
        	System.out.println("It is not a mobile");
        }
    }

    public void setupMobileDriver(String platformName, String model) throws IOException {
        if (platformName.equalsIgnoreCase(PlatformName.ANDROID.toString())) {
            driver = new AndroidDriverBuilder().setupDriver(model);
        } else if (platformName.equalsIgnoreCase(PlatformName.IOS.toString())) {
            driver = new IOSDriverBuilder().setupDriver(model);
        }
        logger.info(model + " driver has been created for execution");
    }



//    @AfterMethod
//    public void teardownDriver() {
//        driver.quit();
//        //logMessage("Driver has been quit from execution");
//    }

//    private void killExistingAppiumProcess() throws IOException {
//        Runtime.getRuntime().exec("killall node");
//        logger.info("Killing existing appium process");
//    }
}
