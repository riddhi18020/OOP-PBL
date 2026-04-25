/*Create an Employee class with private instance variables for employeeName (String) and
employeeSalary (double). Implement public methods readEmployeeData() (to take input from the
user) and displayEmployeeData() (to print the employee's name and salary). Demonstrate object
creation and method invocation in a main method. */

import java.util.Scanner;

public class Employee {

    // Private data members
    private String employeeName;
    private double employeeSalary;

    // Method to read employee data
    public void readEmployeeData() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = input.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = input.nextDouble();
    }

    // Method to display employee data
    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    // Main method
    public static void main(String[] args) {

        // Object creation
        Employee emp = new Employee();

        // Method calls
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}