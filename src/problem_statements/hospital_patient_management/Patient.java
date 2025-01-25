package day6.problem_statements.hospital_patient_management;

import java.util.ArrayList;
import java.util.List;

public abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private List<String> medicalRecords;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalRecords = new ArrayList<>();
    }

    // Abstract method to calculate bill
    public abstract double calculateBill();

    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Encapsulation: Getters and Setters
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected List<String> getMedicalRecords() {
        return medicalRecords;
    }
}

