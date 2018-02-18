package array_list;

/**
 *
 * @author kevin.mcdonald
 */
public class ListClient {
    public static void main(String[] args) {
        //IList list = new LinkedList();
        IList list = new ArrayList();
        for(int i = 0; i < 10; i++){
            list.addToRear(i*5);
        }
        list.addToFront(5);
        list.addToFront(7);
        list.addToFront(9);
        list.addToRear(15);
        
        while(!list.isEmpty())
            System.out.println(list.removeFromFront());
        
        System.out.println("===");
        
        list.addToFront(5);
        list.addToFront(7);
        list.addToFront(9);
        list.addToRear(15);
        
        while(!list.isEmpty())
            System.out.println(list.removeFromRear());
        
        
        if(list.isEmpty())
            System.out.println("List is empty!");
        
        list.addToFront(5);
        list.addToFront(7);
        list.addToFront(9);
        list.addToRear(15);
        System.out.println("Front:" + list.peekAtFront());
        System.out.println("Rear:" + list.peekAtRear());
        
        int index = list.search(5);
        if (index == -1)
            System.out.println("Not found.");
        else
            System.out.println("Found at index: " + index);
    }
}
