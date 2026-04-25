/*Write a generic method searchElement that accepts a LinkedList<T> and an element T to search.
Return true if the element exists, otherwise false.
● Test with LinkedList<Integer> for roll numbers.
● Test with LinkedList<String> for names. */

import java.util.LinkedList;

public class Main {

    // Generic method
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        // Test with Integer (roll numbers)
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        System.out.println("Searching roll number 102: " +
                searchElement(rollNumbers, 102));

        System.out.println("Searching roll number 105: " +
                searchElement(rollNumbers, 105));

        // Test with String (names)
        LinkedList<String> names = new LinkedList<>();
        names.add("Riddhi");
        names.add("Amit");
        names.add("Neha");

        System.out.println("\nSearching name 'Amit': " +
                searchElement(names, "Amit"));

        System.out.println("Searching name 'Rahul': " +
                searchElement(names, "Rahul"));
    }
}
