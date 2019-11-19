import arquitetura.dataProvider.DataDevices;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;
import page.PageInitial;

public class TestLogin extends TestBase{

    PageInitial pageInitial = new PageInitial();

    @Factory(dataProvider = "getDevicesTest", dataProviderClass = DataDevices.class)
    public TestLogin(String plattform, String plattformVersion, String deviceName, String udid) {
        super(plattform, plattformVersion, deviceName, udid);
    }

    @Test(enabled=false)
    public void loginSucess(){
        pageInitial.clickOnBtnEntrar();
        Assert.assertTrue(true);
    }
}
