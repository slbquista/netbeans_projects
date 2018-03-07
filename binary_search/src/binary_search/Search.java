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
    public int binarySearch (int searchValue) {
        int numRecords = array.length;
        int left = 0;
        int right = numRecords - 1;
        int position;
        
        while (left <= right) {
            position = (left + right) / 2;
            
            if (array[position] == searchValue) {
                return position;
            } else if (array[position] < searchValue) {
                left = position + 1;
            } else {
                right = position - 1;
            }
        }
        
        return -1;
    }
}
