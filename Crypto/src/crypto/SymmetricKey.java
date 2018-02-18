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

//This class holds the key used for encryption
public class SymmetricKey {
    
    //1 <= shift <= 26
    private int shift;

    public SymmetricKey(int shift) {
        this.shift = shift;
    }
    
    public int getShift() {
        return shift;
    }
}
