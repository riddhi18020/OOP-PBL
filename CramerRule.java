/*Write a Java program to solve a system of two linear equations with two variables (e.g., ax + by =
e and cx + dy = f). Prompt the user to enter the coefficients a, b, c, d, e, f. Calculate and display the
values of x and y using Cramer's rule. Include error handling for cases where the denominator is
zero Cramer's rule : D=ad−bc, Dx=ed−bf, Dy=af−ce, x=Dx/D, y=Dy/D */

import java.util.Scanner;

public class CramerRule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Calculate determinants
        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        // Check if solution exists
        if (D == 0) {
            System.out.println("The equation has no unique solution (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            // Display result
            System.out.printf("Value of x: %.2f\n", x);
            System.out.printf("Value of y: %.2f\n", y);
        }

        input.close();
    }
}