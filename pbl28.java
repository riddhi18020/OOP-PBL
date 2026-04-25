/*Write a Java program that reads a text file named data.txt. The program should count and display:
The total number of lines, The total number of words, The total number of characters (excluding
spaces and newline characters), Use FileReader / BufferedReader for reading the file. Handle
exceptions like FileNotFoundException and IOException. */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        BufferedReader br = null;

        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count words (split by whitespace)
                String[] words = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }

                // Count characters (excluding spaces)
                charCount += line.replace(" ", "").length();
            }

            // Display results
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters (excluding spaces): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: data.txt");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
