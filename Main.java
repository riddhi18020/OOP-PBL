/*Create a base class named Employee that contains a method displayDetails() which prints general
employee details such as name and department. Now create a subclass Manager that inherits from
Employee and overrides the displayDetails() method to include additional information such as the
manager's team size or project name. In the main method, create objects of both Employee and
Manager classes and call the displayDetails() method using each object to show how Java
determines which version of the method to execute at runtime. */

// Base class
class Employee {
    String name;
    String department;

    // Constructor
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Subclass
class Manager extends Employee {
    int teamSize;
    String projectName;

    // Constructor
    Manager(String name, String department, int teamSize, String projectName) {
        super(name, department);
        this.teamSize = teamSize;
        this.projectName = projectName;
    }

    // Overriding method
    @Override
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project: " + projectName);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Employee object
        Employee e1 = new Employee("Riddhi", "IT");
        System.out.println("=== Employee Details ===");
        e1.displayDetails();

        // Manager object
        Employee m1 = new Manager("Amit", "HR", 10, "Project Alpha");
        System.out.println("\n=== Manager Details ===");
        m1.displayDetails(); // Runtime Polymorphism
    }
}