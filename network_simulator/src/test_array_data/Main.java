package test_array_data;

import customexceptions.NoRecordFound;
import java.sql.SQLException;

/**
 * @author 1516392
 */

public class Main {
    public static void main(String[] args) throws NoRecordFound, SQLException {
        testOnline();
    }
    
    public static void testOnline() throws NoRecordFound, SQLException {
        NetworkDevices nd = new NetworkDevices();
        nd.displayDeviceRecords();
        
        nd.turnOn("22:a7:b2:9c:8a:aa");
        nd.turnOn("3f:4e:6f:93:46:d4");
        
        System.out.println("\n--------------------------------------------------\n");
        
        nd.displayDeviceRecords();
    }
}
