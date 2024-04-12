import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Read the number of apples from the user
        int apples = sc.nextInt();

        // Read the number of oranges from the user
        int oranges = sc.nextInt();

        // Calculate the total number of fruits
        int result = apples + oranges;

        // Print the result
        System.out.println(result);
    }
}