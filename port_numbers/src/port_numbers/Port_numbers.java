package port_numbers;


public class Port_numbers {

    public static void main(String[] args) {
        //testA(100); //Tests return string method
        //testB(100, 50); //Tests search method - search for a specific port number
        testC(100); //Tests elementsExist method - searches array and checks each port number to see if it is open
    }
    
    public static void testA (int size) {
        TestData td = new TestData(size);
        
        System.out.println(td.returnString());
    }
    
    public static void testB (int size, int search) {
        TestData td = new TestData(size);
        
        System.out.println(td.searchInt(search));
    }
    
    public static void testC (int size) {
        TestData td = new TestData(size);
        
        String output = "";
        
        for (int i = 0; i < 65536; i++) {
            if (td.elementExists(i)) {
                output += i + "\n";
            }
        }
        
        System.out.println("Ports open at: \n" + output);
    }
}