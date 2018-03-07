package hash_maps;

public class LinearHashMap {
    private int [] map;
    private int size;
    
    public LinearHashMap(int capacity) {
        map = new int[capacity];
        for (int i = 0; i < capacity; i++) {
            map[i] = -1;
        }
    }
    
    private int hashFunction(int value) {
        return value % map.length;
    }
    
    public void add(int value) {
        int index = hashFunction(value);
        int startIndex = index;
        do {
            if (map[index] == - 1) {
                map[index] = value;
                return;
            } else {
                index++;
                index = index % map.length;
                
            }
        } while (index != startIndex);
    }
    
    public int get(int value) {
        int index = hashFunction(value);
        int startIndex = index;
        do {
            if (map[index] == value) {
                return index;
            } else if (map[index] == -1) {
                return - 1;
            } else {
                index++;
                index = index % map.length;
            }
        } while (index != startIndex);
        
        return -1;
    }
}
