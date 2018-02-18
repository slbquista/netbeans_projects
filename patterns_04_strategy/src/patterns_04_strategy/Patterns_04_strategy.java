/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns_04_strategy;

/**
 *
 * @author 1516392
 */
public class Patterns_04_strategy {

    /**
     * Main method to call test functions
     * @param args
     */
    public static void main(String[] args) {
        testPlane();
        testHelecopter();
        testCar();
        testMotorbike();
    }
    
    /**
     * Method to test the plane class 
     */
    public static void testPlane() {
        Vehicle firstPlane = new Plane();
        System.out.println("\nPlane:");
        firstPlane.drive();
        firstPlane.fly();
    }
    
    /**
     * Method to test the helecopter class
     */
    public static void testHelecopter() {
        Vehicle firstHelecopter = new Chopper();
        System.out.println("\nChopper:");
        firstHelecopter.fly();
    }
    
    /**
     * Method to test the car class
     */
    public static void testCar() {
        Vehicle firstCar = new Car();
        System.out.println("\nCar:");
        firstCar.drive();
    }
    
    /**
     * Method to test the motorbike class
     */
    public static void testMotorbike() {
        Vehicle firstMotorbike = new Motorbike();
        System.out.println("\nMotorbike:");
        firstMotorbike.drive();
    }
}
