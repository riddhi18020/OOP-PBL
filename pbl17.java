/*Write the Java code for an interface named Exam which declares a single abstract method boolean
isPassed(int mark). This method should take an integer mark as an argument. Write the Java code
for another interface named Classify which declares a single abstract method String
getDivision(double average). This method should take a double average as an argument. Create a
class named Result that implements both the Exam and Classify interfaces. Provide concrete
implementations for isPassed() and getDivision() methods. In your main method, create an
instance of Result, set some marks and average, and demonstrate the use of both interface
methods. */

// Interface Exam
interface Exam {
    boolean isPassed(int mark);
}

// Interface Classify
interface Classify {
    String getDivision(double average);
}

// Class implementing both interfaces
class Result implements Exam, Classify {

    // Implement isPassed method
    public boolean isPassed(int mark) {
        return mark >= 40; // pass if 40 or more
    }

    // Implement getDivision method
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No First Division";
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Result r = new Result();

        int marks = 55;
        double avg = 65.5;

        // Using Exam interface method
        if (r.isPassed(marks)) {
            System.out.println("Student Passed");
        } else {
            System.out.println("Student Failed");
        }

        // Using Classify interface method
        System.out.println("Division: " + r.getDivision(avg));
    }
}
