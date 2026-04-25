/*Create a file named students.txt. Write at least three student records (roll number, name, marks)
into the file. Read the file content and display all student records on the console. Handle
exceptions like IOException properly using try-catch-finally. */

import java.io.*;

public class Main {
    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Step 1: Create and write to file
            fw = new FileWriter("students.txt");

            fw.write("101 Riddhi 85\n");
            fw.write("102 Amit 78\n");
            fw.write("103 Neha 92\n");

            System.out.println("Data written to file successfully.\n");

            fw.close(); // close writer before reading

            // Step 2: Read from file
            br = new BufferedReader(new FileReader("students.txt"));

            String line;
            System.out.println("Student Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
