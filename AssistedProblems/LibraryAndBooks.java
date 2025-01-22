package Day4;
import java.util.ArrayList;

class Book {
    // Attributes for the Book class
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Library {
    // Attributes for the Library class
    private String libraryName;
    private ArrayList<Book> books; // Aggregation: A library has multiple books

    // Constructor to initialize library
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to display all books in the library
    public void displayLibraryBooks() {
        System.out.println("Library: " + libraryName);
        System.out.println("Books in the Library:");
        for (Book book : books) {
            book.displayBookDetails();
            System.out.println("--------------------");
        }
    }
}

public class LibraryAndBooks {
    public static void main(String[] args) {
        // Create some book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Create library objects
        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        // Add books to libraries
        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book3);
        library2.addBook(book1); // Demonstrating that books can exist in multiple libraries

        // Display books in each library
        System.out.println("Library 1 Details:");
        library1.displayLibraryBooks();
        System.out.println("====================");

        System.out.println("Library 2 Details:");
        library2.displayLibraryBooks();
    }
}
