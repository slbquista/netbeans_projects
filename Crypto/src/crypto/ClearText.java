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
public class ClearText extends MessageText {
    private String clearText;

    public ClearText(String clearText) {
        this.clearText = clearText;
    }
    
    public String getClearText() {
        return clearText;
    }


}
