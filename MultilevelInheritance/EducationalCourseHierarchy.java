package Day5.MultilevelInheritance;
// Base class: Course
class Course {
    protected String courseName;
    protected int duration; // Duration in hours

    // Constructor for Course
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass: OnlineCourse (extends Course)
class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    // Constructor for OnlineCourse
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call the Course constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override displayDetails to include OnlineCourse-specific details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Is Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse (extends OnlineCourse)
class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // Discount in percentage

    // Constructor for PaidOnlineCourse
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call the OnlineCourse constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate discounted fee
    public double getDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    // Override displayDetails to include PaidOnlineCourse-specific details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call the OnlineCourse method
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Discounted Fee: $" + getDiscountedFee());
    }
}

// Main class
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Create a Course object
        Course basicCourse = new Course("Introduction to Programming", 30);
        System.out.println("Basic Course Details:");
        basicCourse.displayDetails();
        System.out.println();

        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Data Science with Python", 50, "Coursera", true);
        System.out.println("Online Course Details:");
        onlineCourse.displayDetails();
        System.out.println();

        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Machine Learning Mastery", 70, "Udemy", true, 299.99, 25);
        System.out.println("Paid Online Course Details:");
        paidOnlineCourse.displayDetails();
    }
}
