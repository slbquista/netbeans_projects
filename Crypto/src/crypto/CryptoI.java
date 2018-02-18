/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

/**
 *
 * @author 1516392
 */

//Calls functions defined in Caeser, the class that implements this interface
public interface CryptoI {
    
    String encrypt(String clearText, String cipherText, int shift);
    
    //String decrypt();
}
