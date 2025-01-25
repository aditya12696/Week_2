package Day5.AssistedProblems;

// Superclass Employee
class Employee{
    // class attributed
    private String name;
    private int id;
    private float salary;

    // Constructor to initialize name, id and salary
    public Employee(String name, int id, float salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to be overridden by subclasses
    public void displayDetails(){
        System.out.println("Employee name is " + name);
        System.out.println("Employee id is " + id);
        System.out.println("Employee salary is " + salary);
    }
}
// Subclass Manager
class Manager extends Employee{
    // other class attributed
    private int teamSize;

    // Constructor to initialize other class attributed and name, id and salary by calling SuperClass Constructor
    public Manager(String name, int id, float salary, int teamSize){
        super(name,id,salary);
        this.teamSize = teamSize;
    }

    // Set Team Size
    public void setTeamSize(int teamSize){
        this.teamSize = teamSize;
    }

    // Overridden method displayDetails()
    @Override
    public void displayDetails() {
        System.out.println("Employee role is Manager ");
        super.displayDetails();
        System.out.println("Team Size is " + teamSize);
        System.out.println("--------------------");
    }
}
// Subclass Developer
class Developer extends Employee{
    // other class attributed
    private String programmingLanguage;

    // Constructor to initialize other class attributed and name, id and salary by calling SuperClass Constructor
    public Developer(String name, int id, float salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Set Programming Language
    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }

    // Overridden method displayDetails()
    @Override
    public void displayDetails() {
        System.out.println("Employee role is Developer ");
        super.displayDetails();
        System.out.println("Its programming language is " + programmingLanguage);
        System.out.println("--------------------");
    }
}
// Subclass Intern
class Intern extends Employee{
    // other class attributed
    private int duration;

    // Constructor to initialize other class attributed and name, id and salary by calling SuperClass Constructor
    public Intern(String name, int id, float salary, int duration){
        super(name,id,salary);
        this.duration = duration;
    }

    // Set Duration
    public void setDuration(int duration){
        this.duration = duration;
    }

    // Overridden method displayDetails()
    @Override
    public void displayDetails() {
        System.out.println("Employee role is Intern");
        super.displayDetails();
        System.out.println("Its duration of internship " + duration + " year");
        System.out.println("--------------------");
    }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {

        // Create instances of each subclass
        Manager manager1 = new Manager("Johan",15,1000000,2);
        Developer developer1 = new Developer("Sam",16,400000,"Java");
        Intern intern1 = new Intern("Exo",100,120000,1);

        // Display details and sounds of each animal
        manager1.setTeamSize(150);
        manager1.displayDetails();

        developer1.setProgrammingLanguage(".Net");
        developer1.displayDetails();

        intern1.setDuration(2);
        intern1.displayDetails();
    }
}
