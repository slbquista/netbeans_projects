package network_simulator;

public class DeviceRecord {

    // refactor, encapsulate fields
    private int id;
    private String macaddress;
    private String ipaddress;
    private String addressmode;
    private String nodetype;
    private String nodename;
    private boolean online ;

    public DeviceRecord(int id, String macaddress, String ipaddress, String addressmode, String nodetype, String nodename) {
        id = 0;
        macaddress = "";
        ipaddress = "";
        addressmode = "";
        nodetype = "";
        nodename = "";
        online = false ;
    }
    
    @Override
    public String toString(){
        String status = "" ;
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
	
	// accessors/mutators omitted
}