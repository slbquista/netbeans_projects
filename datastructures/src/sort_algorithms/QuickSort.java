/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort_algorithms;

/**
 *
 * @author 1516392
 */
public class QuickSort implements ISort {
    
    private int[] array;
    private int length;
    
    public QuickSort (int[] array) {
        this.array = array;
        this.length = array.length;
    }
    
    public static void main(String[] args) {
        int[] myArray = {24,2,45,20,56,75,2,56,99,53,12};
        
        ISort sorter = new QuickSort(myArray);
        
        System.out.println("Quick Sort\n");
        System.out.println("Pre-Sort");
        for (int value:myArray) { //For each value in myArray
            System.out.print(value + " | ");
        }
        
        myArray = sorter.sort();
        System.out.println("\nPost-Sort");
        for (int value:myArray) { //For each value in myArray
            System.out.print(value + " | ");
        }
        
        System.out.println("\n");
    }
    
    @Override
    public int[] sort() {
        quickSort (0, length - 1);
        
        return array;
    }
    
    public void quickSort (int left, int right) {
        if (left >= right) {
            return;
        }
        
        //Set pivot point
        int pivot = array[(left + right) / 2];
        
        int index = partition(left, right, pivot);
        
        //Recursively call self
        quickSort(left, index -1);
        quickSort(index, right);
        
        
    }
    
    private int partition (int left, int right, int pivot) {
        while (left <= right) {
            
            while (array[left] < pivot) {
                //Move up from left
                left++;
            }
            
            while (array[right] > pivot) {
                //Move down from right
                right--;
            }
            
            if (left <= right) {
                //Swap sides
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                
                //Carry on moving inwards
                left++;
                right--;  
            }
        }
        return left;
    }
    
}
