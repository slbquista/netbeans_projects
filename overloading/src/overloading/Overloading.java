/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

import java.util.ArrayList;

/**
 *
 * @author 1516392
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testDefaultCtor();
        //testOverloadedCtor();
        //testRectangleV2();
        //testArrayOfRectangleV2();
        //printALRV2(newAndAddElementsAlRV2(42));
        
        //testTheGrid();
    }
    
    public static int testDefaultCtor() {
        System.out.println("-- testDefaultCtor --");
        Rectangle r = new Rectangle();
        System.out.println(" r: area -> " + r.getArea());
        System.out.println(" r: circumference -> " + r.getCircumference());
        return 0;
    }
    
    public static int testOverloadedCtor() {
        System.out.println("-- testoverloadedCtor --");
        int localLength = 25;
        int localWidth = 40;
        Rectangle r = new Rectangle(localLength, localWidth);
        System.out.println(" r: area -> " + r.getArea());
        System.out.println(" r: circumference -> " + r.getCircumference());
        return 0;
    }
    
    public static boolean testRectangleV2() {
        System.out.println("-- test RectangleV2 constructors --");
        boolean constructorsTested = false;
        
        RectangleV2 rONE = new RectangleV2(); // Default ctor
        RectangleV2 rTWO = new RectangleV2(5,5); // Overloaded ctor
        RectangleV2 rTHREE = new RectangleV2(1000, 1000, 50, 100); // Overloaded ctor taking input for (x,y) position
        
        System.out.println(rONE.toString());
        System.out.println(rTWO.toString());
        System.out.println(rTHREE.toString());
        
        constructorsTested = true;
        return constructorsTested;
    }
    
    public static void testArrayOfRectangleV2() {
        System.out.println("-- test: store RectangleV2s in an array --");
        RectangleV2[] arr = new RectangleV2[100];
        
        // Fill the array
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = new RectangleV2();
        }
        
        // What's in the array? Use a for-each loop
        for (RectangleV2 r : arr) {
            System.out.println(r.toString());
        }
        
        // Rectangle (elements) including their "index" - use []
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("array element " + i + " -> " + arr[i]);
        }
    }
    
    public static ArrayList <RectangleV2> newAndAddElementsAlRV2 (int pElements_) {
        ArrayList <RectangleV2> alr = new ArrayList<>();
        System.out.println("-- test: store RectangleV2s in an ArrayList --");
        
        for (int i = 0; i < pElements_; i++) {
            RectangleV2 r = new RectangleV2(); // Call the default ctor
            alr.add(r);
        }
        
        return alr;
    }
    
    public static void printALRV2 (ArrayList <RectangleV2> pALR) {
        // What's in the list now?
        System.out.println("-- test: print ArrayList, use for-each loop");
        
        for (RectangleV2 r : pALR) {
            System.out.println(r.toString());
        }
        
        System.out.println("-- test: print ArrayList + element index --");
        // We want to see elements' index too
        for (RectangleV2 r : pALR) {
            System.out.println(pALR.indexOf(r) + " " + r.toString());
        }
    }
    
    //public static Grid testTheGrid() {
    //    System.out.println("-- test: Grid constructor --");

        // Missing this code, get it next week from shared
    //}
}
