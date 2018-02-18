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
public abstract class AccountBase implements AccountI {
    protected double balance;
    protected int rewardPoints;
    
    public AccountBase() {
        this.balance = 0.0;
        this.rewardPoints = 0;
    }
    
    @Override
    public abstract int addRewardPoints(double amount);
    // Public abstract int rewardPoints();
    
    @Override
    public int rewardPoints() {
        return rewardPoints;
    }
}
