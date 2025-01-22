package Day4;

import java.util.ArrayList;
import java.util.List;

// Course class
class Cours {
    private String courseName;
    private Professor professor;
    private List<Student> students;

    // Constructor
    public Cours(String courseName) {
        this.courseName = courseName;
        this.professor = null;
        this.students = new ArrayList<>();
    }

    // Assign professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to Course: " + courseName);
    }

    // Enroll student in the course
    public void enrollStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " enrolled in Course: " + courseName);
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            System.out.println("  - " + student.getName());
        }
    }
}

// Student class
class Student {
    private String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // Get student name
    public String getName() {
        return name;
    }

    // Enroll in a course
    public void enrollCourse(Cours course) {
        course.enrollStudent(this);
    }
}

// Professor class
class Professor {
    private String name;

    // Constructor
    public Professor(String name) {
        this.name = name;
    }

    // Get professor name
    public String getName() {
        return name;
    }

    // Assign professor to a course
    public void assignCourse(Cours course) {
        course.assignProfessor(this);
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create courses
        Cours course1 = new Cours("Computer Science 101");
        Cours course2 = new Cours("Mathematics 101");

        // Assign professors to courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Students enroll in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);

        // Display course details
        System.out.println("\nCourse Details:");
        course1.displayCourseDetails();
        System.out.println("--------------------");
        course2.displayCourseDetails();
    }
}
