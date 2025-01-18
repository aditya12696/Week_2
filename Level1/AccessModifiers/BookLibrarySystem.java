package Day2.Level1.AccessModifiers;

public class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating a book object
        Book book = new Book("978-3-16-148410-0", "Java Programming", "John Doe");
        System.out.println("Book Details:");
        book.displayBookDetails();

        System.out.println("--------------------\n");

        // Modifying author name using setter
        book.setAuthor("Jane Smith");
        System.out.println("Updated Book Details:");
        book.displayBookDetails();

        System.out.println("--------------------\n");

        // Creating an eBook object
        EBook eBook = new EBook("978-0-12-345678-9", "Advanced Java", "Alice Brown", 5.4);
        eBook.displayBookDetails();
    }
}
class Book {
    // Attributes
    public String ISBN;
    protected String title;
    private String author;

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method to get the author's name
    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass to demonstrate access modifiers
class EBook extends Book {
    private double fileSize; // File size in MB

    // Constructor to initialize EBook details
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Method to display EBook details
    @Override
    public void displayBookDetails() {
        System.out.println("EBook Details:");
        System.out.println("ISBN: " + ISBN); // Accessing public attribute
        System.out.println("Title: " + title); // Accessing protected attribute
        System.out.println("File Size: " + fileSize + " MB");
    }
}

