package edu.ifpb.peladeiros.tests;

import edu.ifpb.peladeiros.arquitetura.drive.TLDriverFactory;
import edu.ifpb.peladeiros.arquitetura.models.Device;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class TestBase {
    protected Device device;

    public TestBase(String plattform, String plattformVersion, String deviceName, String udid){
        Device device = new Device(plattform, plattformVersion, deviceName, udid);
        this.device = device;
    }

    @BeforeMethod
    public void set(){
        try {
            TLDriverFactory.setDriver(  device.getPlattform(),
                                        device.getPlattformVersion(),
                                        device.getDeviceName(),
                                        device.getUdid());
        }catch (MalformedURLException e) {
            e.printStackTrace();

        }
    }

    @AfterMethod
    public void end(){
        TLDriverFactory.endDriver();
    }

}
