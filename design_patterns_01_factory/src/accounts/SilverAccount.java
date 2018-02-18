/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

/**
 *
 * @author 1516392
 */
public class SilverAccount extends BaseAccount {

    private final int silverTAValue = 15;

    public SilverAccount() {
        super(); // Call the base class' constructor
    }
    
    public int rewardPoints(double amount) {
        rewardPoints = (int)Math.round(amount/silverTAValue);
        return rewardPoints;
    }
}
