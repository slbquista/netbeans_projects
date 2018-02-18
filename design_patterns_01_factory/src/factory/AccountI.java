/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author 1516392
 */
public interface AccountI {
    public static final int platinumTAValue = 4;
    int goldTAValue = 8;
    int silverTAValue = 15;
    
    abstract int addRewardPoints (double amount);
    int rewardPoints();
    // Is abstract by default -> keyword abstract is not needed.
}
