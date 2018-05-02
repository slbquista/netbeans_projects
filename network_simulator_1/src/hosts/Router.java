package hosts;

import db_connection.NetworkDevices;
import java.sql.SQLException;

/**
 * @author 1516392
 */

public class Router {
    NetworkDevices nd;
    int id;
    String macaddress;
    String ipaddress;
    String addressmode;
    String nodetype;
    String nodename;
    boolean online;
    final String networkNumber = "10.1.1";
    final String subnetMask = "255.255.255.0";
    final String subnetMaskLength = "/24";

    public Router() throws ClassNotFoundException, SQLException {
        this.nd = NetworkDevices.getInstance();
        
        for (int i = 0; i < nd.getNetworkList().size(); i++) {
            if (nd.getNetworkList().get(i).getNodename().equalsIgnoreCase("router")) {
                this.id = nd.getNetworkList().get(i).getId();
                this.macaddress = nd.getNetworkList().get(i).getMacaddress();
                this.ipaddress = nd.getNetworkList().get(i).getIpaddress();
                this.addressmode = nd.getNetworkList().get(i).getAddressmode();
                this.nodetype = nd.getNetworkList().get(i).getNodetype();
                this.nodename = nd.getNetworkList().get(i).getNodename();
                this.online = nd.getNetworkList().get(i).isOnline();
            }
        }
    }
    
    public void turnOn() {
        for (int i = 0; i < nd.getNetworkList().size(); i++) {
            if (nd.getNetworkList().get(i).getNodename().equalsIgnoreCase("router") && nd.getNetworkList().get(i).isOnline() == false) {
                nd.getNetworkList().get(i).setOnline(true);
                online = true;
            }
        }
    }
    
    public void turnOff() {
        for (int i = 0; i < nd.getNetworkList().size(); i++) {
            if (nd.getNetworkList().get(i).getNodename().equalsIgnoreCase("router") && nd.getNetworkList().get(i).isOnline() == true) {
                nd.getNetworkList().get(i).setOnline(false);
                online = false;
            }
        }
    }
    
    public String networkDetails() {
        String details = "";
        
        details = "Network Number: " + networkNumber + "\nSubnet Mask: " + subnetMask + "\nMask Length: " + subnetMaskLength;
        
        return details;
    }
    
    public String hostMapping() {
        String nodeToIP = "\nNODE NAME | IP ADDRESS\n";
        
        for (int i = 0; i < nd.getNetworkList().size(); i++) {
            if (nd.getNetworkList().get(i).isOnline() == true) {
                nodeToIP += nd.getNetworkList().get(i).getNodename() + " | " + nd.getNetworkList().get(i).getIpaddress() + "\n";
            }
        }
        
        return nodeToIP;
    }
    
    @Override
    public String toString() {
        String status;

        //This is just to output boolean as string
        if (this.online) {
            status = "online";
        } else {
            status = "offline";
        }
        
        return "ID: " + this.id + "\n"
                + "MAC: " + this.macaddress + "\n"
                + "IP: " + this.ipaddress + "\n"
                + "Address Mode: " + this.addressmode + "\n"
                + "Node Type: " + this.nodetype + "\n"
                + "Node Name: " + this.nodename + "\n"
                + "Status: " + status + "\n";
    }
}