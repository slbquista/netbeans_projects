/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_connecting;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 1516392
 */
public class NetworkDevices {

    private static ArrayList< DeviceRecord> rnd;

    public NetworkDevices() throws ClassNotFoundException, SQLException {
        try {
            // if we get a problem here ("driver does not exist"): 
            // Click  the project icon / Properties / Libraries -> add (the path to) ojdbc7_g.jar
            Class.forName("oracle.jdbc.driver.OracleDriver");
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        } catch (ClassNotFoundException c_) {
            System.out.println(c_.getMessage());
        }

        rnd = new ArrayList<>() ;
        
        try {
            // CAUTION: the connection string needs your ACTUAL user name for connecting to the database!
            Connection c = DriverManager.getConnection("jdbc:oracle:thin:@//10.1.9.106:1521/sw2", "finn", "password");
            java.sql.Statement s = c.createStatement();
            ResultSet rset = s.executeQuery("select * from nwdevices2 order by id");
            while (rset.next()) {
                DeviceRecord dr = new DeviceRecord();
                dr.setId(rset.getInt(1));
                dr.setMacaddress(rset.getString(2));
                dr.setIpaddress(rset.getString(3));
                dr.setAddressmode(rset.getString(4));
                dr.setNodetype(rset.getString(5));
                dr.setNodename(rset.getString(6));
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
    
    public void searchForMAC(int id) {
        
        for (DeviceRecord dr : rnd) {
            if (id == dr.getId()) {
                System.out.println("\nThe MAC address of ID " + dr.getId() + " is " + dr.getMacaddress());
            }
        }
    }
    
    public void searchForIP(int id) {
        
        for (DeviceRecord dr : rnd) {
            if (id == dr.getId()) {
                System.out.println("\nThe IP address of ID " + dr.getId() + " is " + dr.getIpaddress());
            }
        }
    }
    
    public void searchForMode(String mode) {
        
        for (DeviceRecord dr : rnd) {
            if (mode.equals(dr.getAddressmode())) {
                System.out.println("\nThe address mode of ID " + dr.getId() + " is " + mode);
                System.out.println("ID: " + dr.getId() + " MAC: " + dr.getMacaddress() + " IP: " + dr.getIpaddress() + " Node type: " + dr.getNodetype() + " Node name: " + dr.getNodename());
            }
        }
    }
}