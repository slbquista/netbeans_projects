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
public class InsertionSort implements ISort {
    private int[] array;
    
    public InsertionSort(int[] array) {
        this.array = array;
    }
    
    public static void main(String[] args) {
        int[] myArray = {24,2,45,20,56,75,2,56,99,53,12};
        
        ISort sorter = new InsertionSort(myArray);
        
        System.out.println("Insertion Sort\n");
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
       for (int marker = 1; marker < array.length; marker++) {
           for (int right = marker; right > 0; right--) {
               int left = right - 1;
               
               if (array[right] < array[left]) {
                   int temp = array[right];
                   array[right] = array[left];
                   array[left] = temp;
               }
           }
       }
       
       return array;
    }
    
}