package com.bluetie.config;

import java.io.IOException;


import java.nio.file.Files;

import org.apache.commons.io.FileUtils;

// import com.bluetie.imageCompare.DeviceViewportModel;

import com.bluetie.utility.Utilities;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DeviceConfig {
	
	public static String executionPlatform;

    public static synchronized String getExecutionPlatform() {
        return executionPlatform;
    }

    public synchronized void setExecutionPlatform(String executionPlatform) {
        this.executionPlatform = executionPlatform;
    }

    public static IOSDeviceModel readIOSDeviceConfig() throws IOException {
        byte[] jsonData = null;
        ObjectMapper objectMapper = new ObjectMapper();
        jsonData = Files.readAllBytes(FileUtils.getFile(Utilities.getFile("iosDevice.json")).toPath());
        IOSDeviceModel[] iosDeviceModels = objectMapper.readValue(jsonData, IOSDeviceModel[].class);
        return new IOSDeviceModel(iosDeviceModels);
    }

    public static AndroidDeviceModel readAndroidDeviceConfig() throws IOException {
        byte[] jsonData = null;
        ObjectMapper objectMapper = new ObjectMapper();
        jsonData = Files.readAllBytes(FileUtils.getFile(Utilities.getFile("androidDevice.json")).toPath());
        AndroidDeviceModel[] androidDeviceModels = objectMapper.readValue(jsonData, AndroidDeviceModel[].class);
        return new AndroidDeviceModel(androidDeviceModels);
    }

//    public static DeviceViewportModel readDeviceViewportConfig() throws IOException {
//        byte[] jsonData = null;
//        ObjectMapper objectMapper = new ObjectMapper();
//        jsonData = Files.readAllBytes(FileUtils.getFile(FileUtility.getFile("deviceViewport.json")).toPath());
//        DeviceViewportModel[] deviceViewportModels = objectMapper.readValue(jsonData, DeviceViewportModel[].class);
//        return new DeviceViewportModel(deviceViewportModels);
//    }

}
