package arquitetura.drive;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class TLDriverFactory {
    private final static String appiumURL = "http://localhost:4444/wd/hub";
    private static ManagerDrive managerDrive = new ManagerDrive();
    private static ThreadLocal<AppiumDriver> threadLocal= new ThreadLocal<AppiumDriver>();

    public synchronized static void setDriver(String plattform, String plattformVersion, String deviceName, String udid)
            throws MalformedURLException {
        if(plattform.equals("Android")){
            threadLocal.set(
                new AndroidDriver<MobileElement>(
                        new URL(appiumURL),
                        managerDrive.getDriverAndroid(plattformVersion, deviceName, udid)
                )
            );

        }else{
            threadLocal.set(
                    new IOSDriver<MobileElement>(
                            new URL(appiumURL),
                            managerDrive.getDriverAndroid(plattformVersion, deviceName, udid)
                    )
            );
        }
    }

    public synchronized static WebDriverWait getWait (AppiumDriver driver){
        return new WebDriverWait(driver, 20);
    }

    public synchronized static AppiumDriver getDriver() {
        return threadLocal.get();
    }

    public synchronized static void endDriver(){
        threadLocal.get().quit();
        threadLocal.remove();
    }
}
