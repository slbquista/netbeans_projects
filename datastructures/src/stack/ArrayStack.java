package stack;

public class ArrayStack implements IStack {
    private int[] stack;
    private int capacity;
    private int size;
    private int position;
    
    public ArrayStack (int size) {
        this.stack = new int[size];
        size = 0;
        position = - 1;
        this.capacity = size;
    }
    
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public void push(int item) {
        stack[++position] = item;
        size++;
    }
    
    @Override
    public int pop() {
        size--;
        return stack[position--];
    }
    
    @Override
    public int peek() {
        return stack[position];
    }
}
