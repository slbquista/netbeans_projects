package bubble_sort;

/**
 * @author Finn Turnbull
 */

public class Sort {
    //Declares variables for operation
    String[] array;

    //Constructor for the array
    public Sort(String[] array) {
        this.array = array;
    }
    
    //Insert pseudo code system here
    //To convert this from sorting integers to sorting 3 character names into alphabetic order, perhaps assign each letter to it's numeric place in the alphabet, then compare that number
    //Alternatively convert method to compare strings
    public String[] bubbleSort (String searchValue) {
        boolean swapMode = true;
        int sizeOfList = array.length;
        int numComparisons = sizeOfList - 1;
        String temp;
        
        while (swapMode) {
            swapMode = false;
            
            for (int i = 0; i < numComparisons; i++) { // < numComparisons == <= numComparisons - 1
                int compare = array[i].compareTo(array[i + 1]);
                
                if (compare > 0) {
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
