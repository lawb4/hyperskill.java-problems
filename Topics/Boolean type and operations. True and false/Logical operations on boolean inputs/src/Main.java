import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first boolean value
        boolean firstValue = scanner.nextBoolean();

        // Read the second boolean value
        boolean secondValue = scanner.nextBoolean();

        // Perform the logical AND operation
        System.out.println(firstValue && secondValue);

        // Perform the logical OR operation
        System.out.println(firstValue || secondValue);
        // Perform the logical NOT operation on the first value
        System.out.println(!firstValue);
    }
}