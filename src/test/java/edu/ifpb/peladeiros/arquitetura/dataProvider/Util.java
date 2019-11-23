package edu.ifpb.peladeiros.arquitetura.dataProvider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.ifpb.peladeiros.arquitetura.models.Data;
import edu.ifpb.peladeiros.arquitetura.models.Device;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public static Object[][] toMatrix(ArrayList<Object[]> listOFLists) {
        Object[][] arr = new Object[listOFLists.size()][];
        int i = 0;
        for (Object[] row: listOFLists) {
            arr[i++] = row;
        }
        return  arr;
    }


    public static ArrayList<Device> JsonToObjectsDispositivo(String fileName) {
        ArrayList<Device> devices = new ArrayList<>();
        try {
            Gson gson = new GsonBuilder().create();
            FileReader file = new FileReader(fileName);
            BufferedReader br = new BufferedReader(file);
            devices = gson.fromJson(br, Data.class).getDevices();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return devices;
    }
}
