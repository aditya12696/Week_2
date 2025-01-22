package Day4;
import java.util.ArrayList;

// School class (Aggregation with Student)
class School {
    private String name;
    private ArrayList<Student> students;

    // Constructor to initialize school
    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the school
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " has been added to " + name);
    }

    // Display school details and its students
    public void displaySchoolDetails() {
        System.out.println("School Name: " + name);
        System.out.println("Enrolled Students:");
        for (Student student : students) {
            student.displayStudentDetails();
            System.out.println("--------------------");
        }
    }
}

// Course class
class Subject {
    public String name;
    private ArrayList<Student> enrolledStudents;

    // Constructor to initialize course
    public Subject(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " enrolled in " + name);
    }

    // Display course details and enrolled students
    public void displaySubjectDetails() {
        System.out.println("Subject Name: " + name);
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }
}

// Student class (Association with Course)
class Student {
    private String name;
    private ArrayList<Subject> subjects;

    // Constructor to initialize student
    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    // Get student name
    public String getName() {
        return name;
    }

    // Enroll in a course
    public void enrollInSubject(Subject subject) {
        subjects.add(subject);
        subject.enrollStudent(this);
    }

    // Display student details and enrolled courses
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Enrolled Subjects:");
        for (Subject subject : subjects) {
            System.out.println("- " + subject.name);
        }
    }
}

// Main class
public class SchoolAndStudents {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Future Scholars Academy");

        // Create students
        Student student1 = new Student("Aditya");
        Student student2 = new Student("James");

        // Create subjects
        Subject subject1 = new Subject("Mathematics");
        Subject subject2 = new Subject("Science");

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Enroll students in subjects
        student1.enrollInSubject(subject1);
        student1.enrollInSubject(subject2);
        student2.enrollInSubject(subject2);

        // Display details
        System.out.println();
        school.displaySchoolDetails();

        System.out.println();
        subject1.displaySubjectDetails();
        subject2.displaySubjectDetails();
    }
}
