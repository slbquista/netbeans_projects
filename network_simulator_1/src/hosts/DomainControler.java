package hosts;

import db_connection.NetworkDevices;
import java.sql.SQLException;

/**
 * @author 1516392
 */

public class DomainControler {
    NetworkDevices nd;
    int id;
    String macaddress;
    String ipaddress;
    String addressmode;
    String nodetype;
    String nodename;
    boolean online;
    int[] openports = {67, 68, 53};

    public DomainControler() throws ClassNotFoundException, SQLException {
        this.nd = NetworkDevices.getInstance();
        
        for (int i = 0; i < nd.getNetworkList().size(); i++) {
            if (nd.getNetworkList().get(i).getNodename().equalsIgnoreCase("dc")) {
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
            if (nd.getNetworkList().get(i).getNodename().equalsIgnoreCase("dc") && nd.getNetworkList().get(i).isOnline() == false) {
                nd.getNetworkList().get(i).setOnline(true);
                online = true;
            }
        }
    }
    
    public void turnOff() {
        for (int i = 0; i < nd.getNetworkList().size(); i++) {
            if (nd.getNetworkList().get(i).getNodename().equalsIgnoreCase("dc") && nd.getNetworkList().get(i).isOnline() == true) {
                nd.getNetworkList().get(i).setOnline(false);
                online = false;
            }
        }
    }
    
    public String status() {
        String serverStatus = "\nOpen Port Numbers: ";
        
        serverStatus += "\nOnline: ";
        serverStatus += online;
        
        for (int i = 0; i < openports.length; i++) {
            serverStatus += openports[i] + " ";
        }
        
        return serverStatus;
    }
    
    public String findMACandIP(String hostName) {
        String MACandIP = "\nHost Name: " + hostName;
        
        for (int i = 0; i < nd.getNetworkList().size(); i++) {
            if (nd.getNetworkList().get(i).getNodename().equalsIgnoreCase(hostName)) {
                MACandIP += "\nMAC Address: " + nd.getNetworkList().get(i).getMacaddress() + "\nIP Address: " + nd.getNetworkList().get(i).getIpaddress();
            }
        }
        
        return MACandIP;
    }
    
    public int devicesOnline() {
        int countOnline = 0;
        
        for (int i = 0; i < nd.getNetworkList().size(); i++) {
            if (nd.getNetworkList().get(i).isOnline() == true) {
                countOnline++;
            }
        }
        
        return countOnline;
    }
    
    public int freeIPs() {
        int countFreeIPs = 0;
        
        for (int i = 0; i < nd.getNetworkList().size(); i++) {
            if (nd.getNetworkList().get(i).getNodetype().equalsIgnoreCase("unknown")) {
                countFreeIPs++;
            }
        }
        
        return countFreeIPs;
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
