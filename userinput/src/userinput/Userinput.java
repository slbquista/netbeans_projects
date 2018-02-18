package userinput;

import java.util.Scanner;

public class Userinput {

    public static void main(String[] args) {
        //userInputString(); //Asks for favourite colour
        //System.out.println(userInputString2() + userInputString2()); //Asks for an integer (stored as a string)
        //System.out.println("The int is: " + userInputInt()); //Asks for an integer (stored as an int)
        double localDouble = 0.0;
        try {
            localDouble = userInputDouble();
            System.out.println("The local double is -> " + localDouble);
        } catch (NumberFormatException e) {
            System.out.println("Exeption: " + e + "\n-> Please use the correct number format (double)");
        }
    }
    
    public static String userInputString() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What is your favourite colour? ");
        String name = scanner.next();
        System.out.println("Your favourite colour is: " + name); //Should not be done here
        return name;
    }
    
    public static String userInputString2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a number -> ");
        String number = scanner.next();
        return number;
    }
    
    public static int userInputInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer -> ");
        //Instead of scanner.next() use nextInt()
        int number = scanner.nextInt();
        return number;
    }
    
    public static double userInputDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type in a floating point number -> ");
        String number = scanner.next(); //Better: user nextDouble()
        return Double.parseDouble(number); //Explicit convertion (necessary)
    }
}
