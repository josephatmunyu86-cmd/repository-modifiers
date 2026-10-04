package patient;

public class Patient {
    private String name;
    private String appointmentDate;
    private String medicalHistory;

    public Patient(String name, String appointmentDate, String medicalHistory) {
        this.name = name;
        this.appointmentDate = appointmentDate;
        this.medicalHistory = medicalHistory;
    }
    public String getName() {
        return name;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }
}
