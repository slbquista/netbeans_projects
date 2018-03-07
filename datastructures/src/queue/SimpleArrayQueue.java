package queue;

public class SimpleArrayQueue implements IQueue {
    int[] queue;
    int position;
    int size;
    
    public SimpleArrayQueue(int size) {
        this.queue = new int[size];
        this.position = -1;
        this.size = 0;
    }
    
    @Override
    public void enqueue(int item) {
        queue[++position] = item;
        size++;
    }
    
    @Override
    public int dequeue() {
        size--;
        position--;
        int value = queue[0];
        System.arraycopy(queue, 1, queue, 0, size);
        return value;
    }
    
    @Override
    public int peek() {
        return queue[0];
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
    public boolean isFull() {
        return size == queue.length;
    }
}
