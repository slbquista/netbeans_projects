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
public class ClientTwo {

    public int getClientTwoInt() {
        return clientTwoInt;
    }

    public void setClientTwoInt(int clientTwoInt) {
        this.clientTwoInt = clientTwoInt;
    }
    
    private int clientTwoInt;
    
    public ClientTwo() {
        clientTwoInt = 0;
    }
    

}
