package day6.problem_statements.hospital_patient_management;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    // Constructor
    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    // Implement calculateBill
    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    // Implement MedicalRecord methods
    @Override
    public void addRecord(String record) {
        getMedicalRecords().add(record);
    }

    @Override
    public String viewRecords() {
        return "Medical Records: " + String.join(", ", getMedicalRecords());
    }
}

