package queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List Queue");
        
        IQueue linkedListQueue = new LinkedListQueue();
        for (int i = 0; i < 10; i++) {
            linkedListQueue.enqueue(i * 5);
        }
        System.out.println("Front: " + linkedListQueue.peek());
        
        while(!linkedListQueue.isEmpty()) {
            System.out.println("Dequeue: " + linkedListQueue.dequeue());
        }
        
        System.out.println("=====================");
        
        
        System.out.println("Array Queue");
        
        IQueue simpleArrayQueue = new SimpleArrayQueue(10);
        for (int i = 0; i < 10; i++) {
            simpleArrayQueue.enqueue(i * 5);
        }
        System.out.println("Front: " + simpleArrayQueue.peek());
        
        while(!simpleArrayQueue.isEmpty()) {
            System.out.println("Dequeue: " + simpleArrayQueue.dequeue());
        }
        
        System.out.println("=====================");
        
        
        System.out.println("Circular Array Queue");
        
        IQueue circularArrayQueue = new CircularArrayQueue(10);
        for (int i = 0; i < 10; i++) {
            circularArrayQueue.enqueue(i * 5);
        }
        System.out.println("Front: " + circularArrayQueue.peek());
        
        while(!circularArrayQueue.isEmpty()) {
            System.out.println("Dequeue: " + circularArrayQueue.dequeue());
        }
        
        System.out.println("=====================");
    }
}
