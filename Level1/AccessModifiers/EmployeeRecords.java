package Day2.Level1.AccessModifiers;

public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an employee object
        Employee employee = new Employee(101, "IT", 50000.0);
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();

        System.out.println("--------------------\n");

        // Modifying the employee's salary
        employee.setSalary(55000.0);
        System.out.println("Updated Employee Details:");
        employee.displayEmployeeDetails();

        System.out.println("--------------------\n");

        // Creating a manager object
        Manager manager = new Manager(201, "HR", 80000.0, 10);
        System.out.println("Manager Details:");
        manager.displayEmployeeDetails();
    }
}
class Employee {
    // Attributes
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass to demonstrate access to employeeID and department
class Manager extends Employee {
    private int teamSize;

    // Constructor to initialize manager details
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Method to display manager details
    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Team Size: " + teamSize);
    }
}


