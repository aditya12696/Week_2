package day6.problem_statements.employee_management_system;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee and PartTimeEmployee to the list
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("FT101", "Johan", 50000, 20000);
        fullTimeEmployee.assignDepartment("Finance");
        employees.add(fullTimeEmployee);

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("PT202", "Sam", 20000, 20, 500);
        partTimeEmployee.assignDepartment("Support");
        employees.add(partTimeEmployee);

        // Display details of all employees
        for (Employee employee : employees) {
            System.out.println("--------------------");
            employee.displayDetails();
        }
    }
}
