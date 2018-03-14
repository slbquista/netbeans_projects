package pkg2d_arrays_revisited;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        testArrays3();
    }
    
    public static void testArrays1() {
        Grid testArray = new Grid();
        System.out.println(testArray.toString());
    }
    
    public static void testArrays2() {
        Grid testArray = new Grid(10,10);
        System.out.println(testArray.toString());
    }
    
    public static void testArrays3() {
        Grid testArray = new Grid(10,10,1);
        System.out.println(testArray.toString());
    }
    
}
