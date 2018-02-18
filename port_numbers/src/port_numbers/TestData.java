package port_numbers;

import java.util.Random;

public class TestData {
    private int[] array;
    private String output = "";

    public TestData(int[] array) {
        this.array = array;
        this.output = "";
    }
    
    public TestData (int size) {
        array = new int[size];
        
        Random randomNum = new Random();
        
        for (int i = 0; i < array.length; i++) {
            array[i] = 0 + randomNum.nextInt(65536); //65536 not inclusive
        }
        
    }
    
    public String returnString () {
        for (int i = 0; i < array.length; i++) {
            output += i + ": " + array[i] + "\n";
        }
        
        return output;
    }
    
    public String searchInt (int search) {
        String result = "";
        String counter = "";
        boolean noResults = true;
        
        for (int i = 0; i < array.length; i++) {
            if (search == array[i]) {
                counter += i + "\n";
                noResults = false;
            }
        }
        
        if (noResults) {
            System.out.println("Sorry port number " + search + " not found.");
        } else {
            result = "The integer is found at element(s): \n" + counter;
        }
        
        return result;
    }
    
    public boolean elementExists (int search) {
        boolean result = false;
        
        for (int i = 0; i < array.length; i++) {
            if (search == array[i]) {
                result = true;
                break;
            }
        }
        
        return result;
    }
}
