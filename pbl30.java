/*Write a program that accepts a sentence from the user and counts the frequency of each word using
a HashMap<String, Integer>. Display the results in the format:
Input: "Java is fun and Java is powerful"
Output:
Java -> 2
is -> 2
fun -> 1
and -> 1
powerful -> 1 */

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        // Convert to lowercase for uniform counting
        input = input.toLowerCase();

        // Split sentence into words
        String[] words = input.split("\\s+");

        // Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Count frequency
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        // Display result
        System.out.println("\nWord Frequencies:");
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        sc.close();
    }
}
