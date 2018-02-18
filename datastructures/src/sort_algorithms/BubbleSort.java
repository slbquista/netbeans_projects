/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort_algorithms;

import search_algorithms.LinearSearch;

/**
 *
 * @author 1516392
 */
public class BubbleSort implements ISort {

    private int[] array;
    
    public BubbleSort(int[] array) {
        this.array = array;
    }
    
    public static void main(String[] args) {
        int[] myArray = {24,2,45,20,56,75,2,56,99,53,12};
        
        ISort sorter = new BubbleSort(myArray);
        
        System.out.println("Bubble Sort\n");
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
        int top = array.length;
        int temp = 0;
        
        for (int i = 0; i < top; i++) {
            for (int right = 1; right < (top - i); right++) {
                int left = right - 1;
                
                if (array[left] > array[right]) {
                    temp = array[left]; //Puts the larger number into temp
                    array[left] = array[right]; //Sets left to the smaller number
                    array[right] = temp; //Puts the larger number back into the array
                }
            }
        }
        
        return array;
    }
    
}
