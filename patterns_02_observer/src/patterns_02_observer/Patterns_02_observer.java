/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns_02_observer;

import observer_01.BinObserver;
import observer_01.HexObserver;
import observer_01.OctObserver;
import observer_01.Subject;

/**
 *
 * @author 1516392
 */
public class Patterns_02_observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject sub = new Subject();
        new HexObserver(sub);
        new OctObserver(sub);
        new BinObserver(sub);
        
        int i = 0;
        for (i = 0; i < 100; i ++) {
         System.out.println( "\nEnter a number: " );
            sub.setState(10);
        }
    }
    
}
