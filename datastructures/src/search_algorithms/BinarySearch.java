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
public class BinarySearch implements ISearch{
    
    private int[] array;
    
    public BinarySearch(int[] array) {
        this.array = array;
    }
    
    public static void main(String[] args) {
        //Items must be sorted low to high
        
        int[] myArray = {2, 12, 20, 24, 45, 53, 56, 56, 75, 99};
        
        BinarySearch searcher = new BinarySearch(myArray);
        
        System.out.println("Searching...");
        
        int result = searcher.search(56);
        
        if (result == -1) {
            System.out.println("Not found.");
        } else {
            System.out.println("Found at index: " + result);
        }
        
        System.out.println("Search Complete.");
    }

    @Override
    public int search(int target) {
        int bottom = 0;
        int top = array.length - 1;
        
        while (bottom <= top) {
            int middle = (bottom + top) / 2;
            
            if (array[middle] == target) {
                return middle;
            }
            
            if (array[middle] < target) {
                bottom = middle + 1;
            } else {
                top = middle - 1;
            }
        }
        
        return - 1; //Not found.
    }
}
