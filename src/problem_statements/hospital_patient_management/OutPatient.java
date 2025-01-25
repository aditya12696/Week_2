package day6.problem_statements.hospital_patient_management;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    // Implement calculateBill
    @Override
    public double calculateBill() {
        return consultationFee;
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
