/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns_03_singleton;

/**
 *
 * @author 1516392
 */
public class Singleton {
    private static Singleton unique;
    private static int uniqueInteger;
    
    // Constructor: private!
    private Singleton() {
        uniqueInteger = 2017;
    }
    
    public static Singleton getInstance() {
        if (unique == null) {
            unique = new Singleton();
        }
        
        return unique;
    }
    
    public static int getUniqueInteger() {
        return uniqueInteger;
    }
}
