/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks.and.queues;

import java.io.IOException;

/**
 *
 * @author 1516392
 */
public class StacksAndQueues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        //testStack1(); // User input
        //testStack2(); // Defining a set string
        testStack3(); // jUnit testing
    }
    
    public static void testStack() throws IOException {
         
            Stack s = new Stack(10); // 10 character long
            
            char ch;
            
            while ((ch = (char) System.in.read()) != '\n') {
                if (!s.full()) {
                    s.push(ch);
                }
            }
            
            System.out.println();
    }
    
    public static void testStack2() {
        String testString = "testing";
        
        Stack s = new Stack(testString.length());
        
        for (int i = 0; i < testString.length(); i++) {
            if(!s.full()) {
                s.push(testString.charAt(i));
            }
        }
        
        while (!s.empty()) {
            System.out.print(s.pop());
        }
        
        System.out.println();
    }
    
    public static void testStack3() {
        String testString = "ABCDEFG";
        String expectedResult = "GFEDCBA";
        String actualResult = testStack3_1( testString );
        
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
    
    public static String testStack3_1 (String newString) {
        String reverseString = "";
        
        Stack s = new Stack(newString.length());
        
        for (int i = 0; i < newString.length(); i++) {
            if(!s.full()) {
                s.push(newString.charAt(i));
            }
        }
        
        while (!s.empty()) {
            reverseString += s.pop();
        }
        
        return reverseString;
    }
}

