package queue;
import linked_lists.LinkedList;

public class LinkedListQueue implements IQueue {
    LinkedList queue;
    
    public LinkedListQueue() {
        queue = new LinkedList();
    }
    
    @Override
    public void enqueue(int item) {
        queue.addToRear(item);
    }
    
    @Override
    public int dequeue() {
        return queue.removeFront();
    }
    
    @Override
    public int peek() {
        return queue.peekAtFront();
    }
    
    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    @Override
    public boolean isFull() {
        return false;
    }
    
    @Override
    public int size() {
        return queue.size();
    }
}
