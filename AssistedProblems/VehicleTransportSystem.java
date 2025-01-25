package Day5.AssistedProblems;
// Superclass Vehicle
class Vehicle{
    // class attributed
    private float maxSpeed;
    private String fuelType;

    // Constructor to initialize max speed and fuel type
    public Vehicle(float maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to be overridden by subclasses
    public void displayInfo(){
        System.out.println("Max Speed of Vehicle is " + maxSpeed);
        System.out.println("Fuel Type of Vehicle is " + fuelType);
    }
}
// SubClass Car
class Car extends Vehicle{
    // other class attributed
    private int seatCapacity;
    private String brand;

    // Constructor to initialize other class attributed and maxSpeed, fuelType by calling SuperClass Constructor
    public Car(String brand, int seatCapacity, float maxSpeed, String fuelType){
        super(maxSpeed,fuelType);
        this.brand = brand;
        this.seatCapacity = seatCapacity;
    }

    // Overridden method displayDetails()
    @Override
    public void displayInfo() {
        System.out.println("Vehicle type Car");
        System.out.println("Car Seat Capacity is " + seatCapacity);
        System.out.println("Car Brand is " + brand);
        super.displayInfo();
        System.out.println("--------------------");
    }
}
// Subclass Truck
class Truck extends Vehicle{
    // other class attributed
    private int seatCapacity;
    private String brand;

    // Constructor to initialize other class attributed and maxSpeed, fuelType by calling SuperClass Constructor
    public Truck(String brand, int seatCapacity, float maxSpeed, String fuelType){
        super(maxSpeed,fuelType);
        this.brand = brand;
        this.seatCapacity = seatCapacity;
    }
    // Overridden method displayDetails()
    @Override
    public void displayInfo() {
        System.out.println("Vehicle type Truck");
        System.out.println("Truck Seat Capacity is " + seatCapacity);
        System.out.println("Truck Brand is " + brand);
        super.displayInfo();
        System.out.println("--------------------");
    }
}
// SubClass Motorcycle
class Motorcycle extends Vehicle{
    // other class attributed
    private int seatCapacity;
    private String brand;

    // Constructor to initialize other class attributed and maxSpeed, fuelType by calling SuperClass Constructor
    public Motorcycle(String brand, int seatCapacity, float maxSpeed, String fuelType){
        super(maxSpeed,fuelType);
        this.brand = brand;
        this.seatCapacity = seatCapacity;
    }
    // Overridden method displayDetails()
    @Override
    public void displayInfo() {
        System.out.println("Vehicle type Motorcycle");
        System.out.println("Motorcycle Seat Capacity is " + seatCapacity);
        System.out.println("Motorcycle Brand is " + brand);
        super.displayInfo();
        System.out.println("--------------------");
    }
}
public class VehicleTransportSystem {
    public static void main(String[] args) {

        // Create instances of each subclass
        Vehicle [] array = new Vehicle[3];

        array[0] = new Car("BMW",4,250,"Electeicity");
        array[1] = new Truck("TATA", 3,150,"Diesel");
        array[2] = new Motorcycle("KTM",2,120,"CNG");

        // Display details and other attributed
        array[0].displayInfo();
        array[1].displayInfo();
        array[2].displayInfo();
    }
}
