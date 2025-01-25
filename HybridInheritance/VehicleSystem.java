package Day5.HybridInheritance;

// Superclass: Vehicle
class Vehicle {
    protected String model;
    protected int maxSpeed;

    // Constructor for Vehicle
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    // Abstract method for refueling
    void refuel();
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity; // Battery capacity in kWh

    // Constructor for ElectricVehicle
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed); // Call Vehicle constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println(model + " is charging. Battery capacity: " + batteryCapacity + " kWh.");
    }

    // Override displayDetails to include batteryCapacity
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelCapacity; // Fuel capacity in liters

    // Constructor for PetrolVehicle
    public PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed); // Call Vehicle constructor
        this.fuelCapacity = fuelCapacity;
    }

    // Implement refuel method from Refuelable interface
    @Override
    public void refuel() {
        System.out.println(model + " is refueling. Fuel capacity: " + fuelCapacity + " liters.");
    }

    // Override displayDetails to include fuelCapacity
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        // Create an ElectricVehicle
        ElectricVehicle tesla = new ElectricVehicle("Tesla Model S", 250, 100);
        System.out.println("Electric Vehicle Details:");
        tesla.displayDetails();
        tesla.charge();
        System.out.println();

        // Create a PetrolVehicle
        PetrolVehicle toyota = new PetrolVehicle("Toyota Corolla", 180, 50);
        System.out.println("Petrol Vehicle Details:");
        toyota.displayDetails();
        toyota.refuel();
    }
}
