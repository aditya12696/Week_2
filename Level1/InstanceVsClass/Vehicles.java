package Day2.Level1.InstanceVsClass;

public class Vehicles {
    public static void main(String[] args) {
        // Creating vehicle objects
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorbike");

        // Displaying initial vehicle details
        System.out.println("Initial Vehicle Details:");
        vehicle1.displayVehicleDetails();
        System.out.println("--------------------");
        vehicle2.displayVehicleDetails();

        System.out.println("--------------------\n");

        // Updating the registration fee
        Vehicle.updateRegistrationFee(750.0);

        // Displaying updated vehicle details
        System.out.println("Updated Vehicle Details:");
        vehicle1.displayVehicleDetails();
        System.out.println("--------------------");
        vehicle2.displayVehicleDetails();
    }
}
class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;

    // Class variable
    private static double registrationFee = 500.0; // Default registration fee

    // Constructor to initialize vehicle details
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
