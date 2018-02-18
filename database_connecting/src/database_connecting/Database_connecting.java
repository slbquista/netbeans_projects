/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_connecting;

import java.sql.SQLException;

/**
 *
 * @author 1516392
 */
public class Database_connecting {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //displayAll();
        //findMAC();
        //findIP();
        findMode();
    }
    
    public static void displayAll() throws ClassNotFoundException, SQLException {
        NetworkDevices object = new NetworkDevices();
        object.displayDeviceRecords();
    }
    
    public static void findMAC() throws ClassNotFoundException, SQLException {

        NetworkDevices object = new NetworkDevices();
        object.searchForMAC(12); //Pass in the ID to search for a MAC address
    }
    
    public static void findIP() throws ClassNotFoundException, SQLException {

        NetworkDevices object = new NetworkDevices();
        object.searchForIP(12); //Pass in the ID to search for an IP address
    }
    
    public static void findMode() throws ClassNotFoundException, SQLException {

        NetworkDevices object = new NetworkDevices();
        object.searchForMode("dhcp"); //Pass in the mode to search for
    }
    
}
