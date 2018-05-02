//This class holds the device object template which is then used by NetworkDevices
//This holds all the fields we will be dealing with?

package db_connection;

public class DeviceRecord {

    private int id;
    private final String macaddress;
    private String ipaddress;
    private String addressmode;
    private String nodetype;
    private String nodename;
    private boolean online;

     public DeviceRecord(int ID, String MACaddress, String IPaddress, String addressMode, String nodeType, String nodeName) {
        id = ID;
        macaddress = MACaddress;
        ipaddress = IPaddress;
        addressmode = addressMode;
        nodetype = nodeType;
        nodename = nodeName;
        online = false ;
    }
     
    //Getters
    public int getId() {
        return id;
    }
    
    public String getMacaddress() {
        return macaddress;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public String getAddressmode() {
        return addressmode;
    }

    public String getNodetype() {
        return nodetype;
    }

    public String getNodename() {
        return nodename;
    }

    public boolean isOnline() {
        return online;
    }
    
    //Setters
    public void setOnline(boolean online) {
        this.online = online;
    }
    
    //Following toString method is used by NetworkDevices in the displayDeviceRecords method
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