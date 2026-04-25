/*Write a program that takes the lengths of three sides of a triangle as input. Calculate and print the
area of the triangle. Ensure that the program validates if the given side lengths can actually form a
triangle (sum of any two sides must be greater than the third side) before calculating the area (use
Heron's formula: Area = sqrt(s*(s-a)*(s-b)*(s-c)) where s = (a+b+c)/2). */

import java.util.Scanner;

public class HeronsFormula{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input sides
        System.out.print("Enter three sides of triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Check if valid triangle
        if ((a + b > c) && (a + c > b) && (b + c > a)) {

            // Calculate semi-perimeter
            double s = (a + b + c) / 2;

            // Heron's formula
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

            // Display result
            System.out.printf("Area of triangle: %.2f\n", area);

        } else {
            System.out.println("Invalid triangle! Sides do not satisfy triangle condition.");
        }

        input.close();
    }
}