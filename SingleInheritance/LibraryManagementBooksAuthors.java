package Day5.SingleInheritance;

// Superclass Book
class Book {
    private String title;
    private int publicationYear;

    // Constructor to initialize Book attributes
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for publicationYear
    public int getPublicationYear() {
        return publicationYear;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass Author
class Author extends Book {
    private String name;
    private String bio;

    // Constructor to initialize both Book and Author attributes
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    // Method to display book and author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method to display book details
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class
public class LibraryManagementBooksAuthors {
    public static void main(String[] args) {
        // Create an Author object
        Author author = new Author("To Kill a Mockingbird", 1960, "Harper Lee", "An American novelist known for her classic novel.");

        // Display details of the book and its author
        author.displayInfo();
    }
}
