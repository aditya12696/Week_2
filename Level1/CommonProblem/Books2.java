package Day2.Level1.CommonProblem;

public class Books2 {
    public static void main(String[] args) {
        // Creating a book object
        BookLib book1 = new BookLib("The Great Gatsby", "F. Scott Fitzgerald", 10.99, true);

        // Displaying book details
        System.out.println("Book Details Before Borrowing:");
        book1.displayBookDetails();

        // Borrowing the book
        book1.borrowBook();

        // Displaying book details after borrowing
        System.out.println("\nBook Details After Borrowing:");
        book1.displayBookDetails();
    }
}
class BookLib {
    // Class attributes
    private String title;
    private String author;
    private double price;
    private boolean availability;

    // Constructor to initialize the attributes
    public BookLib(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            System.out.println("You have successfully borrowed: " + title);
            availability = false;  // Mark book as borrowed
        } else {
            System.out.println("Sorry, the book '" + title + "' is currently unavailable.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

        // Checking availability using if condition
        if (availability) {
            System.out.println("Availability: Available");
        } else {
            System.out.println("Availability: Unavailable");
        }
    }
}

