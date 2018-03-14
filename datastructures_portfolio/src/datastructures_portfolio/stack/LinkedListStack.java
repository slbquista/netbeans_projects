package datastructures_portfolio.stack;
import linked_lists.LinkedList;
//import java.util.LinkedList;

/**
 * @author 1516392
 */

public class LinkedListStack implements IStack {
    LinkedList stack;
    //LinkedList<Integer> stack;
    
    public LinkedListStack() {
        stack = new LinkedList();
        //stack = new LinkedList<>();
    }
    
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    @Override
    public int size() {
        return stack.size();
    }
    
    @Override
    public void push(int item) {
        stack.addToFront(item);
        //stack.addFirst(item);
    }
    
    @Override
    public int pop() {
        return stack.removeFront();
        //return stack.removeFirst();
    }
    
    @Override
    public int peek() {
        return stack.peekAtFront();
        //return stack.getFirst();
    }
}
