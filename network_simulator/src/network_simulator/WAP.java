package network_simulator;

import java.util.ArrayList;

/**
 * @author 1516392
 */

public class WAP {
    //This variable is set during the connection process, and it is taken from the NetworkDevices ArrayList
    private String ipaddress;
    private final ArrayList<String> connectedWirelessMACs;
    
    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    //For each device who's boolean "online = true" and "nodetype = laptop" or "nodetype = mobile device", add the respective MAC to this
    //Either go through the ArrayList and check each one here, or add the MAC in the turn online methods
    //May need to make this ArrayList 2D so as to store a unique ID, if referencing a specific device is necessary
    private WAP () {
        this.connectedWirelessMACs = new ArrayList();
    }
}
