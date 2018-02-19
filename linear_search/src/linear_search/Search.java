package linear_search;

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
    public int linearSearch (int searchValue) {
        int position = 0;
        
        while (position < array.length) {
            if (array[position] == searchValue) {
                return position;
            } else {
                position++;
            }
        }
        
        return -1; //Not found
    }
}
