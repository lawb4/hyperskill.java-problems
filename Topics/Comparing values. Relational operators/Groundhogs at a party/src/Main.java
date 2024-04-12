import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int numberOfCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        boolean isPartySuccessful = true;

        if (numberOfCups >= 10 && numberOfCups <= 20 && !isWeekend
                || numberOfCups >= 15 && numberOfCups <= 25 && isWeekend) {
            System.out.println(isPartySuccessful);
        } else {
            System.out.println(!isPartySuccessful);
        }
    }
}