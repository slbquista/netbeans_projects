/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twodarrays;

/**
 *
 * @author 1516392
 */
public class MyArray {

    int rows = 2000;
    int cols = 20;

    

    int[][] array = new int[cols][rows];
    

    public void readArray() { //Static not right, void doesn't seem right either?
        int r, c;
            
        for (r = 0; r < rows; r++) {
            for (c = 0; c < cols; c++) {
                System.out.println(array[r][c] + " ");
            }
            
            System.out.println();
        }
    }
}
