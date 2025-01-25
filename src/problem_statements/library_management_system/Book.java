package day6.problem_statements.library_management_system;

public class Book extends LibraryItem implements Reservable {
    private boolean isReserved;

    // Constructor
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Implement getLoanDuration
    @Override
    public int getLoanDuration() {
        return 14; // Books can be loaned for 14 days
    }

    // Implement Reservable methods
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The book \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The book \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

