package array_list;

/**
 *
 * @author kevin.mcdonald
 */
public interface IList {

    public void addToFront(int value);

    public void addToRear(int value);

    public boolean isEmpty();

    public int peekAtFront();

    public int peekAtRear();

    public int removeFromFront();

    public int removeFromRear();

    public int search(int item);

    public int size();
    
}
