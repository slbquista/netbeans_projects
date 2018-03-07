package hash_maps;

public class ClosedHashMap {
    private int[] map;
    private int size;
    
    public ClosedHashMap(int capacity) {
        this.size = 0;
        map = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            map[i] = -1;
        }
    }
    
    public void add(int value) {
        int index = hashFunction(value);
        if (map[index] == -1) {
            map[index] = value;
        } else {
            System.out.println("Collision at index " + index);
        }
    }
    
    public int get(int value) {
        int index = hashFunction(value);
        if (map[index] == value) {
            return index;
        }
        return - 1;
    }
    
    private int hashFunction(int value) {
        return value % map.length;
    }
}
