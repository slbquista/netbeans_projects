package bubble_sort;

/**
 * @author Finn Turnbull
 */

public class Bubble_sort {

    public static void main(String[] args) {
        testBubbleSort("Bob");
    }
    
    public static void testBubbleSort (String searchValue) {
        String[] myArray = {"Bob","Ali","Ann","Tom","Dot","Eva","Guy","Ian","Jak","Jim","Joe","Kay","Ron","Kim","Roy","Tim"};
        
        //Creates new array instance from object
        Sort testArray = new Sort(myArray);
        
        //Stores the result of 
        String result[] = testArray.bubbleSort(searchValue);
        
        for (String value:myArray) { //For each value in myArray
            System.out.print(value + " | ");
        }
    }
}
