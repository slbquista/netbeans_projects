/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author 1516392
 */
public interface IStack {
    public void push(int item);
    public int pop();
    public int peek();
    public boolean isEmpty();
    public int size();
}
