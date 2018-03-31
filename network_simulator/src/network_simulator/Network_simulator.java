package network_simulator;

import java.sql.SQLException;

public class Network_simulator {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        readFromDatabase();
    }
    
    public static void readFromDatabase() throws ClassNotFoundException, SQLException {
        NetworkDevices nd = new NetworkDevices();
        nd.displayDeviceRecords();
    }
    
}
