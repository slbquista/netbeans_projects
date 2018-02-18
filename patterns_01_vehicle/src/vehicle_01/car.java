/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle_01;

/**
 *
 * @author 1516392
 */
public class car extends vehicle {
    public int startYear;
    public final int roadTax = 500;
    
    //Constructor
    public car (int startYear) {
        this.startYear = startYear;
    }
    
    public int calc(int currentYear) {
        int retVal = 0;
        retVal = (currentYear - this.startYear) * this.roadTax;
        return retVal;
    }
    
    public int getStartYear() {
        return this.startYear;
    }
}
