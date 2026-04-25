/*Write a program that will count the number of characters, words, and lines in a file. Words are

separated by whitespace characters. The file name should be passed as a command-line argument. */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Check if filename is provided
        if (args.length < 1) {
            System.out.println("Please provide a file name.");
            return;
        }

        String fileName = args[0];

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                // Count characters
                charCount += line.length();

                // Count words
                String words[] = line.trim().split("\\s+");
                if (line.trim().length() > 0) {
                    wordCount += words.length;
                }
            }

            br.close();

            // Display result
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
