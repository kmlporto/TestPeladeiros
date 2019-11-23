package edu.ifpb.peladeiros.arquitetura.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

public class Data implements Serializable {
    @SerializedName("dispositivos")
    ArrayList<Device> devices;

    public ArrayList<Device> getDevices() {
        return devices;
    }

}
