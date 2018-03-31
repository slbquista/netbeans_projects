package test_array_data;

/**
 *
 * @author 1516392
 */

public class DeviceRecord {

    // Refactor, encapsulate fields
    private int id;
    private String macaddress;
    private String ipaddress;
    private String addressmode;
    private String nodetype;
    private String nodename;
    private boolean online ;

    //Constructor
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
    public String toString(){
        String status;
        if (this.online)
            status = "online" ;
        else
            status = "offline";
        return this.id + " "
                + this.macaddress + " "
                + this.ipaddress + " "
                + this.addressmode + " "
                + this.nodetype + " "
                + this.nodename + " "
                + status;
    }
	
	// Accessors/mutators omitted
}