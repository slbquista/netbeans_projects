package linear_search;

/**
 * @author Finn Turnbull
 */

public class Linear_search {

    public static void main(String[] args) {
        testLinearSearch(74);
    }
    
    public static void testLinearSearch(int searchValue) {
        //Declare array
        int[] myArray = {6,12,18,24,29,36,43,47,55,61,68,72,74,77,85,90};
        
        //Creates new array instance from object
        Search testArray1 = new Search(myArray);
        
        //Stores the result of the search
        int result = testArray1.linearSearch(searchValue);
        
        //Output responce depending on result
        if (result == -1) {
            System.out.println("Sorry no results were found.");
        } else {
            System.out.println("The result was found at element: " + result);
        }
    }
    
}
