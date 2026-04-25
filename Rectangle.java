/*Write a program that takes the lengths of three sides of a triangle as input. Calculate and print the
area of the triangle. Ensure that the program validates if the given side lengths can actually form a
triangle (sum of any two sides must be greater than the third side) before calculating the area (use
Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2). */

public class Rectangle {

    // Data fields
    double width = 1;
    double height = 1;

    // No-argument constructor
    Rectangle() {
        width = 1;
        height = 1;
    }

    // Parameterized constructor
    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }

    // Main method for testing
    public static void main(String[] args) {

        // Object using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("Default Rectangle:");
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        // Object using parameterized constructor
        Rectangle r2 = new Rectangle(5, 3);
        System.out.println("\nCustom Rectangle:");
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
    }
}