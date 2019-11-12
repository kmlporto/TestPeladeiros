package arquitetura.dataProvider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import arquitetura.models.Data;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DataDevices {
    @DataProvider(name = "data-devices")
    public Object[][] getDevicesTest() throws FileNotFoundException {
        FileReader file = new FileReader("src/test/resources/dados/dispositivos.json");
        Gson gson = new GsonBuilder().create();
        BufferedReader br = new BufferedReader(file);
        Data dado = gson.fromJson(br, Data.class);
        return new Object[][]{{dado}};
    }
}
