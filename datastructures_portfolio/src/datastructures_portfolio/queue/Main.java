package datastructures_portfolio.queue;

/**
 * @author 1516392
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Array Queue");
        
        IQueue simpleArrayQueue = new ArrayQueue(10);
        for (int i = 0; i < 10; i++) {
            simpleArrayQueue.enqueue(i * 5);
        }
        System.out.println("Front: " + simpleArrayQueue.peek());
        
        while(!simpleArrayQueue.isEmpty()) {
            System.out.println("Dequeue: " + simpleArrayQueue.dequeue());
        }
        
        System.out.println("=====================");
    }
}
