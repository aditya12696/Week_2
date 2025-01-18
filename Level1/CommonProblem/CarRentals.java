package Day2.Level1.CommonProblem;

public class CarRentals {
    public static void main(String[] args) {
        // Creating a rental object using default constructor
        CarRental rental1 = new CarRental();
        System.out.println("Rental 1 Details (Default Constructor):");
        rental1.displayRentalDetails();

        System.out.println("--------------------\n");

        // Creating a rental object using parameterized constructor
        CarRental rental2 = new CarRental("John Doe", "Toyota Corolla", 5, 60.0);
        System.out.println("Rental 2 Details (Parameterized Constructor):");
        rental2.displayRentalDetails();
    }
}
class CarRental {
    // Class attributes
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalRate;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
        this.rentalRate = 50.0; // Default rental rate per day
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double rentalRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalRate = rentalRate;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * rentalRate;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Rental Rate: " + rentalRate + " per day");
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}

