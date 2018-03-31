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
    public String getMacaddress() {
        return macaddress;
    }

    public boolean isOnline() {
        return online;
    }
    
    //Setters
    public void setOnline(boolean online) {
        this.online = online;
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
        
        return this.id + " "
                + this.macaddress + " "
                + this.ipaddress + " "
                + this.addressmode + " "
                + this.nodetype + " "
                + this.nodename + " "
                + status;
    }
}