import java.util.Scanner; // This allows for taking user inputs

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // This creates a Scanner object to get the user's input
        String text = sc.nextLine();
        String comment = "// User input received";

        System.out.printf("%s\n%s", comment, text);
    }
}