package datastructures_portfolio.stack;

/**
 * @author 1516392
 */

public interface IStack {
    public void push(int item);
    public int pop();
    public int peek();
    public boolean isEmpty();
    public int size();
}