/*Develop a Java application that calculates a person's Body Mass Index (BMI). The program should
ask the user for their weight in pounds and height in inches. Convert these values to kilograms and
meters respectively (1 pound = 0.45359237 kg, 1 inch = 0.0254 meters) and then calculate BMI
(weight in kg / (height in meters)^2). Display the calculated BMI. */

import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input from user
        System.out.print("Enter weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInches = input.nextDouble();

        // Convert to kg and meters
        double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

        // Calculate BMI
        double bmi = weightKg / (heightMeters * heightMeters);

        // Display result
        System.out.printf("Your BMI is: %.2f\n", bmi);

        input.close();
    }
}