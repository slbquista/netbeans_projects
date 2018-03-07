
package hash_maps;

public class Client {
    public static void main(String[] args) {
//        ClosedHashMap chm = new ClosedHashMap(11);
//        int[] value = {23, 44, 66, 55, 21, 27, 99, 68};
//
//        for (int i = 0; i < value.length; i++) {
//            chm.add(value[i]);
//        }
//        
        
//        LinearHashMap lhm = new LinearHashMap(11);
//        int[] array = {23, 44, 66, 55, 21, 27, 99, 68};
//
//        for (int i = 0; i < array.length; i++) {
//            lhm.add(array[i]);
//        }
        
        OpenHashMap ohm = new OpenHashMap(11);
        int[] array2 = {23, 44, 66, 55, 21, 27, 99, 68};

        for (int i = 0; i < array2.length; i++) {
            ohm.add(array2[i]);
        }
    }
}
