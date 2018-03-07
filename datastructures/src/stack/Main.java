/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author 1516392
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Array Stack");
        
        IStack arrayStack = new ArrayStack(10);
        for (int i = 0; i < 10; i++) {
            arrayStack.push(i * 5);
        }
        System.out.println("Top: " + arrayStack.peek());
        
        while(!arrayStack.isEmpty()) {
            System.out.println("Pop: " + arrayStack.pop());
        }
        
        System.out.println("=====================");
        
        
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
        
        
        System.out.println("ArrayList Stack");
        
        IStack arrayListStack = new ArrayListStack();
        for (int i = 0; i < 10; i++) {
            arrayListStack.push(i * 5);
        }
        System.out.println("Top: " + arrayListStack.peek());
        
        while(!arrayListStack.isEmpty()) {
            System.out.println("Pop: " + arrayListStack.pop());
        }
        
        System.out.println("=====================");
    }
}
