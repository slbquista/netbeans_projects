/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns_04_strategy;

import drivingBehaviour.driveOnRoad;

/**
 *
 * @author 1516392
 */
public class Motorbike extends Vehicle {

    /**
     * This method creates a new object driveOnRoad for the Motorbike subclass
     */
    public Motorbike() {
        drivingBehaviour = new driveOnRoad();
    }
}
