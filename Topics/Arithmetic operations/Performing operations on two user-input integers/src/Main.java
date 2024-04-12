import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt(); // Read first integer
        int num2 = scanner.nextInt(); // Read second integer

        // Perform the operations as per the problem statement and store the result in a variable
        int result = num1 * num2 - num2 + num1;


        System.out.println(result); // Print the result
    }
}