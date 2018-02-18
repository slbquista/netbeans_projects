/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.and.array.lists;

import java.util.ArrayList;

/**
 *
 * @author 1516392
 */
public class Arrays_and_ArrayLists {

        static final String thestring = "thisisthestring";
        static final int[] thearray = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        static ArrayList <Integer> thearraylist = new ArrayList<>();
        static final int maxarraylist = 77;
        
    public static void main(String[] args) {
        //Uncomment line to execute method
        
        //printCharacters();
        //printArrayElements();
        //printArrayElements2();
        //printArrayElements3(300); //Fails
        //printArrayElements4(300); //Error handling added
        //changeElements();
        //changeElements2();
        addAndPrint();
        
        System.out.println(" -- End of program --");
        
    }
    
    public static int printCharacters() {
        System.out.println(" -- printCharacters -- ");
        for (int i = 0; i < thestring.length(); i++) {
            System.out.println(thestring.charAt(i));
        }
        
        return thestring.length();
    }
    
    public static int printArrayElements() {
        System.out.println(" -- printArrayElements --");
        for (int i = 0; i < thearray.length; i++) {
            System.out.println(thearray[i]);
        }
        
        return thearray.length;
    }
    
    public static int printArrayElements2() {
        System.out.println(" -- printArrayElements V2 -- ");
        for (int a : thearray) {
            System.out.println(a);
        }
        
        return thearray.length;
    }
    
    //No compile time error
    //May throw an exception (runtime error)
    
    public static int printArrayElements3(int index_) {
        System.out.println(" -- printArrayElements V3 -- ");
        System.out.println(thearray[index_]);
        
        return thearray.length;
    }
    
    public static int printArrayElements4(int index_) {
        System.out.println(" -- printArrayElements V3 -- ");
        try {
            System.out.println(thearray[index_]);
        } catch (Exception e) {
            System.out.println(" Error -> " + e);
        }
        return thearray.length;
    }
    
    public static int changeElements() {
        System.out.println(" -- changeElements -- ");
        for (int i = 0; i < thearray.length; i++) {
            //thearray[i] = Math.random(); //Incompatable types
            thearray[i] = (int) Math.floor(Math.random() * 1000);
        }
        
        printArrayElements2();
        
        return thearray.length;
    }
    
    public static int changeElements2() {
        System.out.println(" -- changeElements V2 -- ");
        for (int i = 0; i < 300; i++) {
            //thearray[i] = Math.random(); //Incompatable types
            thearray[i] = (int) Math.floor(Math.random() * 1000);
        }
        
        printArrayElements2();
        
        return thearray.length;
    }
    
    //ArrayList resizes itself
    //Use static maxarraylist (global) + addelements (local)
    
    public static int addAndPrint() {
        int addMoreElements = 100;
        
        System.out.println(" -- Add and print elements (ArrayList) -- ");
        
        for (int i = 0; i < maxarraylist; i++) {
            thearraylist.add( (int) Math.floor(Math.random() * 1000));
        }
        for (int i = 0; i < maxarraylist; i++) {
            thearraylist.add( (int) Math.floor(Math.random() * 1000));
        }
        for (Integer integer_ : thearraylist) {
            System.out.println(integer_);
        }
        
        return thearraylist.size();
    }
}