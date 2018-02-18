/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1516392
 */
public class GearBox {

    private int currentGear;
    private final String[] gears;
    private final String reverse_gear;

    public GearBox() {
        gears = new String[]{"N", "1", "2", "3", "4", "5", "6"};
        reverse_gear = "R";
        currentGear = 0; //Neutral
    }

    public int setNeutral() {
        currentGear = 0;
        return currentGear;
    }

    public int shiftUp() {
        if (currentGear < gears.length - 1) {
            currentGear++;
        } else {
            //Do nothing
        }

        return currentGear;
    }

    @Override
    public String toString() {
        return " [gear box] currentgear -> " + gears[currentGear];
    }

}
