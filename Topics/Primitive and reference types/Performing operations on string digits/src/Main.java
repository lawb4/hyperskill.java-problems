import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize new scanner instance
        Scanner scanner = new Scanner(System.in);

        // Read the user input as a string
        String digitStr = scanner.nextLine();

        char lastCharacterOfTheString = digitStr.charAt(digitStr.length() - 1);

        if (Character.isDigit(lastCharacterOfTheString)) {
            int digit = Integer.parseInt(String.valueOf(lastCharacterOfTheString));

            if (digit % 2 == 0) {
                System.out.println(digit * 2);
            } else {
                System.out.println(digit + 5);
            }
        }

        // TODO:
        // 1. Check if the last character of digitStr is a digit
        // 2. If it is a digit, check if it is even or odd
        // 3. Depending on whether it is even or odd, transform the digit to an Integer and perform the necessary operations
        // 4. Print the result

        // Don't forget to close the scanner!
        scanner.close();
    }
}