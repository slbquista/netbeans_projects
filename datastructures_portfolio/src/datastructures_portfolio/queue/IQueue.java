package datastructures_portfolio.queue;

/**
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
