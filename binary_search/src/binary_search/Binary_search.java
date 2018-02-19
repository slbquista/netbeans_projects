package binary_search;

/**
 * @author Finn Turnbull
 */

public class Binary_search {

    public static void main(String[] args) {
        testBinarySearch(20);
    }
    
    public static void testBinarySearch (int searchValue) {
        int[] myArray = {14,17,28,36,56,64,72,85,89,94,99,114,152,185,199,304};
        
        //Creates new array instance from object
        Search testArray = new Search(myArray);
        
        //Stores the result of 
        int result = testArray.binarySearch(searchValue);
        
        //Logic defining responce depending on result
        if (result == -1) {
            System.out.println("Sorry no results were found.");
        } else {
            System.out.println("The result was found at element: " + result);
        }
    }
}
