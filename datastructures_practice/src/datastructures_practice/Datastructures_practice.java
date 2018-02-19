package datastructures_practice;

public class Datastructures_practice {

    public static void main(String[] args) {
        //Run test methods here
        //linearSearchTest(17);
        binarySearchTest(28);
    }
    
    //Test method for the linearSearchTest
    public static void linearSearchTest (int searchValue) {
        //Declared array
        int[] myArray = {2,8,9,12,15,17,22,27,29,33,35,39,42,45,47,50};
        
        //Creates new array instance from object
        Search testArray1 = new Search(myArray);
        
        //Stores the result of 
        int result = testArray1.linearSearch(searchValue);
        
        //Logic defining responce depending on result
        if (result == -1) {
            System.out.println("Sorry no results were found.");
        } else {
            System.out.println("The result was found at element: " + result);
        }
    }
    
    public static void binarySearchTest (int searchValue) {
        int[] myArray = {1,8,12,15,16,17,28,29,31,33,41,52,67,69,74,75};
        
        //Creates new array instance from object
        Search testArray2 = new Search(myArray);
        
        //Stores the result of 
        int result = testArray2.linearSearch(searchValue);
        
        //Logic defining responce depending on result
        if (result == -1) {
            System.out.println("Sorry no results were found.");
        } else {
            System.out.println("The result was found at element: " + result);
        }
    }
}
