package Level1_class;

class Employee{
	
	// class Employee attributes 
	private String name;
	private int id;
	private double salary;
	
	// Constructor 
	Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	// Method for display employee details
	public void displayDetails(){
		System.out.println("Employee name is: " + name);
		System.out.println("Employee Id is: " + id);
		System.out.println("Employee salary is: " + salary);
	}
}

class EmployeeObject {
	public static void main(String[] args){
		// Create object of Employee class and calling Constructor
		Employee e1 = new Employee("Johen",10,500000);
		Employee e2 = new Employee("johnny",12,600000);

		// Calling method for display details
		e1.displayDetails();
		System.out.println("----------------------------");
		e2.displayDetails();
	}
}