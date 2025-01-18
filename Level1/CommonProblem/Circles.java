package Day2.Level1.CommonProblem;

public class Circles {
    public static void main(String[] args) {
        // Creating object using default constructor
        Circle defaultCircle = new Circle();
        System.out.println("Default Circle Details:");
        defaultCircle.displayDetails();

        System.out.println("--------------------\n");

        // Creating object using parameterized constructor
        Circle userCircle = new Circle(5.0);
        System.out.println("User-provided Circle Details:");
        userCircle.displayDetails();
    }
}
class Circle {
    // Class attribute
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    public void displayDetails() {
        System.out.println("Circle Radius: " + radius);
        System.out.println("Circle Area: " + calculateArea());
    }
}

