/*Define a Java class named Rectangle. It should have two double data fields: width and height. In
your main method, create two Rectangle objects: one with width 4 and height 40, and another with
width 3.5 and height 35.9. For each rectangle, display its width, height, calculated area, and
perimeter. Then, compare the two rectangles based on their areas and print which one has a larger
area. */

public class BankAccount {

    // Instance variables
    String account_holder_name;
    double balance;

    // Static variable (common for all accounts)
    static double interest_rate = 5.0; // default 5%

    // Constructor
    BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    // Method to display details
    void display() {
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }

    // Static method to update interest rate
    static void updateInterestRate(double newRate) {
        interest_rate = newRate;
    }

    // Main method
    public static void main(String[] args) {

        // Creating objects
        BankAccount b1 = new BankAccount("Riddhi", 10000);
        BankAccount b2 = new BankAccount("Amit", 20000);

        // Display before updating interest rate
        System.out.println("Before updating interest rate:");
        b1.display();
        System.out.println();
        b2.display();

        // Update interest rate
        BankAccount.updateInterestRate(7.5);

        // Display after updating interest rate
        System.out.println("\nAfter updating interest rate:");
        b1.display();
        System.out.println();
        b2.display();
    }
}