package queue;

public class CircularArrayQueue implements IQueue {
    private int[] queue;
    private int capacity;
    private int size;
    private int head;
    private int tail;

    public CircularArrayQueue(int initialCapacity) {
        this.capacity = initialCapacity + 1;
        queue = new int[capacity];
        head = capacity;
        tail = 0;
        size = 0;
    }
    
    @Override
    public void enqueue(int item) {
        queue[tail++] = item;
        size++;
        tail = tail % capacity;
    }
    
    @Override
    public int dequeue() {
        head = head % capacity;
        size--;
        return  queue[head++];
    }
    
    @Override
    public int peek() {
        head = head % capacity;
        return queue[head];
    }
    
    @Override
    public boolean isEmpty() {
        return head % capacity == tail;
    }
    
    @Override
    public boolean isFull() {
        return tail + 1 == head;
    }
    
    @Override
    public int size() {
        return size;
    }
            
}
