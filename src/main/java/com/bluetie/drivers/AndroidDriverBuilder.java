package com.bluetie.drivers;




//import static com.bluetie.logger.LoggingManager.logMessage;

import java.io.IOException;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.bluetie.config.AndroidDeviceModel;
import com.bluetie.config.DeviceConfig;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class AndroidDriverBuilder extends DeviceConfig {
	
	AndroidDriver<MobileElement> driver; 

    public AndroidDriver<MobileElement> setupDriver(String model) throws IOException {
        DesiredCapabilities androidCapabilities = new DesiredCapabilities();
        AndroidDeviceModel device = readAndroidDeviceConfig().getAndroidDeviceByName(model);
     //   logMessage("Received the " + model + " device configuration for execution");
        setExecutionPlatform(model);

        androidCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device.getDeviceName());
        androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, device.getPlatformName());
        androidCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, device.getPlatformVersion());
        androidCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, device.getAutomationName());
       
      //  androidCapabilities.setCapability(MobileCapabilityType.NO_RESET, device.isReset());
       // androidCapabilities.setCapability(MobileCapabilityType.APP, FileUtility.getFile(device.getApp()).getAbsolutePath());
        androidCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, device.getPackageName());
        androidCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, device.getActivity());
        androidCapabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), androidCapabilities);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
       // logMessage("Android driver has been created for the " + model + " device");
        return driver;
    }

}
