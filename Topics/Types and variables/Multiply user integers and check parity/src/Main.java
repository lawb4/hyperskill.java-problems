import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Read two integers from the user
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // TODO: Multiply the two integers
        int result = a * b;
        // TODO: Print out the result
        System.out.println(result);
        // TODO: Determine if the result is even or odd
        String evenOrOdd = result % 2 == 0 ? "even" : "odd";
        System.out.println(evenOrOdd);
        scanner.close();
    }
}