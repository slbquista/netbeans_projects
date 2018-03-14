package generics.object_list;

/**
 *
 * @author 1516392
 */
public class List <T> {
    private Node<T> head;
    private Node<T> tail;
    
    public List(){
        head = null;
        tail = null;
    }
    
    public void insertAtFront(T _item){
        if(isEmpty()){
            head = tail = new Node<>(_item);
        } else {
            Node temp = new Node<>(_item);
            temp.setNext(head);
            head = temp;
        }
    }
    
    public void insertAtBack(T _item){
        if(isEmpty()){
            head = tail = new Node<>(_item);
        }else{
            Node temp = new Node<>(_item);
            tail.setNext(temp);
            tail = temp;
        }
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void traverse(){
        if(isEmpty()){
            System.out.println("List is empty!");
        }else{
            Node temp = head;
            while (temp != null){
                System.out.println(temp.getData());
                temp = temp.getNextNode();
            }
        }
    }
}
