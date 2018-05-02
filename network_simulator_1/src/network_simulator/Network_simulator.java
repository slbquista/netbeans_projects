package network_simulator;

import db_connection.NetworkDevices;
//import db_connection.DeviceRecord;
import hosts.DatabaseServer;
import hosts.DomainControler;
import hosts.Router;
import hosts.Switch;
import hosts.WAP;
import java.sql.SQLException;

public class Network_simulator {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //readFromDatabase();
        //changeState();
        //outputDC();
        //outputSwitch();
        //outputRouter();
        //outputWAP();
        //outputDBS();
        testAll();
    }
    
    public static void readFromDatabase() throws ClassNotFoundException, SQLException {
        NetworkDevices nd = NetworkDevices.getInstance();
        nd.displayDeviceRecords();
    }
    
    public static void testAll() throws ClassNotFoundException, SQLException {
        Router rt = new Router();
        Switch sw1 = new Switch("switch_1");
        WAP wap = new WAP();
        DomainControler dc = new DomainControler();
        
        rt.turnOn();
        sw1.turnOn("switch_1");
        wap.turnOn();
        dc.turnOn();
        
        System.out.println("Number of devices online: " + dc.devicesOnline());
        
        System.out.println("Number of free IP addresses: " + dc.freeIPs());
        
        System.out.println(rt.hostMapping());
        
        System.out.println(rt.networkDetails());
        
        System.out.println(dc.findMACandIP("pc42"));
        
        System.out.println(dc.status());
    }
    
    public static void changeState() throws ClassNotFoundException, SQLException {
        Router rt = new Router();
        Switch sw1 = new Switch("switch_1");
        
        rt.turnOn();
        sw1.turnOn("switch_1");
    }
    
    public static void outputDC() throws ClassNotFoundException, SQLException {
        DomainControler dc = new DomainControler();
        //System.out.println(dc.toString());
        
        System.out.println("Number of devices online: " + dc.devicesOnline());
        System.out.println("Number of free IP addresses: " + dc.freeIPs());
    }
    
    public static void outputRouter() throws ClassNotFoundException, SQLException {
        Router rt = new Router();
        //System.out.println(rt.toString());
        
        System.out.println(rt.hostMapping());
        System.out.println(rt.networkDetails());
    }
    
    public static void outputSwitch() throws ClassNotFoundException, SQLException {
        Switch sw1 = new Switch("switch_1");
        System.out.println(sw1.toString());
    }
    
    public static void outputWAP() throws ClassNotFoundException, SQLException {
        WAP wap = new WAP();
        System.out.println(wap.toString());
    }
    
    public static void outputDBS() throws ClassNotFoundException, SQLException {
        DatabaseServer dbs = new DatabaseServer();
        System.out.println(dbs.toString());
    }
}
