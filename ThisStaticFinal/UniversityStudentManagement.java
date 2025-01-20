package Day3;

class Student {
    // Static variable
    private static String universityName = "Default University";
    private static int totalStudents = 0;

    // Instance variables
    private String name;
    private final int rollNumber; // Final variable
    private String grade;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // Static method to update university name
    public static void updateUniversityName(String newUniversityName) {
        universityName = newUniversityName;
    }

    // Instance method to display student details
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    // Instance method to update grade
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for Roll Number: " + rollNumber);
        } else {
            System.out.println("Invalid student object. Grade update failed.");
        }
    }
}

public class UniversityStudentManagement {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Aditya", 101, "A");
        Student student2 = new Student("John", 102, "B");

        // Displaying initial student details
        System.out.println("Initial Student Details:");
        student1.displayStudentDetails();
        System.out.println("--------------------");
        student2.displayStudentDetails();
        System.out.println("--------------------");

        // Updating the university name
        Student.updateUniversityName("Tech University");

        // Updating grades
        student1.updateGrade("A+");
        student2.updateGrade("B+");

        // Displaying updated student details
        System.out.println("Updated Student Details:");
        student1.displayStudentDetails();
        System.out.println("--------------------");
        student2.displayStudentDetails();
        System.out.println("--------------------");

        // Displaying total students
        Student.displayTotalStudents();
    }
}
