package Day2.Level1.CommonProblem;

public class Persons {
    public static void main(String[] args) {
        // Creating a person using parameterized constructor
        Person person1 = new Person("Alice", 30, "123 Main St");

        // Creating a person using the copy constructor
        Person person2 = new Person(person1);

        // Display details of both persons
        System.out.println("Person 1 Details:");
        person1.displayDetails();

        System.out.println("--------------------\n");

        System.out.println("Person 2 (Copy of Person 1) Details:");
        person2.displayDetails();
    }
}
class Person {
    // Class attributes
    private String name;
    private int age;
    private String address;

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor (clones another person's attributes)
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

