/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns_04_strategy;

import flyingBehaviour.FlyWithWings;
import drivingBehaviour.driveOnRunway;

/**
 *
 * @author 1516392
 */
public class Plane extends Vehicle {

    /**
     * This method creates both a new object flyWithWings and driveOnRunway for the Plane subclass
     */
    public Plane() {
        flyingBehaviour = new FlyWithWings();
        drivingBehaviour = new driveOnRunway();
    }
}
