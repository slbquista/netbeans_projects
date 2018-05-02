package order_system;

import java.util.ArrayList;

/**
 * @author 1516392
 */

public class Order {
    
    private final int id;
    private final String customerName;
    private ArrayList<Item> order;
    
    public Order(int id, String name){
        this.id = id;
        this.customerName = name;
        this.order = new ArrayList();
    }
    
    public boolean add(String name){
        //Add items to collection. This collection is unlikely
        //to regularly adjust in size but is not static

        Stock stock = Stock.getInstance();
        if (stock.getItem(name) != null) {
            order.add(stock.getItem(name));
            return true;
        } else {
            return false;
        }
    }
    
    public boolean remove(String name){
        //  Iterate through collection and remove item from order if found
        //  And return true. Else...
        
        for (int i = 0; i < order.size(); i++) {
            if (name.equalsIgnoreCase(order.get(i).name)) {
                order.remove(order.get(i));
                return true;
            }
        }
        
        return false;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public double getTotal(){
        double total = 0;
        //Iterate through order and collate item cost
        
        for (int i = 0; i < order.size(); i++) {
            total += order.get(i).price;
        }
        
        return total;
    }

    @Override
    public String toString() {
        String output = "";
        output += "\nOrder ID: " + id;
        output += "\nCustomer Name: " + customerName;
        output += "\nItems: ";
        
        //Iterate through collection of items in order and add them to output
        for (int i = 0; i < order.size(); i++) {
            output += order.get(i).name;
            output += " - ";
            output += order.get(i).price;
            output += " ";
        }
        
        output += "\n";
        
        return output;
    }
}
