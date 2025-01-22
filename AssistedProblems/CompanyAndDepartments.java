package Day4;
import java.util.ArrayList;

class Employee {
    // Attributes for the Employee class
    private String name;
    private String designation;

    // Constructor to initialize employee details
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

class Departments {
    // Attributes for the Department class
    private String departmentName;
    private ArrayList<Employee> employees; // Composition: A department contains multiple employees

    // Constructor to initialize department
    public Departments(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Method to display department details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        System.out.println("Employees:");
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
            System.out.println("--------------------");
        }
    }
}

class Company {
    // Attributes for the Company class
    private String companyName;
    private ArrayList<Departments> departments; // Composition: A company contains multiple departments

    // Constructor to initialize company
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(Departments department) {
        departments.add(department);
    }

    // Method to display company details
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Departments:");
        for (Departments department : departments) {
            department.displayDepartmentDetails();
            System.out.println("====================");
        }
    }

    // Method to delete the company (clears all departments and employees)
    public void deleteCompany() {
        departments.clear();
        System.out.println("Company " + companyName + " and all associated departments and employees have been deleted.");
    }
}

public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("Tech Innovators");

        // Create departments
        Departments department1 = new Departments("IT");
        Departments department2 = new Departments("HR");

        // Create employees
        Employee employee1 = new Employee("Aditya", "Software Engineer");
        Employee employee2 = new Employee("James", "System Analyst");
        Employee employee3 = new Employee("Charlie", "HR Manager");
        Employee employee4 = new Employee("Johan", "Recruiter");

        // Add employees to departments
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);
        department2.addEmployee(employee4);

        // Add departments to the company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Display company details
        System.out.println("Company Details:");
        company.displayCompanyDetails();

        // Delete the company
        System.out.println("\nDeleting the Company...");
        company.deleteCompany();
    }
}
