package design_pattern_01_factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1516392
 */
public class Account {
    private String actype;
    private double balance;
    private int rewardPoints;
    
    // Transaction value per point
    private final int silverTAValue = 15;
    private final int goldTAValue = 8;
    private final int platinumTAValue = 4;
    
    public Account(String actype) {
        this.actype = actype;
        this.balance = 0.0;
        this.rewardPoints = 0;
    }
    
    public int rewardPoints(double amount) {
        // int points = 0;
        switch(actype) {
            case "silver":
                rewardPoints = (int)Math.round(amount/silverTAValue);
                break;
            case "gold":
                rewardPoints = (int)Math.round(amount/goldTAValue);
                break;
            case "platinum":
                rewardPoints = (int)Math.round(amount/platinumTAValue);
                break;
            default:
                break;
        }
        
        return this.rewardPoints;
    }
}
