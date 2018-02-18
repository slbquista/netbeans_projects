package number.conversions;

/**
 *
 * @author 1516392
 */
public class NumberConversions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(decimalToBinary(i));
        }
    }

    public static String decimalToBinary(int int_) {
        int min_ = 100;
        int max_ = 200;
    
        if (int_ == 0) {
            System.out.println(0);
        }

        String reverseString = "";
        int shreddedNumber = int_;

        while (shreddedNumber > 0) {
            String bit = "";

            if (shreddedNumber % 2 > 0) {
                bit = "1";
                shreddedNumber = (int) Math.floor(shreddedNumber / 2);
            } else {
                bit = (Integer.toString(shreddedNumber % 2));
                shreddedNumber = shreddedNumber / 2;
            }
            
            reverseString = reverseString.concat(bit);
        }
        
        String binaryString = "";
        
        for (int pos = reverseString.length() - 1; pos >= 0; pos --) {
            binaryString = binaryString+reverseString.charAt(pos);
        }
        
        return binaryString;
        
        
    }
}
