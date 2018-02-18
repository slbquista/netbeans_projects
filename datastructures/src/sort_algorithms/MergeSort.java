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
public class MergeSort implements ISort {
    
    private int[] array;
    private int[] tempMergeArr;
    private int length;
    
    public MergeSort(int[] array) {
        this.array = array;
        this.length = array.length;
        this.tempMergeArr = new int[length];
    }
    
    public static void main(String[] args) {
        int[] myArray = {24,2,45,20,56,75,2,56,99,53,12};
        
        ISort sorter = new MergeSort(myArray);
        
        System.out.println("Merge Sort\n");
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
        doMergeSort(0, length - 1);
        
        return array;
    }
    
    private void doMergeSort(int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            
            //This sorts the left side of the array (split)
            doMergeSort(left, middle);
            
            //This sorts the right side of the array (split)
            doMergeSort(middle + 1, right);
            
            //Now merge both sides
            mergeParts(left, middle, right);
        }
    }
    
    private void mergeParts(int left, int leftEnd, int right) {
        for (int i = left; i <= right; i++) {
            tempMergeArr[i] = array[i];
        }
        
        int leftStart = left;
        int rightStart = leftEnd + 1;
        int index = left;
        
        while (leftStart <= leftEnd && rightStart <= right) {
            if (tempMergeArr[leftStart] <= tempMergeArr[rightStart]) {
                array[index] = tempMergeArr[leftStart];
                leftStart++;
            } else {
                array[index] = tempMergeArr[rightStart];
                rightStart++;
            }
            index++;
        }
        
        while (leftStart <= leftEnd) {
            array[index] = tempMergeArr[leftStart];
            index++;
            leftStart++;
        }
    }
}
