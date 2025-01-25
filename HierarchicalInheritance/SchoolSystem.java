package Day5.HierarchicalInheritance;

// Base class: Person
class Person {
    protected String name;
    protected int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to display the role (to be overridden in subclasses)
    public void displayRole() {
        System.out.println("Role: General Person");
    }
}

// Subclass: Teacher
class Teacher extends Person {
    private String subject;

    // Constructor for Teacher
    public Teacher(String name, int age, String subject) {
        super(name, age); // Call the Person constructor
        this.subject = subject;
    }

    // Override displayRole
    @Override
    public void displayRole() {
        System.out.println("Role: Teacher");
    }

    // Override displayDetails to include subject
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    private String grade;

    // Constructor for Student
    public Student(String name, int age, String grade) {
        super(name, age); // Call the Person constructor
        this.grade = grade;
    }

    // Override displayRole
    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }

    // Override displayDetails to include grade
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    private String department;

    // Constructor for Staff
    public Staff(String name, int age, String department) {
        super(name, age); // Call the Person constructor
        this.department = department;
    }

    // Override displayRole
    @Override
    public void displayRole() {
        System.out.println("Role: Staff");
    }

    // Override displayDetails to include department
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Main class
public class SchoolSystem {
    public static void main(String[] args) {
        // Create a Teacher
        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        System.out.println("Teacher Details:");
        teacher.displayRole();
        teacher.displayDetails();
        System.out.println();

        // Create a Student
        Student student = new Student("Bob", 16, "10th Grade");
        System.out.println("Student Details:");
        student.displayRole();
        student.displayDetails();
        System.out.println();

        // Create a Staff
        Staff staff = new Staff("Charlie", 45, "Administration");
        System.out.println("Staff Details:");
        staff.displayRole();
        staff.displayDetails();
    }
}
