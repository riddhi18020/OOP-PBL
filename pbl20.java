/*Take the value of denominator and numerator from user using command-line argument.
Implement the concept of exception handling to manage all possible run-time error. */

public class Main {
    public static void main(String[] args) {

        try {
            // Check if arguments are provided
            if (args.length < 2) {
                System.out.println("Please provide numerator and denominator.");
                return;
            }

            // Convert arguments to integers
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            // Perform division
            int result = numerator / denominator;

            // Display result
            System.out.println("Result: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter integers only.");
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Unexpected error occurred.");
        }
    }
}
