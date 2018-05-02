package hosts;

import db_connection.NetworkDevices;
import db_connection.DeviceRecord;
import java.sql.SQLException;

/**
 * @author 1516392
 */

public class DatabaseServer {
    NetworkDevices nd;
    int id;
    String macaddress;
    String ipaddress;
    String addressmode;
    String nodetype;
    String nodename;
    boolean online;

    public DatabaseServer() throws ClassNotFoundException, SQLException {
        this.nd = NetworkDevices.getInstance();
        
        for (int i = 0; i < nd.getNetworkList().size(); i++) {
            if (nd.getNetworkList().get(i).getNodename().equalsIgnoreCase("dbsrv")) {
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
