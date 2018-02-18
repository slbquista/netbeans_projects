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
public class Crypto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testRot();
    }
    
    public static void testRot() {
        MessageText clearText = new ClearText("ABC");
        
        MessageText cipherText = new CipherText();
        
        SymmetricKey symmetricKey = new SymmetricKey(13);
        
        System.out.println(cipherText.toString());
    }
}
