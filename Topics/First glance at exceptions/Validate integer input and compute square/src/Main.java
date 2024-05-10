import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        try {
            if (input < 0) {
                throw new InvalidInputException("Input must be non-negative.");
            } else if (input > 0) {
                int square = input * input;
                System.out.println(square);
            } else {
                System.out.println("Input is zero.");
            }
        } catch (InvalidInputException e) {
            System.out.println("InvalidInputException: " + e.getMessage());
        }
    }
}

class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}