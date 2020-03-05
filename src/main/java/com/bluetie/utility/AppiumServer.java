package com.bluetie.utility;

import java.io.File;

import java.io.IOException;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
//import static com.bluetie.logger.LoggingManager.logMessage;

public class AppiumServer {
	
	public static AppiumDriverLocalService appium;

    public static void start() throws IOException {
        AppiumServiceBuilder builder = new AppiumServiceBuilder()
                .withAppiumJS(new File("C:\\Program Files (x86)\\Appium\\resources\\app\\node_modules\\appium\\build\\lib\\main.js"))
                .withArgument(GeneralServerFlag.SESSION_OVERRIDE);
        appium = builder.build();
        appium.start();
       // logMessage("Appium server has been started");
    }

    public static void stop() throws IOException {
        appium.stop();
       // logMessage("Appium server has been stopped");
    }

}
