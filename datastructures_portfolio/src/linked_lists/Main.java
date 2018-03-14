package linked_lists;

public class Main {
    public static void main(String[] args) {
        //Instantiate our List
        IList list = new LinkedList();
        
        //Add 5 values to Rear
        for (int i = 1; i <=5; i++) {
            list.addToRear(i * 5);
        }
        
        //Add 4 values to front
        for(int i = 1; i <=4; i++) {
            list.addToFront(i * 20);
        }
        
        //Output all values from the front
        while(!list.isEmpty()) {
            System.out.println(list.removeFront());
        }
        
        //Add 3 values to front and 1 value to rear
        list.addToFront(99);
        list.addToFront(101);
        list.addToFront(103);
        list.addToRear(105);
        
        // Output all values from the rear
        while(!list.isEmpty()) {
            System.out.println(list.removeRear());
        }
        
        //Add some stuff anywhere
        for(int i = 0; i < 10; i++) {
            list.addToFront(i * 5);
        }
        
        //Search list for a value
        int result = list.search(15);
        if(result == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + result);
        }
    }
}
