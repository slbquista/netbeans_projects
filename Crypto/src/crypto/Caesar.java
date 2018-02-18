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
public class Caesar implements CryptoI {
    
    //Method takes clear text and outputs cipher text
    @Override
    public String encrypt(String clearText, String cipherText, int shift) {
        int cipherChar = 0;
        int length = 0;
        
        while (length < clearText.length()) {
            if (clearText.charAt(length) >= 'A' && clearText.charAt(length) <= 'Z') {
                cipherChar = (((clearText.charAt(length) - 'A') + shift) % 26 + 'A');
            }
            
            if (clearText.charAt(length) >= 'a' && clearText.charAt(length) <= 'z') {
                cipherChar = (((clearText.charAt(length) - 'a') + shift) % 26 + 'a');
            }
            
            cipherText += (char) cipherChar;
            
            length += 1;
            
        }
        return cipherText;
    }
    
    //Method takes cipher text and outputs clear text
    //@Override
    //public void decrypt() {
        
    //}
}