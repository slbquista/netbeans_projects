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
public class Grid {
    ArrayList <RectangleV2> alr;
    public Grid() {
        alr = new ArrayList<>();
    }
    
    public Grid(ArrayList <RectangleV2> pALR) {
        alr = pALR;
    }
    
    @Override
    public String toString() {
        String rString = "";
        for(RectangleV2 r : alr) {
            rString = rString + r.toString() + '\n';
        }
        
        return rString;
    }
}
