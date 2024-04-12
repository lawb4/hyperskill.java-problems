import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // read the first integer
        int a = scanner.nextInt();

        // read the second integer
        int b = scanner.nextInt();

        // Perform the comparison of a and b

        if (a > b) {
            System.out.println("Greater");
        } else if (a < b) {
            System.out.println("Less");
        } else {
            System.out.println("Equal");
        }
    }
}