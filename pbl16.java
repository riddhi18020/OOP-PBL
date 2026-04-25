/*Given an interface Classify with a method String getDivision(double average). Implement this
getDivision method in a class Result such that it returns "First Division" if the average is 60 or
more. */

// Interface
interface Classify {
    String getDivision(double average);
}

// Implementing class
class Result implements Classify {

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "Not First Division";
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Result r = new Result();

        double avg = 70;
        System.out.println("Division: " + r.getDivision(avg));
    }
}
