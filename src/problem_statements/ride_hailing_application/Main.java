package day6.problem_statements.ride_hailing_application;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add Car, Bike, and Auto to the list
        Car car = new Car("C001", "Jane", 15.0);
        car.updateLocation("City Center");

        Bike bike = new Bike("B001", "Jane", 10.0);
        bike.updateLocation("Downtown");

        Auto auto = new Auto("A001", "Alex", 8.0);
        auto.updateLocation("Suburb");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        // Display details and calculate fares for different distances
        System.out.println("Ride Details:");
        double totalFareCollected = 0.0;

        for (Vehicle vehicle : vehicles) {
            System.out.println("----------------------");
            System.out.println(vehicle.getVehicleDetails());
            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            double distance = 12.5; // Example distance
            double fare = vehicle.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: ₹" + fare);
            totalFareCollected += fare;
        }

        System.out.println("----------------------");
        System.out.println("Total Fare Collected: ₹" + totalFareCollected);
    }
}
