package hash_maps;
import linked_lists.LinkedList;


public class OpenHashMap {
    private LinkedList[] map;
    
    public OpenHashMap(int capacity) {
        map = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            map[i] = new LinkedList();
        }
    }
    
    public void add(int value) {
        int index = hashFunction(value);
        map[index].addToRear(value);
    }
    
    public int get(int value) {
        int index = hashFunction(value);
        return map[index].search(value);
    }
    
    private int hashFunction(int value) {
        return value % map.length;
    }
}
