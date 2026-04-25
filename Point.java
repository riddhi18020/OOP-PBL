/*Create a Point class representing a 2D point (x, y). Implement a default constructor that initializes
both x and y to 5. Provide a parameterized constructor to initialize x and y with user-supplied
values. Also, implement a copy constructor to create a new Point object as a copy of an existing
Point object. Include a display() method to show the point's coordinates and write a main method
to test all constructors and the display functionality. */

public class Point {

    // Data members
    int x, y;

    // Default constructor
    Point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    // Main method
    public static void main(String[] args) {

        // Default constructor
        Point p1 = new Point();
        System.out.print("Default Constructor: ");
        p1.display();

        // Parameterized constructor
        Point p2 = new Point(10, 20);
        System.out.print("Parameterized Constructor: ");
        p2.display();

        // Copy constructor
        Point p3 = new Point(p2);
        System.out.print("Copy Constructor: ");
        p3.display();
    }
}