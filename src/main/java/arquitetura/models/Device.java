package arquitetura.models;

public class Device {
    String plattform, plattformVersion, deviceName, udid;

    public Device() {
    }

    public Device(String plattform, String plattformVersion, String deviceName, String udid) {
        this.plattform = plattform;
        this.plattformVersion = plattformVersion;
        this.deviceName = deviceName;
        this.udid = udid;
    }

    public String getPlattform() {
        return plattform;
    }

    public String getPlattformVersion() {
        return plattformVersion;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public String getUdid() {
        return udid;
    }

}
