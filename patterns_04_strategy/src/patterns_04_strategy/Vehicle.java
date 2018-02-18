package patterns_04_strategy;

import flyingBehaviour.FlyingBehaviourI;
import drivingBehaviour.driving;

/**
 *
 * @author 1516392
 */
public class Vehicle {
    FlyingBehaviourI flyingBehaviour;
    driving drivingBehaviour;
    
    /**
     * This method is called from the flyingBehaviour classes
     */
    public void fly() {
        flyingBehaviour.fly();
    }
    
    /**
     *
     * @param fb
     */
    public void setFlyingBehaviour(FlyingBehaviourI fb) {
        flyingBehaviour = fb;
    }
    
    /**
     * This method is called from the drivingBehaviour classes
     */
    public void drive() {
        drivingBehaviour.drive();
    }
    
    /**
     * 
     * @param db
     */
    public void setDrivingBehaviour (driving db) {
        drivingBehaviour = db;
    }
}
