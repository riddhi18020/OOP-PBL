/*Write a Java program using packages to generate a mark sheet for students. Create a package
student that contains a class Student with the following:
● Data members: rollNo, name.
● A constructor to initialize student details.
● A method displayStudent() to display student information.
Create another package exam that contains a class Result which:
● Extends the Student class.
● Has data members: marks1, marks2, marks3.
● A method displayResult() that prints the student’s mark sheet including total and average marks.
In the main method (inside the exam package), create a student with marks and display the mark
sheet. */

// File: exam/Result.java
package exam;

import student.Student;

public class Result extends Student {

    // Data members
    int marks1, marks2, marks3;

    // Constructor
    public Result(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    // Method to display result
    public void displayResult() {

        displayStudent();

        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }

    // Main method
    public static void main(String[] args) {

        Result r = new Result(101, "Riddhi", 80, 75, 90);
        r.displayResult();
    }
}
/*Write a Java program using packages to generate a mark sheet for students. Create a package
student that contains a class Student with the following:
● Data members: rollNo, name.
● A constructor to initialize student details.
● A method displayStudent() to display student information.
Create another package exam that contains a class Result which:
● Extends the Student class.
● Has data members: marks1, marks2, marks3.
● A method displayResult() that prints the student’s mark sheet including total and average marks.
In the main method (inside the exam package), create a student with marks and display the mark
sheet. */

// File: student/Student.java
package student;

public class Student {

    // Data members
    protected int rollNo;
    protected String name;

    // Constructor
    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Method to display student details
    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}
