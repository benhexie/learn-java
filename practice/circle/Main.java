package circle;

import java.util.Scanner;

public class Main {
    static final double PI = 3.14159;

    static double Area(double radius) {
        return PI * Math.pow(radius, 2);
    }

    static double Perimeter(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        scanner.close();

        System.out.println("Area: " + Area(radius));
        System.out.println("Perimeter: " + Perimeter(radius));
    }
}
