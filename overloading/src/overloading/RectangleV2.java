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
public class RectangleV2 {

    private final int defaultLength = 100;
    private final int defaultWidth = 100;
    private final int defaultX = 0; // Position in coordinate system
    private final int defaultY = 0;
        
    private final int length; // Final ~ constant. User can't change.
    private final int width;
    private final int xpos;
    private final int ypos;
        
    public RectangleV2() {
        this.length = defaultLength;
        this.width = defaultWidth;
        this.xpos = defaultX;
        this.ypos = defaultY;
    }
    
    // overloaded ctor
    public RectangleV2(int pLength, int pWidth) {
        this.length = pLength;
        this.width = pWidth;
        this.xpos = defaultX;
        this.ypos = defaultY;
    }
    
    public RectangleV2(int pLength, int pWidth, int pXpos, int pYpos) {
        this.length = pLength;
        this.width = pWidth;
        this.xpos = pXpos;
        this.ypos = pYpos;
    }
    
    protected int getArea() {
        return this.length * this.width;
    }
    
    private int getCircumference() {
        return (this.length * 2) + (this.width * 2);
    }
    
    // Client can only execute this method
    @Override
    public String toString() {
        return "  area: "
                + getArea()
                + "  circumference: "
                + getCircumference()
                + " pos x : " + this.xpos
                + " pos y : " + this.ypos;
    }

}
