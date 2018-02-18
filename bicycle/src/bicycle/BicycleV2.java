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
public class BicycleV2 {
    
    private int cadence;
    private int speed;
    private int gear;
    
    public BicycleV2 () {
        cadence = 0;
        speed = 0;
        gear = 1;
    }


    public int changeCadence(int newValue) {
         cadence = newValue;
         return cadence;
    }

    public int changeGear(int newValue) {
         gear = newValue;
         return gear;
    }

    public int speedUp(int increment) {
         speed = speed + increment;
         return speed;
    }

    public int applyBrakes(int decrement) {
         speed = speed - decrement;
         return speed;
    }

    public void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
