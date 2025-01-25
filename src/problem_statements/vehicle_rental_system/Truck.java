package day6.problem_statements.vehicle_rental_system;

public class Truck extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.05; // 5% of rental cost

    // Constructor
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    // Implement calculateRentalCost
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Trucks have a fixed additional fee
    }

    // Implement Insurable methods
    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Rate: " + (INSURANCE_RATE * 100) + "% of rental cost";
    }
}
