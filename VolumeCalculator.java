/*Write a Java program that demonstrates method overloading to calculate the volume of different
3D shapes. Implement overloaded methods named calculateVolume() for a Cube (takes one side
length), a RectangularCube (takes length, width, height), and a Sphere (takes radius). */

public class VolumeCalculator {

    // Method for Cube
    double calculateVolume(double side) {
        return side * side * side;
    }

    // Method for Rectangular Cube
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    // Method for Sphere
    double calculateVolume(float radius) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        VolumeCalculator v = new VolumeCalculator();

        // Cube
        System.out.println("Volume of Cube: " + v.calculateVolume(3));

        // Rectangular Cube
        System.out.println("Volume of Rectangular Cube: " + v.calculateVolume(4, 5, 6));

        // Sphere
        System.out.println("Volume of Sphere: " + v.calculateVolume(2.5f));
    }
}