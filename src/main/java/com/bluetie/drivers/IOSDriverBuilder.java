package com.bluetie.drivers;

import java.io.IOException;


import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.bluetie.config.DeviceConfig;
import com.bluetie.config.IOSDeviceModel;

import com.bluetie.utility.Utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
//import static com.bluetie.logger.LoggingManager.logMessage;
public class IOSDriverBuilder extends DeviceConfig{
	
	AppiumDriver<MobileElement> driver;

    public IOSDriver<MobileElement> setupDriver(String model) throws IOException {
        DesiredCapabilities iosCapabilities = new DesiredCapabilities();
        IOSDeviceModel device = readIOSDeviceConfig().getIOSDeviceByName(model);
     //   logMessage("Received the " + model + " device configuration for execution");
        setExecutionPlatform(model);

        iosCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, device.getDeviceName());
        iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, device.getPlatformName());
        iosCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, device.getPlatformVersion());
        iosCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, device.getAutomationName());
        iosCapabilities.setCapability(MobileCapabilityType.UDID, device.getUdid());
        iosCapabilities.setCapability(MobileCapabilityType.NO_RESET, device.isReset());
        iosCapabilities.setCapability(MobileCapabilityType.APP, Utilities.getFile(device.getApp()).getAbsolutePath());
        iosCapabilities.setCapability("newCommandTimeout", 60);
	    
        iosCapabilities.setCapability("autoAcceptAlerts", true);
        iosCapabilities.setCapability("xcodeOrgId", "R8UKHMCW74"); 
        iosCapabilities.setCapability("xcodeSigningId", "iPhone Developer");
        iosCapabilities.setCapability("bundleId", "com.BlueTie.bluetiedev");
        //iosCapabilities.setCapability("unicodeKeyboard", true);
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), iosCapabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       // logMessage("IOS driver has been created for the " + model + " device");
        return (IOSDriver<MobileElement>) driver;
    }

}
