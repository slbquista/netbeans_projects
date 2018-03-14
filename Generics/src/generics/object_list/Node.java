package generics.object_list;

/**
 *
 * @author 1516392
 */
public class Node <T>{
    private final T data;
    private Node next;
    
    public Node (T _data){
        data = _data;
        next = null;
    }
    
    public T getData(){
        return data;
    }
    
    public Node getNextNode(){
        return next;
    }
    
    public void setNext(Node _next){
        next = _next;
    }
}
