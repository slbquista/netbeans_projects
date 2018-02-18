package linked_lists;

public interface IList {
    
    public void addToFront(int value);
    
    public void addToRear(int value);
    
    public boolean isEmpty();
    
    public int peekAtFront();
    
    public int peekAtRear();
    
    public int removeFront();
    
    public int removeRear();
    
    public int search(int target);
    
    public int size();
}
