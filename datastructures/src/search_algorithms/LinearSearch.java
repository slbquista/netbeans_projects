/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search_algorithms;

/**
 *
 * @author 1516392
 */
public class LinearSearch implements ISearch {
    
    private int[] array;
    
    public LinearSearch(int[] array) {
        this.array = array;
    }
    
    public static void main (String[] args) {
        //Order of items doesn't matter
        int[] myArray = {24,2,45,20,56,75,2,56,99,53,12};
        
        //Creates object that is passed the array
        LinearSearch searcher = new LinearSearch(myArray);
        
        //Stores the result of using the searcher, with the search method applied to it
        int result = searcher.search(9999);
        
        if (result == -1) {
            System.out.println("Did not find the target");
        } else {
            System.out.println("Found at position " + result);
        }
    }
    
    @Override
    public int search(int target) {
        //Implements the Linear Search Algorithm
        
        int position = 0;
        
        while (position < array.length) {
            if (array[position] == target) {
                return position;
            } else {
                position++;
            }
        }
        
        return -1; //Not found
    }
}
