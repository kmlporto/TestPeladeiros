package arquitetura.dataProvider;

import arquitetura.models.Device;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import arquitetura.models.Data;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class DataDevices {

    @DataProvider(parallel = true)
    public Object[][] getDevicesTest() throws FileNotFoundException {
        FileReader file = new FileReader("src/test/resources/dados/dispositivos.json");
        Gson gson = new GsonBuilder().create();
        BufferedReader br = new BufferedReader(file);
        Data dado = gson.fromJson(br, Data.class);
        ArrayList<Device> devices = dado.getDevices();

        ArrayList<Object[]> objects = new ArrayList<Object[]>();

        for (Device d : devices){
            Object[] obj = new Object[] {d.getPlattform(), d.getPlattformVersion(), d.getDeviceName(), d.getUdid()};
            objects.add(obj);
        }

        Object[][] matrixObjects = Convert.toMatrix(objects);

        return matrixObjects;
    }

    @Test(dataProvider = "getDevicesTest", dataProviderClass = DataDevices.class)
    public void test() throws FileNotFoundException {
        Assert.assertTrue(true);
    }
}
