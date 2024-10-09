import jdk.dynalink.linker.LinkerServices;

import java.until.List;
import java.util.List;
import java.util.Random;

public class NetworkDevice {
    private String modelName;
    private String deviceName;

    private String macAddress;
    private String ipV4;
    private String ipV6;
    private List<String> connections;

    private int vlan;

    private List<Module> modules;

    /* Network Devicce PC */
    public NetworkDevice(String deviceName, String macAddress, String ipV4, List<String> connections, int vlan, List<Module> modules) {
        this.modelName = "Netlab Router";
        this.deviceName = deviceName;
        this.macAddress = macAddress;
        this.ipV4 = ipV4;
        this.connections = connections;
        this.modules = modules;
    }

    /* Network Device Switch */
    public NetworkDevice(String deviceName, String macAddress, int vlan) {
        this.modelName = "Netlab Switch";
        this.deviceName = deviceName;
        this.macAddress = macAddress;
        this.vlan = vlan;
    }

    /* Network Device PC */
    public NetworkDevice(String deviceName, String macAddress, int vlan, String ipV4) {
        this.modelName = "Netlab PC";
        this.deviceName = deviceName;
        this.macAddress = macAddress;
        this.ipV4 = ipV4;
    }
}
