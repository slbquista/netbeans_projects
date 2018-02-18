package linked_lists;

public class Node {
    Node next;
    int data;
    
    public Node(int value){
        this.data = value;
        this.next =  null;
    }
    
    public void setNode(Node node){
        next = node;
    }
    
    public Node getNode(){
        return next;
    }
    
    public void setData(int value){
        data = value;
    }
    
    public int getData(){
        return data;
    }
}
