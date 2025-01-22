package Day4;
import java.util.ArrayList;

// Hospital class (contains lists of doctors and patients)
class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor
    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor " + doctor.getName() + " added to " + hospitalName);
    }

    // Add a patient to the hospital
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added to " + hospitalName);
    }

    // Display hospital details
    public void displayHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Doctor class
class Doctor {
    private String name;
    private ArrayList<Patient> patients;

    // Constructor
    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    // Get doctor name
    public String getName() {
        return name;
    }

    // Consult a patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this);
        }
        System.out.println("Doctor " + name + " consulted Patient " + patient.getName());
    }

    // Display all patients consulted
    public void displayConsultedPatients() {
        System.out.println("Doctor " + name + " has consulted the following patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

// Patient class
class Patient {
    private String name;
    private ArrayList<Doctor> doctors;

    // Constructor
    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    // Get patient name
    public String getName() {
        return name;
    }

    // Add a doctor to the patient's list
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Display all doctors consulted
    public void displayConsultedDoctors() {
        System.out.println("Patient " + name + " has consulted the following doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- " + doctor.getName());
        }
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Health Center");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Black");
        Doctor doctor2 = new Doctor("Dr. Brown");

        // Add doctors to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Create patients
        Patient patient1 = new Patient("Aditya");
        Patient patient2 = new Patient("Johan");

        // Add patients to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Consultations
        doctor1.consult(patient1);
        doctor1.consult(patient2);
        doctor2.consult(patient1);

        // Display hospital details
        System.out.println("\nHospital Details:");
        hospital.displayHospitalDetails();

        // Display consultations
        System.out.println("\nConsultation Details:");
        doctor1.displayConsultedPatients();
        doctor2.displayConsultedPatients();
        patient1.displayConsultedDoctors();
        patient2.displayConsultedDoctors();
    }
}
