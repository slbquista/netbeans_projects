package generics.object_list;

/**
 *
 * @author 1516392
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> l1 = new List<>();
        l1.insertAtFront(15);
        l1.insertAtFront(20);
        l1.insertAtFront(25);
        l1.traverse();
        
        List<String> l2 = new List<>();
        l2.insertAtFront("Kevin");
        l2.insertAtFront("Chris");
        l2.insertAtFront("Finn");
        l2.traverse();
        
        List<Student> l3 = new List<>();
        l3.insertAtFront(new Student("Finn", 22));
        l3.traverse();
    }
}
