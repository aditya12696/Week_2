package Day3;
class Book {
    // Static variable
    private static String libraryName = "Default Library";

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final variable

    // Constructor to initialize book details
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Static method to update library name
    public static void updateLibraryName(String newLibraryName) {
        libraryName = newLibraryName;
    }

    // Instance method to display book details
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library Name: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        Book book2 = new Book("1984", "George Orwell", "9780451524935");

        // Displaying initial book details
        System.out.println("Initial Book Details:");
        book1.displayBookDetails();
        System.out.println("--------------------");
        book2.displayBookDetails();
        System.out.println("--------------------");

        // Updating the library name
        Book.updateLibraryName("City Central Library");

        // Displaying updated book details
        System.out.println("Updated Book Details:");
        book1.displayBookDetails();
        System.out.println("--------------------");
        book2.displayBookDetails();
        System.out.println("--------------------");

        // Displaying library name using static method
        Book.displayLibraryName();
    }
}
