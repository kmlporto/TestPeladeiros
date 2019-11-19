package edu.ifpb.peladeiros.arquitetura.dataProvider;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edu.ifpb.peladeiros.arquitetura.models.Data;
import edu.ifpb.peladeiros.arquitetura.models.Device;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Util {

    public static Object[][] toMatrix(ArrayList<Object[]> listOFLists) {
        Object[][] arr = new Object[listOFLists.size()][];
        int i = 0;
        for (Object[] row: listOFLists) {
            arr[i++] = row;
        }
        return  arr;
    }


    public static ArrayList<Device> JsonToObjectsDispositivo(FileReader file){
        Gson gson = new GsonBuilder().create();
        BufferedReader br = new BufferedReader(file);
        return gson.fromJson(br, Data.class).getDevices();
    }
}
