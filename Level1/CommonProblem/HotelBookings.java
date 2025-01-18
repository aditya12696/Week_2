package Day2.Level1.CommonProblem;

public class HotelBookings {
    public static void main(String[] args) {
        // Creating a booking using default constructor
        HotelBooking booking1 = new HotelBooking();
        System.out.println("Booking 1 Details (Default Constructor):");
        booking1.displayBookingDetails();

        System.out.println("--------------------\n");

        // Creating a booking using parameterized constructor
        HotelBooking booking2 = new HotelBooking("John Doe", "Suite", 5);
        System.out.println("Booking 2 Details (Parameterized Constructor):");
        booking2.displayBookingDetails();

        System.out.println("--------------------\n");

        // Creating a booking using the copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        System.out.println("Booking 3 Details (Copy Constructor):");
        booking3.displayBookingDetails();
    }
}
class HotelBooking {
    // Class attributes
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        this.guestName = "Unknown";
        this.roomType = "Standard";
        this.nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor (clones another booking's attributes)
    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }
}

