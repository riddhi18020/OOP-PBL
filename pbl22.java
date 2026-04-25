/*Define a custom exception class BookNotAvailableException that extends Exception.
● Create a class Library with:
● An instance variable availableBooks (integer).
● A method issueBook(int count) that:
o If count <= availableBooks, reduce the number of books and display "Book issued
successfully".
o Otherwise, throw BookNotAvailableException with the message "Requested books not
available".
In the main() method:
● Initialize the library with 3 available books.
● Try issuing 2 books (valid).
● Then try issuing 2 more books (should throw the custom exception). */

// Custom Exception class
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

// Library class
class Library {
    int availableBooks;

    // Constructor
    Library(int books) {
        availableBooks = books;
    }

    // Method to issue books
    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Library lib = new Library(3); // Initialize with 3 books

        try {
            // First attempt (valid)
            lib.issueBook(2);

            // Second attempt (invalid)
            lib.issueBook(2);

        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
