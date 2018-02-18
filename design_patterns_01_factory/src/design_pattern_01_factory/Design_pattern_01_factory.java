/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design_pattern_01_factory;

import accounts.GoldAccount;
import accounts.PlatinumAccount;
import accounts.SilverAccount;

/**
 *
 * @author 1516392
 */
public class Design_pattern_01_factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        oneClass();
        //testSilverClass();
        //testGoldClass();
        //testPlatinumClass();
    }
    
    public static void testSilverClass() {
        System.out.println("-- testSilverAccount --");
        SilverAccount ac04 = new SilverAccount();
        System.out.println(ac04.rewardPoints(123.00));
    }
    
    public static void testGoldClass() {
        System.out.println("-- testGoldAccount --");
        GoldAccount ac05 = new GoldAccount();
        System.out.println(ac05.rewardPoints(123.00));
    }
        
    public static void testPlatinumClass() {
        System.out.println("-- testPlatinumAccount --");
        PlatinumAccount ac06 = new PlatinumAccount();
        System.out.println(ac06.rewardPoints(123.00));
    }
    
    public static void oneClass() {
        System.out.println("-- testSilver --");
        Account ac01 = new Account("silver");
        //ac01.rewardPoints(123.00);
        System.out.println(ac01.rewardPoints(123.00));
        
        System.out.println("-- testGold --");
        Account ac02 = new Account("gold");
        //ac01.rewardPoints(123.00);
        System.out.println(ac02.rewardPoints(123.00));
        
        System.out.println("-- testPlatinum --");
        Account ac03 = new Account("platinum");
        //ac01.rewardPoints(123.00);
        System.out.println(ac03.rewardPoints(123.00));
    }
}
