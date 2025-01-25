package day6.problem_statements.employee_management_system;

public class FullTimeEmployee extends Employee implements Department {
    private double fixedSalary;
    private String department;

    // Constructor
    public FullTimeEmployee(String employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    // Override calculateSalary
    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
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
