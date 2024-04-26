import java.util.Scanner;

// Define the Circle class here
class Circle {
    // Declare the properties of the Circle class here
    private int radius;
    private int area;

    /* Define the default and parameterized constructors here. The constructors should initialize the 
       'radius' property with the given or default value and 'area' property with the value calculated as πr^2 
        rounded off to the nearest whole number. */
    public Circle() {
        this.radius = 1;
        this.area = getArea();
    }

    public Circle(int radius) {
        this.radius = radius;
        this.area = getArea();
    }


    // Getters for the 'radius' and 'area' properties
    public int getRadius() {
        return radius;
    }

    public int getArea() {
        return (int) Math.round(Math.PI * Math.pow(radius, 2));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // create a Circle object using 'n' if its positive else use the default constructor
        Circle circle;
        if (n > 0) {
            circle = new Circle(n);
        } else {
            circle = new Circle();
        }

        // print the circle's radius and area
        System.out.printf("%d %d", circle.getRadius(), circle.getArea());
    }
}