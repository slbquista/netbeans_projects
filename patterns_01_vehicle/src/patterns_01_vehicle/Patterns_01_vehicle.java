/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns_01_vehicle;

import vehicle_01.car;
import vehicle_01.lorry;
import vehicle_01.motorcycle;

/**
 *
 * @author 1516392
 */
public class Patterns_01_vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calling the methods
        
        calcLorryTax(1900);
    }
    
    public static int calcLorryTax (int startYear) {
        int currentYear = 2017;
        
        lorry L1 = new lorry(startYear);
        System.out.println("From " + L1.getStartYear() + " to " + currentYear + " the car is " + L1.calc(currentYear));
        
        car C1 = new car(startYear);
        System.out.println("From " + C1.getStartYear() + " to " + currentYear + " the lorry is " + C1.calc(currentYear));
        
        motorcycle M1 = new motorcycle(startYear);
        System.out.println("From " + M1.getStartYear() + " to " + currentYear + " the motorcycle is " + M1.calc(currentYear));
        
        return 0;
    }
    
}
