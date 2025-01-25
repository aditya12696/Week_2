package day6.problem_statements.employee_management_system;

public class PartTimeEmployee extends Employee implements Department {
    private int workHours;
    private double hourlyRate;
    private String department;

    // Constructor
    public PartTimeEmployee(String employeeId, String name, double baseSalary, int workHours, double hourlyRate) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.hourlyRate = hourlyRate;
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (workHours * hourlyRate);
    }

    // Implement assignDepartment
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    // Implement getDepartmentDetails
    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }

    // Display details including department
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }
}
