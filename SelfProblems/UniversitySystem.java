package Day4;

import java.util.ArrayList;

// University class (Composition with Department, Aggregation with Faculty)
class University {
    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    // Constructor
    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println("Department " + department.getDepartmentName() + " added to " + universityName);
    }

    // Add a faculty to the university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
        System.out.println("Faculty " + faculty.getName() + " added to " + universityName);
    }

    // Display university details
    public void displayUniversityDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department department : departments) {
            department.displayDepartmentDetails();
        }
        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            System.out.println("- " + faculty.getName());
        }
    }

    // Delete university (composition effect)
    public void deleteUniversity() {
        System.out.println("Deleting " + universityName + "...");
        departments.clear();
        System.out.println("All departments under " + universityName + " have been deleted.");
    }
}

// Department class (Composition relationship with University)
class Department {
    private String departmentName;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Display department details
    public void displayDepartmentDetails() {
        System.out.println("- Department: " + departmentName);
    }

    // Get department name
    public String getDepartmentName() {
        return departmentName;
    }
}

// Faculty class (Aggregation relationship with University)
class Faculty {
    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    // Get faculty name
    public String getName() {
        return name;
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Tech University");

        // Create departments
        Department csDepartment = new Department("Computer Science");
        Department eceDepartment = new Department("Electronics");

        // Add departments to the university
        university.addDepartment(csDepartment);
        university.addDepartment(eceDepartment);

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Black");
        Faculty faculty2 = new Faculty("Dr. Aditya");
        Faculty faculty3 = new Faculty("Dr. Brown");

        // Add faculty to the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.addFaculty(faculty3);

        // Display university details
        System.out.println("\nUniversity Details:");
        university.displayUniversityDetails();

        // Delete the university
        System.out.println("\nDeleting the university...");
        university.deleteUniversity();

        // Show that faculty members exist independently
        System.out.println("\nIndependent Faculty Members:");
        System.out.println("- " + faculty1.getName());
        System.out.println("- " + faculty2.getName());
        System.out.println("- " + faculty3.getName());
    }
}
