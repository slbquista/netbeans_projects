package datastructures_portfolio.stack;

/**
 * @author 1516392
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Linked List");
        
        IStack linkedListStack = new LinkedListStack();
        for (int i = 0; i < 10; i++) {
            linkedListStack.push(i * 5);
        }
        System.out.println("Top: " + linkedListStack.peek());
        
        while(!linkedListStack.isEmpty()) {
            System.out.println("Pop: " + linkedListStack.pop());
        }
        
        System.out.println("=====================");
    }
}
