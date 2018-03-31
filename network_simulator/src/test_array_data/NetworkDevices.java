package test_array_data;

/**
 *
 * @author 1516392
 */

import customexceptions.NoRecordFound;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NetworkDevices {

    private static ArrayList<DeviceRecord> rnd;

    //Connects to database and fills ArrayList with records
    public NetworkDevices() throws NoRecordFound, SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        } catch (ClassNotFoundException c_) {
            System.out.println(c_.getMessage());
        }

        rnd = new ArrayList<>();
        
        try {
	    // CAUTION: the connection string needs your ACTUAL user name for connecting to the database!
            // The TABLE NAME used in the SELECT ... must be correct!  
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@//10.1.9.106:1521/sw2", "finn", "password");
            Statement s = c.createStatement();
            ResultSet rset = s.executeQuery("select * from nwdevices2018 order by id");
            while (rset.next()) {
                DeviceRecord dr = new DeviceRecord(rset.getInt(1), rset.getString(2), rset.getString(3), rset.getString(4), rset.getString(5), rset.getString(6));

                rnd.add(dr);
            }
        } catch (SQLException s_) {
            System.out.println(s_.getErrorCode());
        }
    }
    
    //Changes the boolean in rnd from offline to online
    public void turnOn(String macaddress) throws NoRecordFound {
        for (int i = 0; i < rnd.size(); i++) {
            if (rnd.get(i).getMacaddress().equalsIgnoreCase(macaddress) && rnd.get(i).isOnline() == false) {
                rnd.get(i).setOnline(true);
            }
        }
        
        //As we are currently not returning anything this will always throw - need to only throw when the device is not found!
        //throw new NoRecordFound("Device not found!");
    }

    //Displays the elements (dr) of the ArrayList (rnd)
    public void displayDeviceRecords() {
        for (DeviceRecord dr : rnd) {
            System.out.println(dr.toString());
        }
    }
}