/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author 1516392
 */
public interface IQueue {
    public void enqueue(int item);
    public int dequeue();
    public int peek();
    public boolean isEmpty();
    public boolean isFull();
    public int size();
}
