package Day2.Level1.InstanceVsClass;

public class Courses {
    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 12, 15000.0);
        Course course2 = new Course("Web Development", 10, 20000.0);

        // Displaying initial course details
        System.out.println("Initial Course Details:");
        course1.displayCourseDetails();
        System.out.println("--------------------");
        course2.displayCourseDetails();

        System.out.println("--------------------\n");

        // Updating the institute name
        Course.updateInstituteName("Tech Academy");

        // Displaying updated course details
        System.out.println("Updated Course Details:");
        course1.displayCourseDetails();
        System.out.println("--------------------");
        course2.displayCourseDetails();
    }
}

class Course {
    // Instance variables
    private String courseName;
    private int duration; // in weeks
    private double fee;

    // Class variable
    private static String instituteName = "Default Institute";

    // Constructor to initialize course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: " + fee);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}
