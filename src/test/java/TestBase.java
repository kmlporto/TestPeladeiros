import arquitetura.drive.TLDriverFactory;
import arquitetura.models.Device;
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
    public void set() throws MalformedURLException {
        TLDriverFactory.setDriver(  device.getPlattform(),
                                    device.getPlattformVersion(),
                                    device.getDeviceName(),
                                    device.getUdid());
    }

    @AfterMethod
    public void end(){
        TLDriverFactory.endDriver();
    }

}
