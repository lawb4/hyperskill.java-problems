import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input;
        while (true) {
            input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            sum += input;
        }
        System.out.println(sum);
    }
}
