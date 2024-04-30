import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TODO: Create two Rectangle objects
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        // TODO: Read the width and height for the first rectangle
        r1.width = scanner.nextInt();
        r1.height = scanner.nextInt();

        // TODO: Read the width and height for the second rectangle
        r2.width = scanner.nextInt();
        r2.height = scanner.nextInt();

        // TODO: Print the area of each rectangle
        System.out.println(getArea(r1.width, r1.height));
        System.out.println(getArea(r2.width, r2.height));
    }

    public static int getArea(int width, int height) {
        return width * height;
    }
}

// TODO: Define the Rectangle class with width and height properties
class Rectangle {
    int width;
    int height;
}