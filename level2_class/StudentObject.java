package Level2_class;

class Student {
    // Class attributes
    private String name;
    private int rollNumber;
    private float marks;
    private String grade;

    // Constructor
    Student(String name, int rollNumber, float marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // To calculate the grade based on the marks
    public void calculateGrade(){
        // calculate grade based on marks
        if (marks >= 90) {
            grade = "A";
        } else if (marks >= 80) {
            grade = "B";
        } else if (marks >= 70) {
            grade = "C";
        } else if (marks >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    // Display details of student
    public void displayDetailsOfStudent(){
        System.out.println("Student name is: " + name);
        System.out.println("Student roll number is: " + rollNumber);
        System.out.println("Student marks is: " + marks);
        System.out.println("Student grade is: " + grade);
    }
}

class StudentObject{
    public static void main(String[] args) {
        // Create object of Student class
        Student student1 = new Student("Olivia",12,75);
        Student student2 = new Student("John",2,80);

        // Calling method for calculate grade
        student1.calculateGrade();
        student2.calculateGrade();

        // Calling display method for student details
        student1.displayDetailsOfStudent();
        System.out.println("--------------------\n");
        student2.displayDetailsOfStudent();
    }
}
