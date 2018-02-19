package binary_search;

/**
 * @author Finn Turnbull
 */

public class Search {
    //Declares variables for operation
    int[] array;

    //Constructor for the array
    public Search (int[] array) {
        this.array = array;
    }
    
    //Insert pseudo code system here
    //To convert this from sorting integers to sorting 3 character names into alphabetic order, perhaps assign each letter to it's numeric place in the alphabet, then compare that number
    //Alternatively convert method to compare strings
    public int[] binarySearch (int searchValue) {
        boolean swapMode = true;
        int sizeOfList = array.length;
        int numComparisons = sizeOfList - 1;
        int temp;
        
        while (swapMode) {
            swapMode = false;
            
            for (int i = 0; i < numComparisons; i++) { // < numComparisons == <= numComparisons - 1
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    
                    swapMode = true;
                }
            }
            
            numComparisons--;
        }
        
        //Return sorted array
        return array;
    }
}
