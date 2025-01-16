package Level1_class;

class Circle{
    // Class with an attribute
    private double radius;
    private double area;
    private double circumference;

    // Constructor
    Circle(double radius){
        this.radius = radius;
    }

    // Calculate area of circle
    public void calculateArea(){
        area = Math.PI * Math.pow(radius,2);
    }

    // Calculate circumference of circle
    public void calculateCircumference(){
        circumference = 2 * Math.PI * radius;
    }

    //Display area and circumference
    public void displayAreaAndCircumference(){
        System.out.println("Circle area: " + area);
        System.out.println("Circle circumference: " + circumference);
    }
}

class CircleObject{
    public static void main(String[] args) {
        // Create first object of Circle class
        Circle circle1 = new Circle(14);

        // Create second object of Circle class
        Circle circle2 = new Circle(4);

        // Calling method for first object calculate area and circumference
        circle1.calculateArea();
        circle1.calculateCircumference();

        // Calling method for second object calculate area and circumference
        circle2.calculateArea();
        circle2.calculateCircumference();

        // Calling display method for both object
        circle1.displayAreaAndCircumference();
        System.out.println("----------------------------");
        circle2.displayAreaAndCircumference();
    }
}