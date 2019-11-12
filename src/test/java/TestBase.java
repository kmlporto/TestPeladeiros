import arquitetura.drive.TLDriverFactory;
import arquitetura.models.Device;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class TestBase {
    protected Device device;

    public TestBase(String plattform, String plattformVersion, String deviceName, String udid){
        Device device = new Device(plattform, plattformVersion, deviceName, udid);
        this.device = device;
    }

    @BeforeClass
    public void set() throws MalformedURLException {
        TLDriverFactory.setDriver(  device.getPlattform(),
                                    device.getPlattformVersion(),
                                    device.getDeviceName(),
                                    device.getUdid());
    }

    @AfterClass
    public void end(){
        TLDriverFactory.endDriver();
    }

}
