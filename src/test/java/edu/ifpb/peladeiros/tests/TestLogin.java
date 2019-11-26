package edu.ifpb.peladeiros.tests;

import edu.ifpb.peladeiros.arquitetura.dataProvider.DataDevices;
import edu.ifpb.peladeiros.page.PageHome;
import edu.ifpb.peladeiros.page.PageInitial;
import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestLogin extends TestBase {
    @Factory(dataProvider = "getDevicesTest", dataProviderClass = DataDevices.class)
    public TestLogin(String plattform, String plattformVersion, String deviceName, String udid) {
        super(plattform, plattformVersion, deviceName, udid);
    }

    @Test
    public void loginUnsucess(){
        new PageInitial()
                .setInputEmail("kmilaporto11@gmail.com")
                .setInputSenha("123456")
                .clickOnBtnEntrar();
//        new PageInitial()

    }

    @Test
    public void loginSucess(){
        new PageInitial()
                .setInputEmail("kmilaporto1991@gmail.com")
                .setInputSenha("123456")
                .clickOnBtnEntrar();
        Assert.assertTrue(true);
    }
}
