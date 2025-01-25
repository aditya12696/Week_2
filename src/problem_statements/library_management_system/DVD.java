package day6.problem_statements.library_management_system;

public class DVD extends LibraryItem implements Reservable {
    private boolean isReserved;

    // Constructor
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isReserved = false;
    }

    // Implement getLoanDuration
    @Override
    public int getLoanDuration() {
        return 3; // DVDs can be loaned for 3 days
    }

    // Implement Reservable methods
    @Override
    public void reserveItem() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("The DVD \"" + getTitle() + "\" has been reserved.");
        } else {
            System.out.println("The DVD \"" + getTitle() + "\" is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return !isReserved;
    }
}

