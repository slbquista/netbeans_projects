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
public class SelectionSort implements ISort {
    
    private int[] array;
    
    public SelectionSort(int[] array) {
        this.array = array;
    }

    public static void main(String[] args) {
        int[] myArray = {24,2,45,20,56,75,2,56,99,53,12};
        
        ISort sorter = new SelectionSort(myArray);
        
        System.out.println("Selection Sort\n");
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
        for (int i = 0; i < array.length; i++) {
            int index = i;
            
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
                
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        
        return array;
    }
    
}
