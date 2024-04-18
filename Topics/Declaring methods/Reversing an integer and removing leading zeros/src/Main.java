// Necessary import statement
import java.util.*;

public class Main {
    // Method to reverse the input number
    // Don't forget to handle the leading zeros while returning the result
    public static int reverseNumber(int num) {
        // Your code goes here
    }

    public static void main(String[] args) {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        // Read an integer
        int num = in.nextInt();

        // Call the method reverseNumber and print the result.
        int reversedNum = reverseNumber(num);
        System.out.println(reversedNum);
    }
}