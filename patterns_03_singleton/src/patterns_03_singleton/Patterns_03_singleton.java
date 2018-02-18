/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns_03_singleton;

import java.util.ArrayList;

/**
 *
 * @author 1516392
 */
public class Patterns_03_singleton {

static final int maxelements = 35;

    public static void main(String[] args) {
        // Note: Singleton.getInstance() gets called in this method?
        
        //testWithTwoObjects();
        testWithArrayList();
    }
    
    private static void testWithTwoObjects() {
        ClientOne cONE = new ClientOne();
        ClientTwo cTWO = new ClientTwo();
        
        System.out.println("ClientOne int -> " + cONE.getClientOneInt());
        System.out.println("ClientTwo int -> " + cTWO.getClientTwoInt());
        
        // Instantiate the singleton
        Singleton.getInstance();
        
        cONE.setClientOneInt(Singleton.getUniqueInteger());
        cTWO.setClientTwoInt(Singleton.getUniqueInteger());
        
        System.out.println("ClientOne int -> " + cONE.getClientOneInt());
        System.out.println("ClientTwo int -> " + cTWO.getClientTwoInt());
        
        System.out.println(" --- method testWithTwoObjects completed --- ");
    }
    
    private static void testWithArrayList() {
        // < type parameter >
        ArrayList< ClientOne > al = new ArrayList<>();
        
        // "Write" operation
        for (int i = 0; i < maxelements; i++) {
            ClientOne test = new ClientOne();
            test.setClientOneInt(Singleton.getUniqueInteger());
            al.add(test);
        }
        
        // for-each loop : "IN"
        // "read" operation
        for (ClientOne c : al) {
            System.out.println("Testarray int -> " + c.getClientOneInt());
        }
        
        System.out.println(" --- method testWithArrayList completed --- ");
    }
    
}
