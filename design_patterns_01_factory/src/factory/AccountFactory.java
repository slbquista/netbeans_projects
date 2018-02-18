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
public class AccountFactory {
    //public AccountFactory() {
    //}
    
    public static AccountI createAccount(String actype) {
        if (actype.equalsIgnoreCase("Silver")) {
            return new SilverAccount();
        } else if (actype.equalsIgnoreCase("Gold")) {
            return new GoldAccount();
        } else if (actype.equalsIgnoreCase("Platinum")) {
            return new PlatinumAccount();
        }
        
        throw new IllegalArgumentException ("Can't create a " + actype + " account!");
    }
    
    // If the string actype does not contain a valid account type name: nothing gets "returned" -> "missing return statement
    // Throw an exeption back to the caller

}
