import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int firstOperation = input % 2;
        // The first operation goes here
        System.out.println(firstOperation);
        // The second operation goes here
        System.out.println(firstOperation * 3);

        scanner.close();
    }
}