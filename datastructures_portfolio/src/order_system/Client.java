package order_system;

import java.util.Queue;
import java.util.LinkedList;

/**
 * @author 1516392
 */

public class Client {
    
    private static Stock stock;
    private static Queue<Order> orders;
    
    public static void main(String[] args) {
        
        
        //  Get Stock Instance
        stock = Stock.getInstance();
        orders = new LinkedList();
        
        //  Create orders and add to Queue
        Order order_0 = new Order(0, "Finn Turnbull");
        order_0.add("Whisky");
        orders.add(order_0);
        
        Order order_1 = new Order(1, "A Name");
        order_1.add("Bread");
        order_1.add("Cereal");
        orders.add(order_1);
        
        Order order_2 = new Order(2, "Different Name");
        order_2.add("Lawn");
        order_2.add("Lawnmower");
        orders.add(order_2);
        
        Order order_3 = new Order(3, "Another Name");
        order_3.add("Whisky");
        order_3.add("Bread");
        order_3.add("Cereal");
        order_3.add("Lawn");
        order_3.add("Lawnmower");
        orders.add(order_3);
        
        Order order_4 = new Order(4, "Testing");
        order_4.add("testing");
        order_4.add("doesntexist");
        orders.add(order_4);
        
        //  Output All orders information
        for (Order item : orders) {
            System.out.println(item.toString());
        }
    }
}