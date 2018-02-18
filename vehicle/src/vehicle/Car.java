/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1516392
 */
public class Car {
    private GearBox gearbox;
    
    public Car() {
        gearbox = new GearBox();
    }
    
    @Override
    public String toString() {
        return gearbox.toString();
    }
}
