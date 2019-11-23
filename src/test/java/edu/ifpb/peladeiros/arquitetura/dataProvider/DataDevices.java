package edu.ifpb.peladeiros.arquitetura.dataProvider;

import edu.ifpb.peladeiros.arquitetura.models.Device;
import org.testng.annotations.DataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataDevices {

    @DataProvider
    public Object[][] getDevicesTest() throws FileNotFoundException {
        String file = "src/test/resources/dados/dispositivos.json";
        ArrayList<Device> devices = Util.JsonToObjectsDispositivo(file);

        ArrayList<Object[]> objects = new ArrayList<Object[]>();

        for (Device d : devices){
            Object[] obj = new Object[] {d.getPlattform(), d.getPlattformVersion(), d.getDeviceName(), d.getUdid()};
            objects.add(obj);
        }

        Object[][] matrixObjects = Util.toMatrix(objects);

        return matrixObjects;
    }

}
