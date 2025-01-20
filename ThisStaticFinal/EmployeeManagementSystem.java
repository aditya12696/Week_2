package Day3;

class Employee {
    // Static variable
    private static String companyName = "Default Company";
    private static int totalEmployees = 0;

    // Instance variables
    private String name;
    private final int id; // Final variable
    private String designation;

    // Constructor to initialize employee details
    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Static method to update company name
    public static void updateCompanyName(String newCompanyName) {
        companyName = newCompanyName;
    }

    // Instance method to display employee details
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Designation: " + designation);
        } else {
            System.out.println("Invalid employee object.");
        }
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating employee objects
        Employee emp1 = new Employee("John", 101, "Software Engineer");
        Employee emp2 = new Employee("Aditya", 102, "Data Analyst");

        // Displaying initial employee details
        System.out.println("Initial Employee Details:");
        emp1.displayEmployeeDetails();
        System.out.println("--------------------");
        emp2.displayEmployeeDetails();
        System.out.println("--------------------");

        // Updating the company name
        Employee.updateCompanyName("Tech Solutions Inc.");

        // Displaying updated employee details
        System.out.println("Updated Employee Details:");
        emp1.displayEmployeeDetails();
        System.out.println("--------------------");
        emp2.displayEmployeeDetails();
        System.out.println("--------------------");

        // Displaying total employees
        Employee.displayTotalEmployees();
    }
}
