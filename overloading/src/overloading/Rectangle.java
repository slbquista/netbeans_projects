/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author 1516392
 */
public class Rectangle {
    private final int defaultLength = 100;
    private final int defaultWidth = 100;
        
    private final int length; // Final ~ constant. User can't change.
    private final int width;
        
    public Rectangle() {
        this.length = defaultLength;
        this.width = defaultWidth;
    }
    
    // Overloading Ctor
    public Rectangle (int pLength, int pWidth) {
        this.length = pLength;
        this.width = pWidth;
    }
    
    public int getArea () {
        return this.length * this.width;
    }
    
    public int getCircumference () {
        return (this.length * 2) + (this.width * 2);
    }
}