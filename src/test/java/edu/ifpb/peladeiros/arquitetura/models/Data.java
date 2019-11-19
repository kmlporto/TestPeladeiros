package edu.ifpb.peladeiros.arquitetura.models;

import java.util.ArrayList;

public class Data {
    ArrayList<Device> devices;

    public Data() {
        this.devices = new ArrayList<Device>();
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

}
