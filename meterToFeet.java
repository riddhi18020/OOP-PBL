/*Develop a Java program that prompts the user to enter a distance in meters. Your program should
then convert this distance to feet (1 meter = 3.28084 feet) and display the result formatted to two
decimal places.*/

import java.util.Scanner;

public class meterToFeet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a distance in meters: ");
        double meters = input.nextDouble();

        // Convert meters to feet
        double feet = meters * 3.28084;

        // Display result formatted to two decimal places
        System.out.printf("Distance in feet: %.2f\n", feet);

        input.close();
    }
}