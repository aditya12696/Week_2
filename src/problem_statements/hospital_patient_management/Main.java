package day6.problem_statements.hospital_patient_management;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a list of Patient objects
        List<Patient> patients = new ArrayList<>();

        // Add InPatient and OutPatient to the list
        InPatient inPatient = new InPatient("P001", "Doe", 45, 5, 2000.0);
        inPatient.addRecord("Admitted for surgery");
        inPatient.addRecord("Post-surgery recovery");

        OutPatient outPatient = new OutPatient("P002", "Smith", 30, 500.0);
        outPatient.addRecord("Routine checkup");
        outPatient.addRecord("Prescribed medication");

        patients.add(inPatient);
        patients.add(outPatient);

        // Display details and bills for all patients
        System.out.println("Patient Details and Billing:");
        double totalHospitalIncome = 0.0;

        for (Patient patient : patients) {
            System.out.println("---------------------");
            System.out.println(patient.getPatientDetails());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println(record.viewRecords());
            }

            double bill = patient.calculateBill();
            System.out.println("Total Bill: ₹" + bill);
            totalHospitalIncome += bill;
        }

        System.out.println("---------------------");
        System.out.println("Total Hospital Income: ₹" + totalHospitalIncome);
    }
}

