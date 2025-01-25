package day6.problem_statements.vehicle_rental_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add Car, Bike, and Truck to the list
        vehicles.add(new Car("C101", "Sedan", 1500));   // 1500 per day
        vehicles.add(new Bike("B202", "Sports Bike", 500)); // 500 per day
        vehicles.add(new Truck("T303", "Cargo", 3000));  // 3000 per day

        // Iterate over the list and display rental and insurance costs
        for (Vehicle vehicle : vehicles) {
            System.out.println("--------------------");
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Daily Rental Rate: " + vehicle.getRentalRate());

            int rentalDays = 5; // Example: Renting for 5 days
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println(insurableVehicle.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insurableVehicle.calculateInsurance());
            }
        }
    }
}
