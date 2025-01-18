package Day2.Level1.AccessModifiers;

public class Students {
    public static void main(String[] args) {
        // Creating an undergraduate student object
        Student student1 = new Student(101, "Alice", 8.5);
        System.out.println("Undergraduate Student Details:");
        student1.displayStudentDetails();

        System.out.println("--------------------\n");

        // Modifying CGPA of the student
        student1.setCGPA(9.2);
        System.out.println("Updated Undergraduate Student Details:");
        student1.displayStudentDetails();

        System.out.println("--------------------\n");

        // Creating a postgraduate student object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.0, "Data Science");
        System.out.println("Postgraduate Student Details:");
        pgStudent.displayStudentDetails();
    }
}

class Student {
    // Attributes
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Method to set CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. Please enter a value between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate the use of protected members
class PostgraduateStudent extends Student {
    private String specialization;

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    // Method to display postgraduate student details
    @Override
    public void displayStudentDetails() {
        super.displayStudentDetails();
        System.out.println("Specialization: " + specialization);
    }
}
