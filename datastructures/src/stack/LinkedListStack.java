package stack;
import linked_lists.LinkedList;

public class LinkedListStack implements IStack {
    LinkedList stack;
    
    public LinkedListStack() {
        stack = new LinkedList();
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
    }
    
    @Override
    public int pop() {
        return stack.removeFront();
    }
    
    @Override
    public int peek() {
        return stack.peekAtFront();
    }
}
