package day6.problem_statements.vehicle_rental_system;

public class Car extends Vehicle implements Insurable {
    private static final double INSURANCE_RATE = 0.02; // 2% of rental cost

    // Constructor
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    // Implement calculateRentalCost
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implement Insurable methods
    @Override
    public double calculateInsurance() {
        return calculateRentalCost(1) * INSURANCE_RATE; // Insurance for a single day
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Rate: " + (INSURANCE_RATE * 100) + "% of rental cost";
    }
}
