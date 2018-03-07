package stack;
import array_list.ArrayList;

public class ArrayListStack implements IStack {
    ArrayList stack;
    
    public ArrayListStack() {
        stack = new ArrayList();
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
        return stack.removeFromFront();
    }
    
    @Override
    public int peek() {
        return stack.peekAtFront();
    }
}
