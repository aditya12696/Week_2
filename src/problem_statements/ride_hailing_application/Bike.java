package day6.problem_statements.ride_hailing_application;


public class Bike extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = "Not Available";
    }

    // Override calculateFare
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // Implement GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

