package edu.ifpb.peladeiros.arquitetura.drive;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

public class ManagerDrive {

    public DesiredCapabilities getDriverAndroid(String plattformVersion, String deviceName, String udid){
        File f = new File("src/test/resources/apps/peladeiros.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", f.getAbsolutePath());
        capabilities.setPlatform(Platform.ANDROID);
        capabilities.setCapability("platformVersion", plattformVersion);
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("udid", udid);
        capabilities.setCapability("automationName", "UiAutomator2");
        return capabilities;
    }


    public DesiredCapabilities getDriveIOs(String plattformVersion, String deviceName, String udid){
        File f = new File("/src/test/resources/apps/peladeiros.ipa");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", f.getAbsolutePath());
        capabilities.setPlatform(Platform.IOS);;
        capabilities.setCapability("platformVersion", plattformVersion);
        capabilities.setCapability("deviceName", deviceName);
        capabilities.setCapability("udid", udid);
        capabilities.setCapability("automationName", "XCUITest");
        capabilities.setCapability("xcodeOrgId", "<Team ID>");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        return capabilities;
    }
}
