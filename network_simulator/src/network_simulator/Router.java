package network_simulator;

import java.util.ArrayList;

public class Router {
    String externalIP;
    String internalIP;
    ArrayList<String> connectedIPs = new ArrayList<>();

    //TODO: Add constructor

    public String getExternalIP() {
        return externalIP;
    }

    public String getInternalIP() {
        return internalIP;
    }
    
    
}
