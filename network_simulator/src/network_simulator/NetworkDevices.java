package network_simulator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class NetworkDevices {

    private static ArrayList< DeviceRecord> rnd;

    public NetworkDevices() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        } catch (ClassNotFoundException c_) {
            System.out.println(c_.getMessage());
        }

        rnd = new ArrayList<>() ;
        
        try {
	    // CAUTION: the connection string needs your ACTUAL user name for connecting to the database!
            // The TABLE NAME used in the SELECT ... must be correct!  
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@//10.1.9.106:1521/sw2", "finn", "password");
            Statement s = c.createStatement();
            ResultSet rset = s.executeQuery("select * from nwdevices order by id");
            while (rset.next()) {
                DeviceRecord dr = new DeviceRecord((rset.getInt(1)), (rset.getString(2)), (rset.getString(3)), (rset.getString(4)), (rset.getString(5)), (rset.getString(6)));

                rnd.add(dr) ;
            }
        } catch (SQLException s_) {
            System.out.println(s_.getErrorCode());
        }

    }

    public void displayDeviceRecords() {
        for (DeviceRecord dr : rnd) {
            System.out.println(dr.toString());
        }
    }
}