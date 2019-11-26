package edu.ifpb.peladeiros.tests;

import edu.ifpb.peladeiros.arquitetura.dataProvider.DataDevices;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class TestCadastro extends TestBase {

    @Factory(dataProvider = "getDevicesTest", dataProviderClass = DataDevices.class)
    public TestCadastro(String plattform, String plattformVersion, String deviceName, String udid) {
        super(plattform, plattformVersion, deviceName, udid);
    }



}
