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
public class CipherText extends MessageText {
    private String cipherText;

    @Override
    public String toString() {
        return "cipherText: " + cipherText;
    }

    public CipherText() { //Maybe add String cipherText
        this.cipherText = cipherText;
    }

    public String getCipherText() {
        return cipherText;
    }
    
    
}
