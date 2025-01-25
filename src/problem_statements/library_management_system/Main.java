package day6.problem_statements.library_management_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of LibraryItem objects
        List<LibraryItem> libraryItems = new ArrayList<>();

        // Add different items to the list
        libraryItems.add(new Book("B101", "To Kill a Mockingbird", "Harper Lee"));
        libraryItems.add(new Magazine("M202", "National Geographic", "Editorial Team"));
        libraryItems.add(new DVD("D303", "Inception", "Christopher Nolan"));

        // Process each item
        for (LibraryItem item : libraryItems) {
            System.out.println("---------------------");
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservableItem = (Reservable) item;

                System.out.println("Availability: " + (reservableItem.checkAvailability() ? "Available" : "Reserved"));
                reservableItem.reserveItem();
                System.out.println("Availability after reserving: " + (reservableItem.checkAvailability() ? "Available" : "Reserved"));
            }
        }
    }
}
