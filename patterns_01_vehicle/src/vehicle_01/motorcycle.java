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
public class motorcycle extends vehicle {
    public int startYear;
    public static int roadTax = 200;
    
    //Constructor
    public motorcycle(int startYear) {
        this.startYear = startYear;
    }
    
    //Calculates the road tax
    public int calc (int currentYear) {
        int retVal = 0;
        retVal = (currentYear - this.startYear) * roadTax;
        return retVal;
    }
    
    //Gets the start year
    public int getStartYear() {
        return this.startYear;
    } 
}
