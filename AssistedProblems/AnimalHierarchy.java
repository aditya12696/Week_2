package Day5.AssistedProblems;

// Superclass Animal
class Animal {
    private String name;
    private int age;

    // Constructor to initialize name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("This is a generic animal sound.");
    }

    // Display animal details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass Dog
class Dog extends Animal {
    // Constructor for Dog
    public Dog(String name, int age) {
        super(name, age);
    }

    // Overridden method makeSound()
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Constructor for Cat
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overridden method makeSound()
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

// Subclass Bird
class Bird extends Animal {
    // Constructor for Bird
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overridden method makeSound()
    @Override
    public void makeSound() {
        System.out.println("Chirp! Chirp!");
    }
}

// Main class
public class AnimalHierarchy {
    public static void main(String[] args) {
        // Create instances of each subclass
        Dog dog = new Dog("Rover", 5);
        Cat cat = new Cat("Fluffy", 3);
        Bird bird = new Bird("Tweety", 2);

        // Display details and sounds of each animal
        dog.displayDetails();
        dog.makeSound();

        System.out.println();

        cat.displayDetails();
        cat.makeSound();

        System.out.println();

        bird.displayDetails();
        bird.makeSound();
    }
}

