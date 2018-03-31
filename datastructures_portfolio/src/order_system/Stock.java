package order_system;

import java.util.ArrayList;

/**
 * @author 1516392
 */

public class Stock {
    
    private static Stock instance;
    private static ArrayList<Item> stock;

    private Stock() {
        //Create a collection of items that we hold in stocks
        this.stock = new ArrayList();
        stock.add(new Item("Whisky", 50));
        stock.add(new Item("Bread", 0.5));
        stock.add(new Item("Cereal", 1));
        stock.add(new Item("Lawn", 420));
        stock.add(new Item("Lawnmower", 210));
    }

    public static Stock getInstance() {
        if(instance == null)
            instance = new Stock();
        return instance;
    }

    public Item getItem(String name){
        //Iterate through items and return item if found
        for (int i = 0; i < stock.size(); i++) {
            if (name.equalsIgnoreCase(stock.get(i).name)) {
                return stock.get(i);
            }
        }
        
        //If nothing is found, ie. no return has been made so far:
        return null;
    }
}
