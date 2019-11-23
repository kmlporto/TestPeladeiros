package edu.ifpb.peladeiros.arquitetura.models;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Device implements Serializable {
    String plattform, plattformVersion, deviceName, udid;

    public Device(String plattform, String plattformVersion, String deviceName, String udid) {
        this.plattform = plattform;
        this.plattformVersion = plattformVersion;
        this.deviceName = deviceName;
        this.udid = udid;
    }

    @SerializedName("platform")
    public String getPlattform() {
        return plattform;
    }

    @SerializedName("platformVersion")
    public String getPlattformVersion() {
        return plattformVersion;
    }

    @SerializedName("deviceName")
    public String getDeviceName() {
        return deviceName;
    }

    @SerializedName("udid")
    public String getUdid() {
        return udid;
    }

}
