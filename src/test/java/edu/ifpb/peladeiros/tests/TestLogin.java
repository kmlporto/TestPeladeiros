package edu.ifpb.peladeiros.tests;

import edu.ifpb.peladeiros.arquitetura.dataProvider.DataDevices;
import edu.ifpb.peladeiros.page.PageInitial;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {

    PageInitial pageInitial = new PageInitial();

    @Factory(dataProvider = "getDevicesTest", dataProviderClass = DataDevices.class)
    public TestLogin(String plattform, String plattformVersion, String deviceName, String udid) {
        super(plattform, plattformVersion, deviceName, udid);
    }

    @Test
    public void loginSucess(){
        pageInitial.clickOnBtnEntrar();
        Assert.assertTrue(true);
    }
}
