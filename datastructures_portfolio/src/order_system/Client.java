package order_system;

import java.util.Queue;
import java.util.LinkedList;

/**
 * @author 1516392
 */

public class Client {
    
    private static Stock stock;
    private static Queue orders;
    
    public static void main(String[] args) {
        
        //  Get Stock Instance
        stock = Stock.getInstance();
        orders = new LinkedList();
        
        //  Create orders and add to Queue
        Order order_0 = new Order(0, "Finn Turnbull");
        order_0.add("Whiskey");
        orders.add(order_0);
        
        //  Output All orders information
        System.out.println(orders);
        //System.out.println("Customer name: " + order_0.getCustomerName() + "\n" + "Total: £" + order_0.getTotal() + "\n" + "Order details: " + order_0.toString());
    }
    
}