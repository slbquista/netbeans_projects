/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycle;

/**
 *
 * @author 1516392
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        BicycleV2 b1 = new BicycleV2();
        BicycleV2 b2 = new BicycleV2();
        BicycleV2 b3 = new BicycleV2();
        BicycleV2 b4 = new BicycleV2();
        BicycleV2 b5 = new BicycleV2();
        
        b1.speedUp(10);
        b5.speedUp(100);
                
        b1.printStates();
        b2.printStates();
        b3.printStates();
        b4.printStates();
        b5.printStates();
        
    }
    
}
