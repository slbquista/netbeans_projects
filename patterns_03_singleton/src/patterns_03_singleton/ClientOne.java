/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns_03_singleton;

/**
 *
 * @author 1516392
 */
public class ClientOne {

    public int getClientOneInt() {
        return clientOneInt;
    }

    public void setClientOneInt(int clientOneInt) {
        this.clientOneInt = clientOneInt;
    }
    
    private int clientOneInt;
    
    public ClientOne() {
        clientOneInt = 0;
    }
    

}
