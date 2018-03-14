package pkg2d_arrays_revisited;

public class Grid {
    int rows;
    int cols;

    int[][] array;
    
    public Grid () {
        rows = 8;
        cols = 8;
        this.array = new int[rows][cols];
        int pos = 0;
        
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array.length; col++) {
                array[row][col] = pos++;
            }
        }
    }
    
    public Grid (int rows, int cols) {
        this.array = new int[rows][cols];
        int pos = 0;
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                array[row][col] = pos++;
            }
        }
    }
    
    public Grid (int rows, int cols, int start) {
        this.array = new int[rows][cols];
        
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                array[row][col] = start++;
            }
        }
    }
    
    @Override
    public String toString() {
        String elements = "";
        
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                
                elements += padding("" + array[row][col], 5, ' ');
            }
            
            elements += "\r\n";
        }
        
        return elements;
    }
    
    public String padding(String arrVal, int maxLength, char paddVal) {
        String paddingString = "";
        int paddingLength = maxLength - arrVal.length();
        
        for (int i = 0; i < paddingLength; i++) {
            paddingString += paddVal;
        }
        
        return paddingString + arrVal;
    }
}
