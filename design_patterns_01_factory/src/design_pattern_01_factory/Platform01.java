/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_pattern_01_factory;

import factory.AccountFactory;
import factory.AccountI;

/**
 *
 * @author 1516392
 */
public class Platform01 {
    
    public static void Platform01() {
    
    try {
        AccountI silver = AccountFactory.createAccount("Silver");
        System.out.println(silver.addRewardPoints(123.00));

        AccountI thegolden = AccountFactory.createAccount("GOLD");
        System.out.println(thegolden.addRewardPoints(123.00));

        AccountI anotherPlatinum = AccountFactory.createAccount("pLATINUM");
        System.out.println(anotherPlatinum.addRewardPoints(123.00));

        // Makes the program crash if the exeption is not handled
        // AccountI bogusAccount = AccountFactory.createAccount("I am an illal input");
        System.out.println("\n -------- add some reward points ------- \n");

        silver.addRewardPoints(234.56);
        System.out.println("silver: reward points added");
        thegolden.addRewardPoints((234.56));
        System.out.println("thegolden: reward points added");
        anotherPlatinum.addRewardPoints(234.56);
        System.out.println("anotherPlatinum: reward points added");

        System.out.println("\n ------- use the getter method (see AccountBase) -------- \n");

        System.out.println("[use getter method] silver (rewardPoints): " + silver.rewardPoints());
        System.out.println("[use getter method] thegolden (rewardPoints): " + thegolden.rewardPoints());
        System.out.println("[use getter method] anotherPlatinum (rewardPoints): " + anotherPlatinum.rewardPoints());

    } catch (IllegalArgumentException e) {
        System.out.println("IllegalArgumentException: " + e.getMessage());
        
        System.out.println("\n -------- end of program ------- \n");
    }
}
}
