package Day3;

class Patient {
    // Static variables
    private static String hospitalName = "Ram Raja Hospital";
    private static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final int patientID; // Final variable

    // Constructor to initialize patient details
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method to get total number of patients
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Static method to update hospital name
    public static void updateHospitalName(String newHospitalName) {
        hospitalName = newHospitalName;
    }

    // Instance method to display patient details
    public void displayPatientDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        } else {
            System.out.println("Invalid patient object.");
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Creating patient objects
        Patient patient1 = new Patient("Devasheesh", 120, "Old Age", 1001);
        Patient patient2 = new Patient("Deepak", 30, "Gas", 1002);

        // Displaying initial patient details
        System.out.println("Initial Patient Details:");
        patient1.displayPatientDetails();
        System.out.println("--------------------");
        patient2.displayPatientDetails();
        System.out.println("--------------------");

        // Updating hospital name
        Patient.updateHospitalName("Government Hospital");

        // Displaying updated patient details
        System.out.println("Updated Patient Details:");
        patient1.displayPatientDetails();
        System.out.println("--------------------");
        patient2.displayPatientDetails();
        System.out.println("--------------------");

        // Displaying total patients
        Patient.getTotalPatients();
    }
}

