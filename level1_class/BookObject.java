package Level1_class;

class Book {
    // class attributes
    private String title;
    private String author;
    private float price;

    // Constructor
    Book(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display Book details
    public void displayBookdDetails(){
        System.out.println("Book title is: " + title);
        System.out.println("Book author is: " + author);
        System.out.println("Book price is: " + price);
    }
}

class BookObject{
    public static void main(String[] args) {
        // Create first object of book class
        Book book1 = new Book("Never seen","John",1500);

        // Create second object of book class
        Book book2 = new Book("Eyes can't see","Olivia",500);

        // Calling display method for object
        book1.displayBookdDetails();
        System.out.println("----------------------------");
        book2.displayBookdDetails();
    }
}
