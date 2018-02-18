/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyingBehaviour;

import flyingBehaviour.FlyingBehaviourI;

/**
 *
 * @author 1516392
 */
public class FlyWithRotor implements FlyingBehaviourI {

    /**
     *
     */
    @Override
    public void fly() {
        System.out.println("Use the rotor!");
    }
}
