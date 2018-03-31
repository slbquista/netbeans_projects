package network_simulator;

import java.util.ArrayList;

public class Router {
    //This variable is set during the connection process, and it is taken from the NetworkDevices ArrayList
    private String internalIP;
    private final ArrayList<String> connectedIPs;

    public void setInternalIP(String internalIP) {
        this.internalIP = internalIP;
    }
    
    public String getInternalIP() {
        return internalIP;
    }
    
    //For each device who's boolean online = true, add the respective IP to this
    //Either go through the ArrayList and check each one here, or add the IP in the turn online methods
    //May need to make this ArrayList 2D so as to store a unique ID, if referencing a specific device is necessary
    private Router () {
        this.connectedIPs = new ArrayList();
    }
}