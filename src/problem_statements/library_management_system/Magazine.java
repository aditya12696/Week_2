package day6.problem_statements.library_management_system;

public class Magazine extends LibraryItem implements Reservable {
    private boolean isReserved;

    // Constructor
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Implement getLoanDuration
    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be loaned for 7 days
    }

    // Implement Reservable methods
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The magazine \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The magazine \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}
