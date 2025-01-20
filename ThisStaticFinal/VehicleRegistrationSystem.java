package Day3;

class Vehicle {
    // Static variable
    private static double registrationFee = 1000.0; // Common registration fee for all vehicles

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber; // Final variable

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Instance method to display vehicle registration details
    public void displayRegistrationDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Invalid vehicle object.");
        }
    }
}

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Aditya", "Car", "CAR12345");
        Vehicle vehicle2 = new Vehicle("John", "Motorbike", "BIKE67890");

        // Displaying initial registration details
        System.out.println("Initial Vehicle Registration Details:");
        vehicle1.displayRegistrationDetails();
        System.out.println("--------------------");
        vehicle2.displayRegistrationDetails();
        System.out.println("--------------------");

        // Updating the registration fee
        Vehicle.updateRegistrationFee(1200.0);

        // Displaying updated registration details
        System.out.println("Updated Vehicle Registration Details:");
        vehicle1.displayRegistrationDetails();
        System.out.println("--------------------");
        vehicle2.displayRegistrationDetails();
        System.out.println("--------------------");
    }
}
