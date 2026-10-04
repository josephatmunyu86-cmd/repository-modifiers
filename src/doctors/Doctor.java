package doctors;

import patient.Patient;

public class Doctor {
    private String doctorName;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
    }
    public void viewMedicalInformation(Patient patient) {
        System.out.println("Doctor: " + doctorName);
        System.out.println("Patient: " + patient.getName());
        System.out.println("Medical History: " + patient.getMedicalHistory());
    }

    public void updateMedicalInformation(Patient patient, String newHistory) {
        patient.setMedicalHistory(newHistory);
    }
}
