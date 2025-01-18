package Day2.Level1.CommonProblem;

public class Books {
    public static void main(String[] args) {
        // Creating object using default constructor
        Book defaultBook = new Book();
        System.out.println("Default Book Details:");
        defaultBook.displayDetails();

        System.out.println("--------------------\n");

        // Creating object using parameterized constructor
        Book parameterizedBook = new Book("1984", "George Orwell", 15.99);
        System.out.println("Parameterized Book Details:");
        parameterizedBook.displayDetails();
    }
}
class Book {
    // Class attributes
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display details of the book
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
