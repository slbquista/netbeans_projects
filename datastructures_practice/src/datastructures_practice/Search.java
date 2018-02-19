package datastructures_practice;

public class Search {
    //Declares variables for operation
    int[] array;

    //Constructor for the array
    public Search (int[] array) {
        this.array = array;
    }
    
    //Operation logic - insert pseudo code system here!
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
