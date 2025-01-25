package Day5.HybridInheritance;

// Superclass: Person
class Person {
    protected String name;
    protected int id;

    // Constructor for Person
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display basic person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface: Worker
interface Worker {
    // Abstract method to define duties
    void performDuties();
}

// Subclass: Chef
class Chef extends Person implements Worker {
    private String specialty;

    // Constructor for Chef
    public Chef(String name, int id, String specialty) {
        super(name, id); // Call Person constructor
        this.specialty = specialty;
    }

    // Override performDuties
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing delicious " + specialty + " dishes.");
    }

    // Override displayDetails to include specialty
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialty: " + specialty);
    }
}

// Subclass: Waiter
class Waiter extends Person implements Worker {
    private int tablesAssigned;

    // Constructor for Waiter
    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id); // Call Person constructor
        this.tablesAssigned = tablesAssigned;
    }

    // Override performDuties
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers at " + tablesAssigned + " tables.");
    }

    // Override displayDetails to include tablesAssigned
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Tables Assigned: " + tablesAssigned);
    }
}

// Main class
public class RestaurantSystem {
    public static void main(String[] args) {
        // Create a Chef
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        System.out.println("Chef Details:");
        chef.displayDetails();
        chef.performDuties();
        System.out.println();

        // Create a Waiter
        Waiter waiter = new Waiter("John Doe", 201, 5);
        System.out.println("Waiter Details:");
        waiter.displayDetails();
        waiter.performDuties();
    }
}